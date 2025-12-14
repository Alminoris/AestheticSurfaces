package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.ModTags;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;


public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    protected void generateTags()
    {
        for(String name : BlockSetsHelper.getWoods())
            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                getOrCreateTagBuilder(ModTags.Items.PARQUET_CARPETS)
                        .add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName).asItem());
    }
}