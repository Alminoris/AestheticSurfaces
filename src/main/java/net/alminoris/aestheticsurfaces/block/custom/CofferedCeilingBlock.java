package net.alminoris.aestheticsurfaces.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CofferedCeilingBlock extends Block
{
    private final VoxelShape SHAPE1 = CofferedCeilingBlock.createCuboidShape(0, 13, 0, 1.5f, 16, 16);

    private final VoxelShape SHAPE2 = CofferedCeilingBlock.createCuboidShape(14.5f, 13, 0, 16, 16, 16);

    private final VoxelShape SHAPE3 = CofferedCeilingBlock.createCuboidShape(1.5f, 13, 14.5f, 14.5f, 16, 16);

    private final VoxelShape SHAPE4 = CofferedCeilingBlock.createCuboidShape(1.5f, 13, 0, 14.5f, 16, 1.5f);

    public CofferedCeilingBlock(Settings settings)
    {
        super(settings.nonOpaque());
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return VoxelShapes.union(SHAPE1, SHAPE2, SHAPE3, SHAPE4);
    }
}