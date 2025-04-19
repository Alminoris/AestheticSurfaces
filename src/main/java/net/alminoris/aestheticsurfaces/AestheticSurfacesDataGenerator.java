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
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}