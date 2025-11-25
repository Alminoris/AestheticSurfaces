package net.alminoris.aestheticsurfaces.util.helper;

import net.alminoris.aestheticsurfaces.AestheticSurfaces;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void createBlockModel(String jsonContent, String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSurfaces.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        name = name.replace("_block", "").replace("_wallpaper", "_carpet");

        jsonContent = jsonContent.replace("NAME", "aestheticsurfaces:block/"+name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createWallpaperBlockModel(String jsonContent, String name, String colorName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSurfaces.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", "minecraft:block/"+colorName+"_wool");

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createYAxisRotatedBlockState(String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSurfaces.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.YAXIS_ROTATED_BLOCKSTATE_TEMPLATE.replace("NAME", name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createStonecuttingRecipe(String ingredientName, String outputName, String count)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/data/"+ AestheticSurfaces.MOD_ID+"/recipe/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = outputName + "_from_" + ingredientName.split(":")[1] + "_stonecutting.json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.STONECUTTING_RECIPE.replace("COUNT", count)
                .replace("INGREDIENT_NAME", ingredientName).replace("OUTPUT_NAME", outputName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}