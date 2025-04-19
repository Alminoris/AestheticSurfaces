package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.COLORS)
        {
            addDrop(ModBlocks.SIMPLE_CARPETS.get(name));
            addDrop(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name));
            addDrop(ModBlocks.SMOOTH_CARPETS.get(name));
            addDrop(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name));
            addDrop(ModBlocks.TRANSITIONAL_CARPETS.get(name));
            addDrop(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name));
            addDrop(ModBlocks.SIMPLE_WALLPAPERS.get(name));
            addDrop(ModBlocks.SMOOTH_WALLPAPERS.get(name));
            addDrop(ModBlocks.TRANSITIONAL_WALLPAPERS.get(name));
            addDrop(ModBlocks.WALLPAPERS.get(name));
        }
    }
}