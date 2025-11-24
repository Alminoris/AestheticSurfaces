package net.alminoris.aestheticsurfaces.block.custom;

import net.alminoris.aestheticsurfaces.util.helper.VoxelShapeHelper;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.ArrayList;
import java.util.List;

public class WallpaperBlock extends YAxisRotatedBlock
{
    private static final VoxelShape SHAPE = WallpaperBlock.createCuboidShape(0, 0, 0, 16, 16, 1);

    public WallpaperBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        Direction facing = state.get(FACING);
        if (direction == facing)
        {
            BlockPos supportPos = pos.offset(facing);

            if (world.getBlockState(supportPos).isAir())
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

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        boxes.add(SHAPE.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
        Direction facing = state.get(FACING);
        BlockPos supportPos = pos.offset(facing);
        return !world.getBlockState(supportPos).isAir();
    }
}