package net.programmingpenguin.prgpengsuite.recipe;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.programmingpenguin.prgpengsuite.recipe.compat.AbstractCookingRecipeCompat;
import net.programmingpenguin.prgpengsuite.registry.BlockRegistry;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;

public class TestRecipe extends AbstractCookingRecipeCompat {
    public TestRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(RecipeRegistry.TEST_RECIPE, id, group, input, output, experience, cookTime);
    }

    @Environment(EnvType.CLIENT)
    public ItemStack getRecipeKindIcon() {
        return new ItemStack(BlockRegistry.TEST_FACTORY_BLOCK);
    }

    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.TEST_RECIPE_SERIALIZER;
    }
}
