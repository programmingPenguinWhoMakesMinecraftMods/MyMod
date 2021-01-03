package net.programmingpenguin.prgpengsuite.registry;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.*;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.recipe.energy_generation.*;
import net.programmingpenguin.prgpengsuite.recipe.TestRecipe;
import net.programmingpenguin.prgpengsuite.recipe.compat.CookingRecipeSerializerCompat;

public class RecipeRegistry {

    public static RecipeType<TestRecipe> TEST_RECIPE;
    public static RecipeSerializer<TestRecipe> TEST_RECIPE_SERIALIZER;

    public static RecipeType<SolarPanelRecipe> SOLAR_PANEL;
    public static RecipeSerializer<SolarPanelRecipe> SOLAR_PANEL_SERIALIZER;

    public static RecipeType<AntiMatterReactorRecipe> ANTI_MATTER_REACTOR;
    public static RecipeSerializer<AntiMatterReactorRecipe> ANTI_MATTER_REACTOR_SERIALIZER;

    public static RecipeType<CoalGeneratorRecipe> COAL_GENERATOR;
    public static RecipeSerializer<CoalGeneratorRecipe> COAL_GENERATOR_SERIALIZER;

    public static RecipeType<FusionReactorRecipe> FUSION_REACTOR;
    public static RecipeSerializer<FusionReactorRecipe> FUSION_REACTOR_SERIALIZER;

    public static RecipeType<GasGeneratorRecipe> GAS_GENERATOR;
    public static RecipeSerializer<GasGeneratorRecipe> GAS_GENERATOR_SERIALIZER;

    public static RecipeType<HydroGeneratorRecipe> HYDRO_GENERATOR;
    public static RecipeSerializer<HydroGeneratorRecipe> HYDRO_GENERATOR_SERIALIZER;

    public static RecipeType<NuclearReactorRecipe> NUCLEAR_REACTOR;
    public static RecipeSerializer<NuclearReactorRecipe> NUCLEAR_REACTOR_SERIALIZER;

    public static RecipeType<WindmillRecipe> WINDMILL;
    public static RecipeSerializer<WindmillRecipe> WINDMILL_SERIALIZER;

    public static void init() {
        TEST_RECIPE = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:test"), new RecipeType<TestRecipe>() {
            public String toString() {
                return "penguin:test";
            }
        });
        TEST_RECIPE_SERIALIZER = RecipeSerializer.register("penguin:test", new CookingRecipeSerializerCompat(TestRecipe::new, 200));

        SOLAR_PANEL = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:solar"), new RecipeType<SolarPanelRecipe>() {
            public String toString() {
                return "penguin:solar";
            }
        });
        SOLAR_PANEL_SERIALIZER = RecipeSerializer.register("penguin:solar", new CookingRecipeSerializerCompat(SolarPanelRecipe::new, 200));

        //ANTI_MATTER
        ANTI_MATTER_REACTOR = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:anti_matter"), new RecipeType<AntiMatterReactorRecipe>() {
            public String toString() {
                return "penguin:anti_matter";
            }
        });
        ANTI_MATTER_REACTOR_SERIALIZER = RecipeSerializer.register("penguin:anti_matter", new CookingRecipeSerializerCompat(AntiMatterReactorRecipe::new, 200));

        //COAL
        COAL_GENERATOR = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:coal_generator"), new RecipeType<CoalGeneratorRecipe>() {
            public String toString() {
                return "penguin:coal_generator";
            }
        });
        COAL_GENERATOR_SERIALIZER = RecipeSerializer.register("penguin:coal_generator", new CookingRecipeSerializerCompat(CoalGeneratorRecipe::new, 200));

        //FUSION
        FUSION_REACTOR = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:fusion"), new RecipeType<FusionReactorRecipe>() {
            public String toString() {
                return "penguin:fusion";
            }
        });
        FUSION_REACTOR_SERIALIZER = RecipeSerializer.register("penguin:fusion", new CookingRecipeSerializerCompat(FusionReactorRecipe::new, 200));

        //GAS
        GAS_GENERATOR = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:gas"), new RecipeType<GasGeneratorRecipe>() {
            public String toString() {
                return "penguin:gas";
            }
        });
        GAS_GENERATOR_SERIALIZER = RecipeSerializer.register("penguin:gas", new CookingRecipeSerializerCompat(GasGeneratorRecipe::new, 200));

        //HYDRO
        HYDRO_GENERATOR = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:hydro"), new RecipeType<HydroGeneratorRecipe>() {
            public String toString() {
                return "penguin:hydro";
            }
        });
        HYDRO_GENERATOR_SERIALIZER = RecipeSerializer.register("penguin:hydro", new CookingRecipeSerializerCompat(HydroGeneratorRecipe::new, 200));

        //NUCLEAR
        NUCLEAR_REACTOR = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:nuclear"), new RecipeType<NuclearReactorRecipe>() {
            public String toString() {
                return "penguin:nuclear";
            }
        });
        NUCLEAR_REACTOR_SERIALIZER = RecipeSerializer.register("penguin:nuclear", new CookingRecipeSerializerCompat(NuclearReactorRecipe::new, 200));

        //WINDMILL
        WINDMILL = Registry.register(Registry.RECIPE_TYPE, new Identifier("penguin:windmill"), new RecipeType<WindmillRecipe>() {
            public String toString() {
                return "penguin:windmill";
            }
        });
        WINDMILL_SERIALIZER = RecipeSerializer.register("penguin:windmill", new CookingRecipeSerializerCompat(WindmillRecipe::new, 200));
    }
}