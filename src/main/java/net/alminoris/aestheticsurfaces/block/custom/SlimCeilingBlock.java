package net.alminoris.aestheticsurfaces.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class SlimCeilingBlock extends WaterloggableBlock
{
    private final VoxelShape SHAPE = SlimCeilingBlock.createCuboidShape(0, 15.75, 0, 16, 16, 16);

    public SlimCeilingBlock(Settings settings)
    {
        super(settings.nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false));
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
        return SHAPE;
    }
}