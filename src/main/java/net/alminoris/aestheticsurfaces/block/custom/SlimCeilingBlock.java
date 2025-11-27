package net.alminoris.aestheticsurfaces.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SlimCeilingBlock extends Block
{
    private final VoxelShape SHAPE = SlimCeilingBlock.createCuboidShape(0, 15.75, 0, 16, 16, 16);

    public SlimCeilingBlock(Settings settings)
    {
        super(settings.nonOpaque());
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SHAPE;
    }
}