package net.alminoris.aestheticsurfaces.datagen;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.alminoris.aestheticsurfaces.util.helper.ModJsonHelper;
import net.alminoris.aestheticsurfaces.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.COLORS)
        {
            registerWallpaper(blockStateModelGenerator, ModBlocks.WALLPAPERS.get(name), name);
            registerWoolCarpetAndWallpaper(blockStateModelGenerator, ModBlocks.SIMPLE_CARPET_BLOCKS.get(name), ModBlocks.SIMPLE_CARPETS.get(name), ModBlocks.SIMPLE_WALLPAPERS.get(name));
            registerWoolCarpetAndWallpaper(blockStateModelGenerator, ModBlocks.SMOOTH_CARPET_BLOCKS.get(name), ModBlocks.SMOOTH_CARPETS.get(name), ModBlocks.SMOOTH_WALLPAPERS.get(name));
            registerWoolCarpetAndWallpaper(blockStateModelGenerator, ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name), ModBlocks.TRANSITIONAL_CARPETS.get(name), ModBlocks.TRANSITIONAL_WALLPAPERS.get(name));
        }
    }

    public final void registerWoolCarpetAndWallpaper(BlockStateModelGenerator blockStateModelGenerator, Block wool, Block carpet, Block... wallpaper)
    {
        ModJsonHelper.createBlockModel(ModJsonTemplates.CARPET_BLOCK_MODEL_TEMPLATE, Registry.BLOCK.getId(wool).getPath());
        ModJsonHelper.createYAxisRotatedBlockState(Registry.BLOCK.getId(wool).getPath());
        blockStateModelGenerator.registerParentedItemModel(wool, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registry.BLOCK.getId(wool).getPath()));

        ModJsonHelper.createBlockModel(ModJsonTemplates.CARPET_MODEL_TEMPLATE, Registry.BLOCK.getId(carpet).getPath());
        ModJsonHelper.createYAxisRotatedBlockState(Registry.BLOCK.getId(carpet).getPath());
        blockStateModelGenerator.registerParentedItemModel(carpet, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registry.BLOCK.getId(carpet).getPath()));

        if (wallpaper.length > 0)
        {
            ModJsonHelper.createBlockModel(ModJsonTemplates.WALLPAPER_MODEL_TEMPLATE, Registry.BLOCK.getId(wallpaper[0]).getPath());
            ModJsonHelper.createYAxisRotatedBlockState(Registry.BLOCK.getId(wallpaper[0]).getPath());
            blockStateModelGenerator.registerParentedItemModel(wallpaper[0], Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registry.BLOCK.getId(wallpaper[0]).getPath()));
        }
    }

    public final void registerWallpaper(BlockStateModelGenerator blockStateModelGenerator, Block wallpaper, String colorName)
    {
        ModJsonHelper.createWallpaperBlockModel(ModJsonTemplates.WALLPAPER_MODEL_TEMPLATE, Registry.BLOCK.getId(wallpaper).getPath(), colorName);
        ModJsonHelper.createYAxisRotatedBlockState(Registry.BLOCK.getId(wallpaper).getPath());
        blockStateModelGenerator.registerParentedItemModel(wallpaper, Identifier.of(AestheticSurfaces.MOD_ID, "block/"+Registry.BLOCK.getId(wallpaper).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

    }
}