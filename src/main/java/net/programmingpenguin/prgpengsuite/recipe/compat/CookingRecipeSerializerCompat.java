package net.programmingpenguin.prgpengsuite.recipe.compat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;

public class CookingRecipeSerializerCompat <T extends AbstractCookingRecipeCompat> implements RecipeSerializer<T> {
    public final int cookingTime;
    public final CookingRecipeSerializerCompat.RecipeFactory<T> recipeFactory;

    public CookingRecipeSerializerCompat(CookingRecipeSerializerCompat.RecipeFactory<T> recipeFactory, int cookingTime) {
        this.cookingTime = cookingTime;
        this.recipeFactory = recipeFactory;
    }

    public T read(Identifier identifier, JsonObject jsonObject) {
        String string = JsonHelper.getString(jsonObject, "group", "");
        JsonElement jsonElement = JsonHelper.hasArray(jsonObject, "ingredient") ? JsonHelper.getArray(jsonObject, "ingredient") : JsonHelper.getObject(jsonObject, "ingredient");
        Ingredient ingredient = Ingredient.fromJson((JsonElement)jsonElement);
        String string2 = JsonHelper.getString(jsonObject, "result");
        Identifier identifier2 = new Identifier(string2);
        ItemStack itemStack = new ItemStack((ItemConvertible) Registry.ITEM.getOrEmpty(identifier2).orElseThrow(() -> {
            return new IllegalStateException("Item: " + string2 + " does not exist");
        }));
        float f = JsonHelper.getFloat(jsonObject, "experience", 0.0F);
        int i = JsonHelper.getInt(jsonObject, "cookingtime", this.cookingTime);
        return this.recipeFactory.create(identifier, string, ingredient, itemStack, f, i);
    }

    public T read(Identifier identifier, PacketByteBuf packetByteBuf) {
        String string = packetByteBuf.readString(32767);
        Ingredient ingredient = Ingredient.fromPacket(packetByteBuf);
        ItemStack itemStack = packetByteBuf.readItemStack();
        float f = packetByteBuf.readFloat();
        int i = packetByteBuf.readVarInt();
        return this.recipeFactory.create(identifier, string, ingredient, itemStack, f, i);
    }

    public void write(PacketByteBuf packetByteBuf, T abstractCookingRecipe) {
        packetByteBuf.writeString(AbstractCookingRecipeCompat.group);
        AbstractCookingRecipeCompat.input.write(packetByteBuf);
        packetByteBuf.writeItemStack(AbstractCookingRecipeCompat.output);
        packetByteBuf.writeFloat(AbstractCookingRecipeCompat.experience);
        packetByteBuf.writeVarInt(AbstractCookingRecipeCompat.cookTime);
    }

    public interface RecipeFactory<T extends AbstractCookingRecipeCompat> {
        T create(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime);
    }
}
