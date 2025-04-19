package net.alminoris.aestheticsurfaces;

import net.alminoris.aestheticsurfaces.datagen.ModBlockTagProvider;
import net.alminoris.aestheticsurfaces.datagen.ModLootTableProvider;
import net.alminoris.aestheticsurfaces.datagen.ModModelProvider;
import net.alminoris.aestheticsurfaces.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticSurfacesDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
	}
}