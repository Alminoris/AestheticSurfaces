package net.alminoris.aestheticsurfaces.block.custom;

import net.alminoris.aestheticsurfaces.util.helper.VoxelShapeHelper;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

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

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        boxes.add(SHAPE.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }
}