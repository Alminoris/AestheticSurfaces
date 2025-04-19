package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
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