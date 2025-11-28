package net.alminoris.aestheticsurfaces.util.helper;

public class ModJsonTemplates
{
    public static String STONECUTTING_RECIPE = """
            {
              "type": "minecraft:stonecutting",
              "ingredient": {
                "item": "INGREDIENT_NAME"
              },
              "result": {
                "count": COUNT,
                "id": "aestheticsurfaces:OUTPUT_NAME"
              }
            }
            """;

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

    public static String PARQUET_BLOCK_MODEL_TEMPLATE = """
            {
                "parent": "minecraft:block/block",
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "minecraft:block/smooth_stone",
            		"1": "NAME",
            		"particle": "minecraft:block/smooth_stone"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 15, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 1, 16, 16], "texture": "#0"},
            				"east": {"uv": [0, 1, 16, 16], "texture": "#0"},
            				"south": {"uv": [0, 1, 16, 16], "texture": "#0"},
            				"west": {"uv": [0, 1, 16, 16], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 16, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 16, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#1"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#1"}
            			}
            		}
            	]
            }
            """;

    public static String PATH_BLOCK_MODEL_TEMPLATE = """
            {
                "parent": "minecraft:block/block",
             	"format_version": "1.9.0",
             	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [16, 15, 16],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8]},
             			"faces": {
             				"north": {"uv": [0, 1, 16, 16], "texture": "#0"},
             				"east": {"uv": [0, 1, 16, 16], "texture": "#0"},
             				"south": {"uv": [0, 1, 16, 16], "texture": "#0"},
             				"west": {"uv": [0, 1, 16, 16], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
             			}
             		}
             	]
            }
            """;

    public static String SLIM_CEILING = """
            {
                "parent": "minecraft:block/block",
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "aestheticsurfaces:block/NAME_ceiling",
            		"particle": "aestheticsurfaces:block/NAME_ceiling"
            	},
            	"elements": [
            		{
            			"from": [0, 15.75, 0],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.875, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 16], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 16], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String COFFERED_CEILING = """
            {
                "parent": "minecraft:block/block",
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 13, 0],
            			"to": [16, 16, 1.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 0.75]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 14.5],
            			"to": [16, 16, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.5, 15.25]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 1.5],
            			"to": [1.5, 16, 14.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.75, 14.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 13, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 13, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 1.5, 13], "texture": "#0"},
            				"down": {"uv": [0, 0, 1.5, 13], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14.5, 13, 1.5],
            			"to": [16, 16, 14.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.25, 14.5, 8]},
            			"faces": {
            				"north": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 13, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 1.5, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 13, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 1.5, 13], "texture": "#0"},
            				"down": {"uv": [0, 0, 1.5, 13], "texture": "#0"}
            			}
            		}
            	]
            }
            """;

    public static String BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"textures": {
                		"0": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [4, 13, 1],
                			"to": [11, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 14.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 11], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 11], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 10, 11, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 9, 1],
                			"to": [7, 12, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 10.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 11], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 11], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 10, 11, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [8, 9, 1],
                			"to": [15, 12, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [11.5, 10.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 11], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 11], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 10, 11, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [4, 5, 1],
                			"to": [11, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 6.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 11], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 11], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 10, 11, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 1, 1],
                			"to": [7, 4, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 2.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 11], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 11], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 10, 11, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [8, 1, 1],
                			"to": [15, 4, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [11.5, 2.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 11], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 11], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 11], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 10, 11, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 13, 1],
                			"to": [3, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 14.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 8, 3, 11], "texture": "#0"},
                				"east": {"uv": [2, 8, 3, 11], "texture": "#0"},
                				"south": {"uv": [0, 8, 3, 11], "texture": "#0"},
                				"west": {"uv": [0, 8, 1, 11], "texture": "#0"},
                				"up": {"uv": [0, 8, 3, 9], "texture": "#0"},
                				"down": {"uv": [0, 10, 3, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 5, 1],
                			"to": [3, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 6.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 8, 3, 11], "texture": "#0"},
                				"east": {"uv": [2, 8, 3, 11], "texture": "#0"},
                				"south": {"uv": [0, 8, 3, 11], "texture": "#0"},
                				"west": {"uv": [0, 8, 1, 11], "texture": "#0"},
                				"up": {"uv": [0, 8, 3, 9], "texture": "#0"},
                				"down": {"uv": [0, 10, 3, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [12, 13, 1],
                			"to": [16, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14, 14.5, 1.5]},
                			"faces": {
                				"north": {"uv": [12, 8, 16, 11], "texture": "#0"},
                				"east": {"uv": [15, 8, 16, 11], "texture": "#0"},
                				"south": {"uv": [12, 8, 16, 11], "texture": "#0"},
                				"west": {"uv": [12, 8, 13, 11], "texture": "#0"},
                				"up": {"uv": [12, 8, 16, 9], "texture": "#0"},
                				"down": {"uv": [12, 10, 16, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [12, 5, 1],
                			"to": [16, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14, 6.5, 1.5]},
                			"faces": {
                				"north": {"uv": [12, 8, 16, 11], "texture": "#0"},
                				"east": {"uv": [15, 8, 16, 11], "texture": "#0"},
                				"south": {"uv": [12, 8, 16, 11], "texture": "#0"},
                				"west": {"uv": [12, 8, 13, 11], "texture": "#0"},
                				"up": {"uv": [12, 8, 16, 9], "texture": "#0"},
                				"down": {"uv": [12, 10, 16, 11], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [16, 0, 0, 16], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#0"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#0"}
                			}
                		}
                	]
            }
            """;

    public static String STONE_BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"parent": "stone_bricks_veneer",
                	"textures": {
                		"0": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#0"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 1, 1],
                			"to": [7, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 8, 7, 15], "texture": "#0"},
                				"east": {"uv": [6, 8, 7, 15], "texture": "#0"},
                				"south": {"uv": [0, 8, 7, 15], "texture": "#0"},
                				"west": {"uv": [0, 8, 1, 15], "texture": "#0"},
                				"up": {"uv": [0, 8, 7, 9], "texture": "#0"},
                				"down": {"uv": [0, 14, 7, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [8, 1, 1],
                			"to": [16, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [12, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [8, 8, 16, 15], "texture": "#0"},
                				"east": {"uv": [15, 8, 16, 15], "texture": "#0"},
                				"south": {"uv": [8, 8, 16, 15], "texture": "#0"},
                				"west": {"uv": [8, 8, 9, 15], "texture": "#0"},
                				"up": {"uv": [8, 8, 16, 9], "texture": "#0"},
                				"down": {"uv": [8, 14, 16, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 9, 1],
                			"to": [15, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 15, 7], "texture": "#0"},
                				"east": {"uv": [14, 0, 15, 7], "texture": "#0"},
                				"south": {"uv": [0, 0, 15, 7], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 7], "texture": "#0"},
                				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
                				"down": {"uv": [0, 6, 15, 7], "texture": "#0"}
                			}
                		}
                	]   
            }
            """;

    public static String END_STONE_BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"textures": {
                		"0": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#0"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 1, 1],
                			"to": [7, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 8, 7, 15], "texture": "#0"},
                				"east": {"uv": [6, 8, 7, 15], "texture": "#0"},
                				"south": {"uv": [0, 8, 7, 15], "texture": "#0"},
                				"west": {"uv": [0, 8, 1, 15], "texture": "#0"},
                				"up": {"uv": [0, 8, 7, 9], "texture": "#0"},
                				"down": {"uv": [0, 14, 7, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [10, 1, 1],
                			"to": [16, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [13, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [10, 8, 16, 15], "texture": "#0"},
                				"east": {"uv": [15, 8, 16, 15], "texture": "#0"},
                				"south": {"uv": [10, 8, 16, 15], "texture": "#0"},
                				"west": {"uv": [10, 8, 11, 15], "texture": "#0"},
                				"up": {"uv": [10, 8, 16, 9], "texture": "#0"},
                				"down": {"uv": [10, 14, 16, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [1, 9, 1],
                			"to": [14, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [1, 0, 14, 7], "texture": "#0"},
                				"east": {"uv": [13, 0, 14, 7], "texture": "#0"},
                				"south": {"uv": [1, 0, 14, 7], "texture": "#0"},
                				"west": {"uv": [1, 0, 2, 7], "texture": "#0"},
                				"up": {"uv": [1, 0, 14, 1], "texture": "#0"},
                				"down": {"uv": [1, 6, 14, 7], "texture": "#0"}
                			}
                		},
                		{
                			"from": [7, 2, 1],
                			"to": [8, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 4.5, 1]},
                			"faces": {
                				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
                				"east": {"uv": [7, 9, 8, 14], "texture": "#0"},
                				"south": {"uv": [7, 9, 8, 14], "texture": "#0"},
                				"west": {"uv": [7, 9, 8, 14], "texture": "#0"},
                				"up": {"uv": [7, 9, 8, 10], "texture": "#0"},
                				"down": {"uv": [7, 13, 8, 14], "texture": "#0"}
                			}
                		},
                		{
                			"from": [9, 2, 1],
                			"to": [10, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [9.5, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [9, 9, 10, 14], "texture": "#0"},
                				"east": {"uv": [9, 9, 10, 14], "texture": "#0"},
                				"south": {"uv": [9, 9, 10, 14], "texture": "#0"},
                				"west": {"uv": [9, 9, 10, 14], "texture": "#0"},
                				"up": {"uv": [9, 9, 10, 10], "texture": "#0"},
                				"down": {"uv": [9, 13, 10, 14], "texture": "#0"}
                			}
                		},
                		{
                			"from": [14, 10, 1],
                			"to": [15, 15, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [14, 1, 15, 6], "texture": "#0"},
                				"east": {"uv": [14, 1, 15, 6], "texture": "#0"},
                				"south": {"uv": [14, 1, 15, 6], "texture": "#0"},
                				"west": {"uv": [14, 1, 15, 6], "texture": "#0"},
                				"up": {"uv": [14, 1, 15, 2], "texture": "#0"},
                				"down": {"uv": [14, 5, 15, 6], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 10, 1],
                			"to": [1, 15, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 1, 1, 6], "texture": "#0"},
                				"east": {"uv": [0, 1, 1, 6], "texture": "#0"},
                				"south": {"uv": [0, 1, 1, 6], "texture": "#0"},
                				"west": {"uv": [0, 1, 1, 6], "texture": "#0"},
                				"up": {"uv": [0, 1, 1, 2], "texture": "#0"},
                				"down": {"uv": [0, 5, 1, 6], "texture": "#0"}
                			}
                		}
                	]
            }
            """;

    public static String MUD_BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"textures": {
                		"0": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [16, 0, 0, 16], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#0"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 1, 1],
                			"to": [4, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [2, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 8, 4, 15], "texture": "#0"},
                				"east": {"uv": [3, 8, 4, 15], "texture": "#0"},
                				"south": {"uv": [0, 8, 4, 15], "texture": "#0"},
                				"west": {"uv": [0, 8, 1, 15], "texture": "#0"},
                				"up": {"uv": [0, 8, 4, 9], "texture": "#0"},
                				"down": {"uv": [0, 14, 4, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [13, 1, 1],
                			"to": [16, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [13, 8, 16, 15], "texture": "#0"},
                				"east": {"uv": [15, 8, 16, 15], "texture": "#0"},
                				"south": {"uv": [13, 8, 16, 15], "texture": "#0"},
                				"west": {"uv": [13, 8, 14, 15], "texture": "#0"},
                				"up": {"uv": [13, 8, 16, 9], "texture": "#0"},
                				"down": {"uv": [13, 14, 16, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [5, 1, 1],
                			"to": [12, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [5, 8, 12, 15], "texture": "#0"},
                				"east": {"uv": [11, 8, 12, 15], "texture": "#0"},
                				"south": {"uv": [5, 8, 12, 15], "texture": "#0"},
                				"west": {"uv": [5, 8, 6, 15], "texture": "#0"},
                				"up": {"uv": [5, 8, 12, 9], "texture": "#0"},
                				"down": {"uv": [5, 14, 12, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [9, 9, 1],
                			"to": [16, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [9, 0, 16, 7], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 7], "texture": "#0"},
                				"south": {"uv": [9, 0, 16, 7], "texture": "#0"},
                				"west": {"uv": [9, 0, 10, 7], "texture": "#0"},
                				"up": {"uv": [9, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [9, 6, 16, 7], "texture": "#0"}
                			}
                		},
                		{
                			"from": [1, 9, 1],
                			"to": [8, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [4, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [1, 0, 8, 7], "texture": "#0"},
                				"east": {"uv": [7, 0, 8, 7], "texture": "#0"},
                				"south": {"uv": [1, 0, 8, 7], "texture": "#0"},
                				"west": {"uv": [1, 0, 2, 7], "texture": "#0"},
                				"up": {"uv": [1, 0, 8, 1], "texture": "#0"},
                				"down": {"uv": [1, 6, 8, 7], "texture": "#0"}
                			}
                		}
                	]
            }
            """;

    public static String QUARTZ_BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"textures": {
                		"0": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#0"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 1, 1],
                			"to": [3, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 8, 3, 15], "texture": "#0"},
                				"east": {"uv": [2, 8, 3, 15], "texture": "#0"},
                				"south": {"uv": [0, 8, 3, 15], "texture": "#0"},
                				"west": {"uv": [0, 8, 1, 15], "texture": "#0"},
                				"up": {"uv": [0, 8, 3, 9], "texture": "#0"},
                				"down": {"uv": [0, 14, 3, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [4, 1, 1],
                			"to": [11, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [4, 8, 11, 15], "texture": "#0"},
                				"east": {"uv": [10, 8, 11, 15], "texture": "#0"},
                				"south": {"uv": [4, 8, 11, 15], "texture": "#0"},
                				"west": {"uv": [4, 8, 5, 15], "texture": "#0"},
                				"up": {"uv": [4, 8, 11, 9], "texture": "#0"},
                				"down": {"uv": [4, 14, 11, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [12, 1, 1],
                			"to": [16, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14, 4.5, 1.5]},
                			"faces": {
                				"north": {"uv": [12, 8, 16, 15], "texture": "#0"},
                				"east": {"uv": [15, 8, 16, 15], "texture": "#0"},
                				"south": {"uv": [12, 8, 16, 15], "texture": "#0"},
                				"west": {"uv": [12, 8, 13, 15], "texture": "#0"},
                				"up": {"uv": [12, 8, 16, 9], "texture": "#0"},
                				"down": {"uv": [12, 14, 16, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 9, 1],
                			"to": [15, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 12.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 15, 7], "texture": "#0"},
                				"east": {"uv": [14, 0, 15, 7], "texture": "#0"},
                				"south": {"uv": [0, 0, 15, 7], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 7], "texture": "#0"},
                				"up": {"uv": [0, 0, 15, 1], "texture": "#0"},
                				"down": {"uv": [0, 6, 15, 7], "texture": "#0"}
                			}
                		}
                	]
            }
            """;

    public static String PRISMARINE_BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"textures": {
                		"0": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#0"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#0"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#0"}
                			}
                		},
                		{
                			"from": [0, 1, 1],
                			"to": [3, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [1.5, 8.5, 1]},
                			"faces": {
                				"north": {"uv": [0, 0, 3, 15], "texture": "#0"},
                				"east": {"uv": [2, 0, 3, 15], "texture": "#0"},
                				"south": {"uv": [0, 0, 3, 15], "texture": "#0"},
                				"west": {"uv": [0, 0, 1, 15], "texture": "#0"},
                				"up": {"uv": [0, 0, 3, 1], "texture": "#0"},
                				"down": {"uv": [0, 14, 3, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [3, 9, 1],
                			"to": [6, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [4.5, 12.5, 1]},
                			"faces": {
                				"north": {"uv": [3, 0, 6, 7], "texture": "#0"},
                				"east": {"uv": [5, 0, 6, 7], "texture": "#0"},
                				"south": {"uv": [3, 0, 6, 7], "texture": "#0"},
                				"west": {"uv": [3, 0, 4, 7], "texture": "#0"},
                				"up": {"uv": [3, 0, 6, 1], "texture": "#0"},
                				"down": {"uv": [3, 6, 6, 7], "texture": "#0"}
                			}
                		},
                		{
                			"from": [3, 7, 1],
                			"to": [4, 9, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 8, 1]},
                			"faces": {
                				"north": {"uv": [3, 7, 4, 9], "texture": "#0"},
                				"east": {"uv": [3, 7, 4, 9], "texture": "#0"},
                				"south": {"uv": [3, 7, 4, 9], "texture": "#0"},
                				"west": {"uv": [3, 7, 4, 9], "texture": "#0"},
                				"up": {"uv": [3, 7, 4, 8], "texture": "#0"},
                				"down": {"uv": [3, 8, 4, 9], "texture": "#0"}
                			}
                		},
                		{
                			"from": [4, 8, 1],
                			"to": [5, 9, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [4.5, 8.5, 1]},
                			"faces": {
                				"north": {"uv": [4, 7, 5, 8], "texture": "#0"},
                				"east": {"uv": [4, 7, 5, 8], "texture": "#0"},
                				"south": {"uv": [4, 7, 5, 8], "texture": "#0"},
                				"west": {"uv": [4, 7, 5, 8], "texture": "#0"},
                				"up": {"uv": [4, 7, 5, 8], "texture": "#0"},
                				"down": {"uv": [4, 7, 5, 8], "texture": "#0"}
                			}
                		},
                		{
                			"from": [6, 10, 1],
                			"to": [7, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [6.5, 13, 1]},
                			"faces": {
                				"north": {"uv": [6, 0, 7, 6], "texture": "#0"},
                				"east": {"uv": [6, 0, 7, 6], "texture": "#0"},
                				"south": {"uv": [6, 0, 7, 6], "texture": "#0"},
                				"west": {"uv": [6, 0, 7, 6], "texture": "#0"},
                				"up": {"uv": [6, 0, 7, 1], "texture": "#0"},
                				"down": {"uv": [6, 5, 7, 6], "texture": "#0"}
                			}
                		},
                		{
                			"from": [12, 1, 1],
                			"to": [15, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [13.5, 8.5, 1]},
                			"faces": {
                				"north": {"uv": [12, 0, 15, 15], "texture": "#0"},
                				"east": {"uv": [14, 0, 15, 15], "texture": "#0"},
                				"south": {"uv": [12, 0, 15, 15], "texture": "#0"},
                				"west": {"uv": [12, 0, 13, 15], "texture": "#0"},
                				"up": {"uv": [12, 0, 15, 1], "texture": "#0"},
                				"down": {"uv": [12, 14, 15, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [9, 9, 1],
                			"to": [12, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 12.5, 1]},
                			"faces": {
                				"north": {"uv": [9, 0, 12, 7], "texture": "#0"},
                				"east": {"uv": [11, 0, 12, 7], "texture": "#0"},
                				"south": {"uv": [9, 0, 12, 7], "texture": "#0"},
                				"west": {"uv": [9, 0, 10, 7], "texture": "#0"},
                				"up": {"uv": [9, 0, 12, 1], "texture": "#0"},
                				"down": {"uv": [9, 6, 12, 7], "texture": "#0"}
                			}
                		},
                		{
                			"from": [8, 10, 1],
                			"to": [9, 16, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13, 1]},
                			"faces": {
                				"north": {"uv": [8, 0, 9, 6], "texture": "#0"},
                				"east": {"uv": [8, 0, 9, 6], "texture": "#0"},
                				"south": {"uv": [8, 0, 9, 6], "texture": "#0"},
                				"west": {"uv": [8, 0, 9, 6], "texture": "#0"},
                				"up": {"uv": [8, 0, 9, 1], "texture": "#0"},
                				"down": {"uv": [8, 5, 9, 6], "texture": "#0"}
                			}
                		},
                		{
                			"from": [11, 7, 1],
                			"to": [12, 9, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [11.5, 8, 1.5]},
                			"faces": {
                				"north": {"uv": [11, 7, 12, 9], "texture": "#0"},
                				"east": {"uv": [11, 7, 12, 9], "texture": "#0"},
                				"south": {"uv": [11, 7, 12, 9], "texture": "#0"},
                				"west": {"uv": [11, 7, 12, 9], "texture": "#0"},
                				"up": {"uv": [11, 7, 12, 8], "texture": "#0"},
                				"down": {"uv": [11, 8, 12, 9], "texture": "#0"}
                			}
                		},
                		{
                			"from": [10, 8, 1],
                			"to": [11, 9, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 8.5, 1.5]},
                			"faces": {
                				"north": {"uv": [10, 7, 11, 8], "texture": "#0"},
                				"east": {"uv": [10, 7, 11, 8], "texture": "#0"},
                				"south": {"uv": [10, 7, 11, 8], "texture": "#0"},
                				"west": {"uv": [10, 7, 11, 8], "texture": "#0"},
                				"up": {"uv": [10, 7, 11, 8], "texture": "#0"},
                				"down": {"uv": [10, 7, 11, 8], "texture": "#0"}
                			}
                		},
                		{
                			"from": [4, 1, 1],
                			"to": [11, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 4, 1]},
                			"faces": {
                				"north": {"uv": [4, 9, 11, 15], "texture": "#0"},
                				"east": {"uv": [10, 9, 11, 15], "texture": "#0"},
                				"south": {"uv": [4, 9, 11, 15], "texture": "#0"},
                				"west": {"uv": [4, 9, 5, 15], "texture": "#0"},
                				"up": {"uv": [4, 9, 11, 10], "texture": "#0"},
                				"down": {"uv": [4, 14, 11, 15], "texture": "#0"}
                			}
                		},
                		{
                			"from": [5, 7, 1],
                			"to": [10, 8, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 7.5, 1]},
                			"faces": {
                				"north": {"uv": [5, 8, 10, 9], "texture": "#0"},
                				"east": {"uv": [9, 8, 10, 9], "texture": "#0"},
                				"south": {"uv": [5, 8, 10, 9], "texture": "#0"},
                				"west": {"uv": [5, 8, 6, 9], "texture": "#0"},
                				"up": {"uv": [5, 8, 10, 9], "texture": "#0"},
                				"down": {"uv": [5, 8, 10, 9], "texture": "#0"}
                			}
                		},
                		{
                			"from": [6, 8, 1],
                			"to": [9, 9, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 8.5, 1]},
                			"faces": {
                				"north": {"uv": [6, 7, 9, 8], "texture": "#0"},
                				"east": {"uv": [8, 7, 9, 8], "texture": "#0"},
                				"south": {"uv": [6, 7, 9, 8], "texture": "#0"},
                				"west": {"uv": [6, 7, 7, 8], "texture": "#0"},
                				"up": {"uv": [6, 7, 9, 8], "texture": "#0"},
                				"down": {"uv": [6, 7, 9, 8], "texture": "#0"}
                			}
                		},
                		{
                			"from": [7, 9, 1],
                			"to": [8, 10, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [7.5, 9.5, 1]},
                			"faces": {
                				"north": {"uv": [7, 6, 8, 7], "texture": "#0"},
                				"east": {"uv": [7, 6, 8, 7], "texture": "#0"},
                				"south": {"uv": [7, 6, 8, 7], "texture": "#0"},
                				"west": {"uv": [7, 6, 8, 7], "texture": "#0"},
                				"up": {"uv": [7, 6, 8, 7], "texture": "#0"},
                				"down": {"uv": [7, 6, 8, 7], "texture": "#0"}
                			}
                		}
                	]
            }
            """;

    public static String NETHER_BRICKS_VENEER = """
            {
                "parent": "minecraft:block/block",
                "format_version": "1.9.0",
                	"credit": "Made with Blockbench",
                	"textures": {
                		"1": "NAME",
                		"particle": "NAME"
                	},
                	"elements": [
                		{
                			"from": [0, 0, 0],
                			"to": [16, 16, 1],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8, 0.5]},
                			"faces": {
                				"north": {"uv": [0, 0, 16, 16], "texture": "#1"},
                				"east": {"uv": [15, 0, 16, 16], "texture": "#1"},
                				"south": {"uv": [0, 0, 16, 16], "texture": "#1"},
                				"west": {"uv": [0, 0, 1, 16], "texture": "#1"},
                				"up": {"uv": [0, 0, 16, 1], "texture": "#1"},
                				"down": {"uv": [0, 15, 16, 16], "texture": "#1"}
                			}
                		},
                		{
                			"from": [0, 0, 1],
                			"to": [4, 3, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 13, 4, 16], "texture": "#1"},
                				"east": {"uv": [3, 13, 4, 16], "texture": "#1"},
                				"south": {"uv": [0, 13, 4, 16], "texture": "#1"},
                				"west": {"uv": [0, 13, 1, 16], "texture": "#1"},
                				"up": {"uv": [0, 13, 4, 14], "texture": "#1"},
                				"down": {"uv": [0, 15, 4, 16], "texture": "#1"}
                			}
                		},
                		{
                			"from": [0, 12, 1],
                			"to": [4, 15, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [2, 13.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 1, 4, 4], "texture": "#1"},
                				"east": {"uv": [3, 1, 4, 4], "texture": "#1"},
                				"south": {"uv": [0, 1, 4, 4], "texture": "#1"},
                				"west": {"uv": [0, 1, 1, 4], "texture": "#1"},
                				"up": {"uv": [0, 1, 4, 2], "texture": "#1"},
                				"down": {"uv": [0, 3, 4, 4], "texture": "#1"}
                			}
                		},
                		{
                			"from": [0, 4, 1],
                			"to": [2, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [1, 5.5, 1.5]},
                			"faces": {
                				"north": {"uv": [0, 9, 2, 12], "texture": "#1"},
                				"east": {"uv": [1, 9, 2, 12], "texture": "#1"},
                				"south": {"uv": [0, 9, 2, 12], "texture": "#1"},
                				"west": {"uv": [0, 9, 1, 12], "texture": "#1"},
                				"up": {"uv": [0, 9, 2, 10], "texture": "#1"},
                				"down": {"uv": [0, 11, 2, 12], "texture": "#1"}
                			}
                		},
                		{
                			"from": [3, 4, 1],
                			"to": [6, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [4.5, 5.5, 1.5]},
                			"faces": {
                				"north": {"uv": [3, 9, 6, 12], "texture": "#1"},
                				"east": {"uv": [5, 9, 6, 12], "texture": "#1"},
                				"south": {"uv": [3, 9, 6, 12], "texture": "#1"},
                				"west": {"uv": [3, 9, 4, 12], "texture": "#1"},
                				"up": {"uv": [3, 9, 6, 10], "texture": "#1"},
                				"down": {"uv": [3, 11, 6, 12], "texture": "#1"}
                			}
                		},
                		{
                			"from": [7, 4, 1],
                			"to": [10, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 5.5, 1.5]},
                			"faces": {
                				"north": {"uv": [7, 9, 10, 12], "texture": "#1"},
                				"east": {"uv": [9, 9, 10, 12], "texture": "#1"},
                				"south": {"uv": [7, 9, 10, 12], "texture": "#1"},
                				"west": {"uv": [7, 9, 8, 12], "texture": "#1"},
                				"up": {"uv": [7, 9, 10, 10], "texture": "#1"},
                				"down": {"uv": [7, 11, 10, 12], "texture": "#1"}
                			}
                		},
                		{
                			"from": [11, 4, 1],
                			"to": [14, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 5.5, 1.5]},
                			"faces": {
                				"north": {"uv": [11, 9, 14, 12], "texture": "#1"},
                				"east": {"uv": [13, 9, 14, 12], "texture": "#1"},
                				"south": {"uv": [11, 9, 14, 12], "texture": "#1"},
                				"west": {"uv": [11, 9, 12, 12], "texture": "#1"},
                				"up": {"uv": [11, 9, 14, 10], "texture": "#1"},
                				"down": {"uv": [11, 11, 14, 12], "texture": "#1"}
                			}
                		},
                		{
                			"from": [15, 4, 1],
                			"to": [16, 7, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 5.5, 1.5]},
                			"faces": {
                				"north": {"uv": [15, 9, 16, 12], "texture": "#1"},
                				"east": {"uv": [15, 9, 16, 12], "texture": "#1"},
                				"south": {"uv": [15, 9, 16, 12], "texture": "#1"},
                				"west": {"uv": [15, 9, 16, 12], "texture": "#1"},
                				"up": {"uv": [15, 9, 16, 10], "texture": "#1"},
                				"down": {"uv": [15, 11, 16, 12], "texture": "#1"}
                			}
                		},
                		{
                			"from": [13, 0, 1],
                			"to": [16, 3, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 1.5, 1.5]},
                			"faces": {
                				"north": {"uv": [13, 13, 16, 16], "texture": "#1"},
                				"east": {"uv": [15, 13, 16, 16], "texture": "#1"},
                				"south": {"uv": [13, 13, 16, 16], "texture": "#1"},
                				"west": {"uv": [13, 13, 14, 16], "texture": "#1"},
                				"up": {"uv": [13, 13, 16, 14], "texture": "#1"},
                				"down": {"uv": [13, 15, 16, 16], "texture": "#1"}
                			}
                		},
                		{
                			"from": [13, 12, 1],
                			"to": [16, 15, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [14.5, 13.5, 1.5]},
                			"faces": {
                				"north": {"uv": [13, 1, 16, 4], "texture": "#1"},
                				"east": {"uv": [15, 1, 16, 4], "texture": "#1"},
                				"south": {"uv": [13, 1, 16, 4], "texture": "#1"},
                				"west": {"uv": [13, 1, 14, 4], "texture": "#1"},
                				"up": {"uv": [13, 1, 16, 2], "texture": "#1"},
                				"down": {"uv": [13, 3, 16, 4], "texture": "#1"}
                			}
                		},
                		{
                			"from": [5, 0, 1],
                			"to": [12, 3, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 1.5, 1.5]},
                			"faces": {
                				"north": {"uv": [5, 13, 12, 16], "texture": "#1"},
                				"east": {"uv": [11, 13, 12, 16], "texture": "#1"},
                				"south": {"uv": [5, 13, 12, 16], "texture": "#1"},
                				"west": {"uv": [5, 13, 6, 16], "texture": "#1"},
                				"up": {"uv": [5, 13, 12, 14], "texture": "#1"},
                				"down": {"uv": [5, 15, 12, 16], "texture": "#1"}
                			}
                		},
                		{
                			"from": [5, 12, 1],
                			"to": [12, 15, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [8.5, 13.5, 1.5]},
                			"faces": {
                				"north": {"uv": [5, 1, 12, 4], "texture": "#1"},
                				"east": {"uv": [11, 1, 12, 4], "texture": "#1"},
                				"south": {"uv": [5, 1, 12, 4], "texture": "#1"},
                				"west": {"uv": [5, 1, 6, 4], "texture": "#1"},
                				"up": {"uv": [5, 1, 12, 2], "texture": "#1"},
                				"down": {"uv": [5, 3, 12, 4], "texture": "#1"}
                			}
                		},
                		{
                			"from": [9, 8, 1],
                			"to": [16, 11, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [12.5, 9.5, 1.5]},
                			"faces": {
                				"north": {"uv": [9, 5, 16, 8], "texture": "#1"},
                				"east": {"uv": [15, 5, 16, 8], "texture": "#1"},
                				"south": {"uv": [9, 5, 16, 8], "texture": "#1"},
                				"west": {"uv": [9, 5, 10, 8], "texture": "#1"},
                				"up": {"uv": [9, 5, 16, 6], "texture": "#1"},
                				"down": {"uv": [9, 7, 16, 8], "texture": "#1"}
                			}
                		},
                		{
                			"from": [1, 8, 1],
                			"to": [8, 11, 2],
                			"rotation": {"angle": 0, "axis": "y", "origin": [4.5, 9.5, 1.5]},
                			"faces": {
                				"north": {"uv": [1, 5, 8, 8], "texture": "#1"},
                				"east": {"uv": [7, 5, 8, 8], "texture": "#1"},
                				"south": {"uv": [1, 5, 8, 8], "texture": "#1"},
                				"west": {"uv": [1, 5, 2, 8], "texture": "#1"},
                				"up": {"uv": [1, 5, 8, 6], "texture": "#1"},
                				"down": {"uv": [1, 7, 8, 8], "texture": "#1"}
                			}
                		}
                	]
            }
            """;
}