package net.programmingpenguin.prgpengsuite.things.miscblocks.entity;

import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.programmingpenguin.prgpengsuite.registry.BlockEntityRegistry;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;
import net.programmingpenguin.prgpengsuite.things.abstractmethods.AbstractFactoryEntity;

public class TestFactoryEntity extends AbstractFactoryEntity {

    public TestFactoryEntity() {
        super(BlockEntityRegistry.TEST_FACTORY_ENTITY, RecipeRegistry.TEST_RECIPE);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText("container.factory");
    }
}
