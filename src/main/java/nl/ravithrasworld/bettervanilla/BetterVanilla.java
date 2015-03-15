package nl.ravithrasworld.bettervanilla;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = BetterVanilla.MODID, version = BetterVanilla.VERSION)
public class BetterVanilla {
    public static final String MODID = "BetterVanilla";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	GameRegistry.addRecipe(new ItemStack(Blocks.web), new Object[]{
        	"S S",
        	" S ",
        	"S S",
        	'S', Items.string
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), new Object[]{
        	"III",
        	"BSB",
        	"III",
        	'I', Items.iron_ingot,
        	'B', Blocks.iron_block,
        	'S', Items.saddle
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), new Object[]{
        	"III",
        	"BSB",
        	"III",
        	'I', Items.gold_ingot,
        	'B', Blocks.gold_block,
        	'S', Items.saddle
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), new Object[]{
        	"III",
        	"BSB",
        	"III",
        	'I', Items.diamond,
        	'B', Blocks.diamond_block,
        	'S', Items.saddle
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[]{
        	"LLL",
        	"LSL",
        	"ILI",
        	'L', Items.leather,
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});

    	GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag), new Object[] {
	    	new ItemStack(Items.feather, 1),
	    	new ItemStack(Items.leather, 1),
	    	new ItemStack(Items.leather, 1),
	    	new ItemStack(Items.string, 1),
	    	new ItemStack(Items.string, 1),
	    	new ItemStack(Items.dye, 1, 0),
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), new Object[]{
        	"ISI",
        	"S S",
        	"   ",
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), new Object[]{
        	"   ",
        	"ISI",
        	"S S",
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), new Object[]{
        	"I I",
        	"SIS",
        	"ISI",
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), new Object[]{
        	"SIS",
        	"I I",
        	"S S",
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), new Object[]{
        	"S S",
        	"I I",
        	"   ",
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});
    	GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), new Object[]{
        	"   ",
        	"S S",
        	"I I",
        	'S', Items.string,
        	'I', Items.iron_ingot
    	});
    }
}
