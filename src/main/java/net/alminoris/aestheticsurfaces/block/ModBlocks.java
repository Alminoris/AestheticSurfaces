package net.alminoris.aestheticsurfaces.block;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.custom.WallpaperBlock;
import net.alminoris.aestheticsurfaces.block.custom.YAxisRotatedBlock;
import net.alminoris.aestheticsurfaces.block.custom.YAxisRotatedCarpetBlock;
import net.alminoris.aestheticsurfaces.item.ModItemGroups;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> SIMPLE_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("simple_carpet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_CARPET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("simple_carpet_"+name+"_block", new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> SIMPLE_WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("simple_wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> SMOOTH_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("smooth_carpet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> SMOOTH_WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("smooth_wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> SMOOTH_CARPET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("smooth_carpet_"+name+"_block", new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> TRANSITIONAL_CARPETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("transitional_carpet_"+name, new YAxisRotatedCarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> TRANSITIONAL_CARPET_BLOCKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("transitional_carpet_"+name+"_block", new YAxisRotatedBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> TRANSITIONAL_WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("transitional_wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static final Dictionary<String, Block> WALLPAPERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerBlock("wallpaper_"+name, new WallpaperBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(AestheticSurfaces.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registry.ITEM, new Identifier(AestheticSurfaces.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroups.ASURF_TAB)));
    }

    public static void registerBlocks()
    {

    }
}