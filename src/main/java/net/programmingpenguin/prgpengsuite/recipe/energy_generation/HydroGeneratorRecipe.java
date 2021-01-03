package net.programmingpenguin.prgpengsuite.recipe.energy_generation;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.programmingpenguin.prgpengsuite.recipe.compat.AbstractCookingRecipeCompat;
import net.programmingpenguin.prgpengsuite.registry.BlockRegistry;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;

public class HydroGeneratorRecipe extends AbstractCookingRecipeCompat {
    public HydroGeneratorRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(RecipeRegistry.HYDRO_GENERATOR, id, group, input, output, experience, cookTime);
    }

    @Environment(EnvType.CLIENT)
    public ItemStack getRecipeKindIcon() {
        return new ItemStack(BlockRegistry.HYDRO_GENERATOR);
    }

    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.HYDRO_GENERATOR_SERIALIZER;
    }
}
