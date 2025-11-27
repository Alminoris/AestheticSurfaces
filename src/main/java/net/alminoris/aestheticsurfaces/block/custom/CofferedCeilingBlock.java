package net.alminoris.aestheticsurfaces.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class CofferedCeilingBlock extends WaterloggableBlock
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
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (direction == Direction.UP)
        {
            BlockPos supportPos = pos.offset(Direction.UP);

            if (!world.getBlockState(supportPos).isSolidBlock(world, supportPos))
            {
                if (world instanceof World realWorld)
                {
                    realWorld.breakBlock(pos, true);
                }
                return Blocks.AIR.getDefaultState();
            }
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
        BlockPos supportPos = pos.offset(Direction.UP);
        return world.getBlockState(supportPos).isSolidBlock(world, supportPos);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return VoxelShapes.union(SHAPE1, SHAPE2, SHAPE3, SHAPE4);
    }
}