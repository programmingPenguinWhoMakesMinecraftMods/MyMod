package net.programmingpenguin.prgpengsuite.things.energy_generation.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.programmingpenguin.prgpengsuite.things.abstractmethods.AbstractEnergyBlock;
import net.programmingpenguin.prgpengsuite.things.energy_generation.entity.WindmillEntity;

public class WindmillBlock extends AbstractEnergyBlock {

    public WindmillBlock(
    AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof WindmillEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory) blockEntity);
        }
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new WindmillEntity();
    }
}
