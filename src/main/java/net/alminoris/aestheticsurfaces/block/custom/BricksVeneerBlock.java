package net.alminoris.aestheticsurfaces.block.custom;

import net.alminoris.aestheticsurfaces.util.helper.VoxelShapeHelper;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class BricksVeneerBlock extends WallpaperBlock
{
    private static final VoxelShape SHAPE = WallpaperBlock.createCuboidShape(0, 0, 0, 16, 16, 2);

    public BricksVeneerBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    protected VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        boxes.add(SHAPE.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }
}