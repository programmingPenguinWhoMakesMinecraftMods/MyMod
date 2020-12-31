package net.programmingpenguin.prgpengsuite.registry;

import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.recipe.TestRecipe;
import net.programmingpenguin.prgpengsuite.recipe.compat.CookingRecipeSerializerCompat;

public class RecipeRegistry {

    public static RecipeType<TestRecipe> TEST_RECIPE;
    public static RecipeSerializer<TestRecipe> TEST_RECIPE_SERIALIZER;

    public static void init() {
        TEST_RECIPE = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:test"), new RecipeType<TestRecipe>() {
            public String toString() {
                return "penguin:test";
            }
        });
        TEST_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, "penguin:test", new CookingRecipeSerializerCompat<>(TestRecipe::new, 200));
    }
}
