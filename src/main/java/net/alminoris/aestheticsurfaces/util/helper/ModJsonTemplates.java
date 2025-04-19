package net.alminoris.aestheticsurfaces.util.helper;

public class ModJsonTemplates
{
    public static String YAXIS_ROTATED_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticsurfaces:block/NAME" },
                "facing=south": { "model": "aestheticsurfaces:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticsurfaces:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticsurfaces:block/NAME", "y": 90 }
              }
            }
            """;

    public static String CARPET_MODEL_TEMPLATE = """
            {
              "parent": "minecraft:block/carpet",
              "textures": {
                "wool": "NAME"
              }
            }
            """;

    public static String WALLPAPER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 16, 1],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1], "texture": "#0"}
            			}
            		}
            	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [0, 1.75, 4.75],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [0, 1.75, 4.75],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [0, 1.75, 4.75],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [0, 1.75, 4.75],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 2, 4],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, 45, 0],
             			"translation": [3.5, -1, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 4.5],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	}
            }
            """;

    public static String CARPET_BLOCK_MODEL_TEMPLATE = """
            {
              "parent": "minecraft:block/cube_all",
              "textures": {
                "all": "NAME"
              }
            }
            """;
}