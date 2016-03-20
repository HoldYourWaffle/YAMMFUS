package info.zthings.yammfus.util;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class ConfigHelper {

	public ConfigHelper() {

	}

	public static boolean recipeCobWeb, recipeHorseArmor, recipeSaddle, recipeNameTag, recipeChainArmor, 
		recipePackedIce, recipeSlab_Fullblock, cloneLily;
	public static int randCloneLily;
	
	private static Property recipeCobWebProp, recipeHorseArmorProp, recipeSaddleProp, recipeNameTagProp, 
		recipeChainArmorProp, recipePackedIceProp, recipeSlab_FullblockProp, cloneLilyProp, randCloneLilyProp;
	
	/** SINCE v1.1 */
	
	public static boolean recipeGodApple;
	
	private static Property recipeGodAppleProp;

	public static void setupConfig(Configuration cfg, Logger logger) {
		try {
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
			
			recipeSlab_FullblockProp = cfg.get("Recipes", "recipeSlab_Fullblock", true);
			recipeSlab_Fullblock = recipeSlab_FullblockProp.getBoolean(true);
			
			cloneLilyProp = cfg.get("Other", "cloneLilyPad", true);
			cloneLily = cloneLilyProp.getBoolean(true);
				
			randCloneLilyProp = cfg.get("Other", "randomCloneLilyPad", 10);
			randCloneLily = randCloneLilyProp.getInt(10);
			
			/** SINCE v1.1 */
			recipeGodAppleProp = cfg.get("Recipes", "recipeGodApple", true);
			recipeGodApple = recipeGodAppleProp.getBoolean(true);
		} catch (Exception e) {
			logger.log(Level.ERROR,
					"An error occured loading YAMMFUS config!");
			e.printStackTrace();
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

}
