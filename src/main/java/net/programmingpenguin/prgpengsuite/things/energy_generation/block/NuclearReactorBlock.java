package net.programmingpenguin.prgpengsuite.things.energy_generation.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.programmingpenguin.prgpengsuite.things.abstractmethods.AbstractEnergyBlock;
import net.programmingpenguin.prgpengsuite.things.energy_generation.entity.NuclearReactorEntity;

public class NuclearReactorBlock extends AbstractEnergyBlock {

    public NuclearReactorBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof NuclearReactorEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory) blockEntity);
        }
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new NuclearReactorEntity();
    }
}
