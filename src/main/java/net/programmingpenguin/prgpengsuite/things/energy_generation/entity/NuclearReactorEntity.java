package net.programmingpenguin.prgpengsuite.things.energy_generation.entity;

import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.programmingpenguin.prgpengsuite.registry.BlockEntityRegistry;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;
import net.programmingpenguin.prgpengsuite.things.abstractmethods.AbstractEnergyEntity;

public class NuclearReactorEntity extends AbstractEnergyEntity {

    public NuclearReactorEntity() {
        super(BlockEntityRegistry.TEST_FACTORY_ENTITY, RecipeRegistry.TEST_RECIPE);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText("Nuclear Reactor");
    }
}
