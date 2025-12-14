package net.alminoris.aestheticsurfaces.block.custom;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class ParquetBlock extends YAxisRotatedBlock
{
    public ParquetBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state)
    {
        super.onBroken(world, pos, state);

        if (!world.isClient())
        {
            world.setBlockState(pos, ModBlocks.SMOOTH_STONE_ROAD.getDefaultState(), 3);
        }
    }
}