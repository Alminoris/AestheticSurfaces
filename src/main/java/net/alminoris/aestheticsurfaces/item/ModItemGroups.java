package net.alminoris.aestheticsurfaces.item;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;
import net.alminoris.aestheticsurfaces.block.ModBlocks;
import net.alminoris.aestheticsurfaces.block.custom.YAxisRotatedCarpetBlock;
import net.alminoris.aestheticsurfaces.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
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
                        for(String name : BlockSetsHelper.getWoods())
                            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                entries.add(ModBlocks.PARQUET_CARPETS.get(name+"_"+typeName));

                        for(String name : BlockSetsHelper.getWoods())
                            for (String typeName : BlockSetsHelper.PARQUET_TYPES)
                                entries.add(ModBlocks.PARQUET_BLOCKS.get(name+"_"+typeName));

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
                    }).build());

    public static void registerItemGroups()
    {

    }
}