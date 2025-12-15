package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.ModTags;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tag.BlockTags;

import static net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper.COLORS;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    protected void generateTags()
    {
        for (String name : COLORS)
        {
            getOrCreateTagBuilder(BlockTags.WOOL)
                    .add(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name))
                    .add(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name))
                    .add(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name));

            getOrCreateTagBuilder(BlockTags.CARPETS)
                    .add(ModBlocks.SIMPLE_CARPETS.get(name))
                    .add(ModBlocks.SMOOTH_CARPETS.get(name))
                    .add(ModBlocks.TRANSITIONAL_CARPETS.get(name));
        }

        for(String name : BlockSetsHelper.getWoods())
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                getOrCreateTagBuilder(ModTags.Blocks.PARQUET_CARPETS)
                        .add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
    }
}