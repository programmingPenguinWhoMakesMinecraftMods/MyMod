package net.programmingpenguin.prgpengsuite.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.things.blocks.entity.TestFactoryEntity;
import net.programmingpenguin.prgpengsuite.things.blocks.entity.TestStorageEntity;

public class BlockEntityRegistry {

    public static BlockEntityType<TestStorageEntity> TEST_STORAGE_ENTITY;
    public static BlockEntityType<TestFactoryEntity> TEST_FACTORY_ENTITY;

    public static void register(){
        TEST_STORAGE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:test"), BlockEntityType.Builder.create(TestStorageEntity::new, BlockRegistry.TEST_STORAGE_BLOCK).build(null));
        TEST_FACTORY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("penguin:test2"), BlockEntityType.Builder.create(TestFactoryEntity::new, BlockRegistry.TEST_FACTORY_BLOCK).build(null));
    }
}
