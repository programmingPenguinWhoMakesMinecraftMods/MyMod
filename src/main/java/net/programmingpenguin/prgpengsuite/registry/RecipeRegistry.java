package net.programmingpenguin.prgpengsuite.registry;

import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.compat.Compat;
import net.programmingpenguin.prgpengsuite.recipe.NewIndustrialRecipe;

public class RecipeRegistry {

    public static RecipeSerializer NEW_SERIALIZER;
    public static RecipeType<NewIndustrialRecipe> NEW_RECIPE;

    public static void init() {
        NEW_RECIPE = Registry.register(Registry.RECIPE_TYPE, new Identifier("prg:test"), new RecipeType<NewIndustrialRecipe>() {
            public String toString() {
                return "prg:test";
            }
        });
        NEW_SERIALIZER = RecipeSerializer.register("prg:test", new Compat(NewIndustrialRecipe::new, 200) {
        });
    }
}