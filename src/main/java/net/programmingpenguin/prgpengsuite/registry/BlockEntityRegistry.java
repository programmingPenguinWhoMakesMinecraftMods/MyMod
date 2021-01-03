package net.programmingpenguin.prgpengsuite.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.things.energy_generation.entity.*;
import net.programmingpenguin.prgpengsuite.things.miscblocks.entity.TestFactoryEntity;
import net.programmingpenguin.prgpengsuite.things.miscblocks.entity.TestStorageEntity;

public class BlockEntityRegistry {

    public static BlockEntityType<TestStorageEntity> TEST_STORAGE_ENTITY;
    public static BlockEntityType<TestFactoryEntity> TEST_FACTORY_ENTITY;
    public static BlockEntityType<AntiMatterReactorEntity> ANTI_MATTER_REACTOR_ENTITY;
    public static BlockEntityType<CoalGeneratorEntity> COAL_GENERATOR_ENTITY;
    public static BlockEntityType<FusionReactorEntity> FUSION_REACTOR_ENTITY;
    public static BlockEntityType<GasGeneratorEntity> GAS_GENERATOR_ENTITY;
    public static BlockEntityType<HydroGeneratorEntity> HYDRO_GENERATOR_ENTITY;
    public static BlockEntityType<NuclearReactorEntity> NUCLEAR_REACTOR_ENTITY;
    public static BlockEntityType<SolarPanelEntity> SOLAR_PANEL_ENTITY;
    public static BlockEntityType<WindmillEntity> WINDMILL_ENTITY;


    public static void register(){
        TEST_STORAGE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:test"), BlockEntityType.Builder.create(TestStorageEntity::new, BlockRegistry.TEST_STORAGE_BLOCK).build(null));
        TEST_FACTORY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:test2"), BlockEntityType.Builder.create(TestFactoryEntity::new, BlockRegistry.TEST_FACTORY_BLOCK).build(null));
        ANTI_MATTER_REACTOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:anti_matter_reactor"), BlockEntityType.Builder.create(AntiMatterReactorEntity::new, BlockRegistry.ANTI_MATTER_REACTOR).build(null));
        COAL_GENERATOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:coal_generator"), BlockEntityType.Builder.create(CoalGeneratorEntity::new, BlockRegistry.COAL_GENERATOR).build(null));
        FUSION_REACTOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:fusion_reactor"), BlockEntityType.Builder.create(FusionReactorEntity::new, BlockRegistry.FUSION_REACTOR).build(null));
        GAS_GENERATOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:gas_generator"), BlockEntityType.Builder.create(GasGeneratorEntity::new, BlockRegistry.GAS_GENERATOR).build(null));
        HYDRO_GENERATOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:hydro_generator"), BlockEntityType.Builder.create(HydroGeneratorEntity::new, BlockRegistry.HYDRO_GENERATOR).build(null));
        NUCLEAR_REACTOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:nuclear_reactor"), BlockEntityType.Builder.create(NuclearReactorEntity::new, BlockRegistry.NUCLEAR_REACTOR).build(null));
        SOLAR_PANEL_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:solar_panel"), BlockEntityType.Builder.create(SolarPanelEntity::new, BlockRegistry.SOLAR_PANEL).build(null));
        WINDMILL_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:windmill"), BlockEntityType.Builder.create(WindmillEntity::new, BlockRegistry.WINDMILL).build(null));

    }
}
