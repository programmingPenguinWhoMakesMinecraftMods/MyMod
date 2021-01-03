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

public class FusionReactorRecipe extends AbstractCookingRecipeCompat {
    public FusionReactorRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(RecipeRegistry.FUSION_REACTOR, id, group, input, output, experience, cookTime);
    }

    @Environment(EnvType.CLIENT)
    public ItemStack getRecipeKindIcon() {
        return new ItemStack(BlockRegistry.FUSION_REACTOR);
    }

    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.FUSION_REACTOR_SERIALIZER;
    }
}
