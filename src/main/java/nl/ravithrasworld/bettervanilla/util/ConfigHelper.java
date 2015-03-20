package nl.ravithrasworld.bettervanilla.util;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class ConfigHelper {

	public ConfigHelper() {

	}

	/*
	 * public static boolean requireSavingStone; private static Property
	 * requireSavingStoneProp;
	 */

	public static boolean recipeCobWeb;
	public static boolean recipeHorseArmor;
	public static boolean recipeSaddle;
	public static boolean recipeNameTag;
	public static boolean recipeChainArmor;
	public static boolean recipePackedIce;

	private static Property recipeCobWebProp;
	private static Property recipeHorseArmorProp;
	private static Property recipeSaddleProp;
	private static Property recipeNameTagProp;
	private static Property recipeChainArmorProp;
	private static Property recipePackedIceProp;

	public static void setupConfig(Configuration cfg, Logger logger) {
		try {
			/*
			 * requireSavingStoneProp = cfg.get("General", "requireSavingStone",
			 * true); requireSavingStoneProp.comment =
			 * "Whether or not the Saving Stone is required to get a Death Chest"
			 * ; requireSavingStone = requireSavingStoneProp.getBoolean(false);
			 */

			recipeCobWebProp = cfg.get("Recipes", "recipeCobWeb", true);
			recipeCobWeb = recipeCobWebProp.getBoolean(true);

			recipeHorseArmorProp = cfg.get("Recipes", "recipeHorseArmor", true);
			recipeHorseArmor = recipeHorseArmorProp.getBoolean(true);

			recipeSaddleProp = cfg.get("Recipes", "recipeSaddle", true);
			recipeSaddle = recipeSaddleProp.getBoolean(true);

			recipeNameTagProp = cfg.get("Recipes", "recipeNametag", true);
			recipeNameTag = recipeNameTagProp.getBoolean(true);

			recipeChainArmorProp = cfg.get("Recipes", "recipeChainArmor", true);
			recipeChainArmor = recipeChainArmorProp.getBoolean(true);
			
			recipePackedIceProp = cfg.get("Recipes", "recipePackedIce", true);
			recipePackedIce = recipePackedIceProp.getBoolean(true);

		} catch (Exception e) {
			logger.log(Level.ERROR,
					"An error occured loading BetterVanilla config!");
			e.printStackTrace();
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

}
