package net.programmingpenguin.prgpengsuite.things.miscblocks.factory;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.programmingpenguin.prgpengsuite.things.abstractmethods.AbstractFactoryBlock;
import net.programmingpenguin.prgpengsuite.things.miscblocks.entity.TestFactoryEntity;

public class TestFactoryBlock extends AbstractFactoryBlock {

    public TestFactoryBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof TestFactoryEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
        }
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new TestFactoryEntity();
    }
}
