package net.alminoris.aestheticsurfaces.block.custom;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PathBlock extends Block
{
    private final VoxelShape SHAPE = PathBlock.createCuboidShape(0, 0, 0, 16, 15, 16);

    public PathBlock(Settings settings)
    {
        super(settings.nonOpaque());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (!world.isClient && stack.isIn(ModTags.Items.PARQUET_CARPETS))
        {
            String woodName = Registries.ITEM.getId(stack.getItem()).getPath().replace("_parquet_", "-").split("-")[1];
            String typeName = Registries.ITEM.getId(stack.getItem()).getPath().replace("_parquet_", "-").split("-")[0];

            stack.decrement(1);

            world.setBlockState(pos, ModBlocks.PARQUET_BLOCKS.get(woodName+"_"+typeName).getDefaultState()
                    .with(ParquetBlock.FACING, player.getHorizontalFacing()), 3);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }
}