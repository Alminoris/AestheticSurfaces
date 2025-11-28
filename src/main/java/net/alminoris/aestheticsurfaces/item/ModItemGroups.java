package net.alminoris.aestheticsurfaces.item;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.block.custom.YAxisRotatedCarpetBlock;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup ASURF_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticSurfaces.MOD_ID, "asurftab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.asurftab"))
                    .icon(() -> new ItemStack(ModBlocks.SIMPLE_CARPETS.get("white"))).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.COLORS)
                                entries.add(ModBlocks.COFFERED_CEILINGS.get(name));

                        for(String name : BlockSetsHelper.CEILING_TYPES)
                            entries.add(ModBlocks.SLIM_CEILINGS.get(name));

                        for(String name : BlockSetsHelper.BRICKS_NAMES)
                            entries.add(ModBlocks.BRICKS_VENEERS.get(name));

                        entries.add(ModBlocks.SMOOTH_STONE_ROAD);

                        for(String name : BlockSetsHelper.WOODS)
                            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : BlockSetsHelper.WT_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : BlockSetsHelper.ST_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : BlockSetsHelper.MT_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));
                        }

                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SIMPLE_CARPETS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SIMPLE_WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SIMPLE_CARPET_BLOCKS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SMOOTH_CARPETS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SMOOTH_WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.SMOOTH_CARPET_BLOCKS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.TRANSITIONAL_CARPETS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.TRANSITIONAL_WALLPAPERS.get(name));
                        for(String name : BlockSetsHelper.COLORS)
                            entries.add(ModBlocks.TRANSITIONAL_CARPET_BLOCKS.get(name));

                        for(String name : BlockSetsHelper.WOODS)
                            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : BlockSetsHelper.WT_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : BlockSetsHelper.ST_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : BlockSetsHelper.MT_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
                                for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                    entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}