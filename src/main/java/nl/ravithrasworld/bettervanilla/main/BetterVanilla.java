package nl.ravithrasworld.bettervanilla.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.ravithrasworld.bettervanilla.proxy.ClientProxy;
import nl.ravithrasworld.bettervanilla.util.ConfigHelper;

@Mod(modid = BetterVanilla.MODID, version = BetterVanilla.VERSION)
public class BetterVanilla {
    public static final String MODID = "BetterVanilla";
    public static final String VERSION = "1.1.1.1";
    
    public static ClientProxy proxy = new ClientProxy();    
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new BVEventHandler());
    	
    	if (ConfigHelper.recipeCobWeb) {
			GameRegistry.addRecipe(new ItemStack(Blocks.web), "S S", " S ", "S S", 'S', Items.string);
		}
    	
		if (ConfigHelper.recipeHorseArmor) {
			GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), " SI", "IIB", 'I', Items.iron_ingot, 'B', Blocks.iron_block, 'S', Items.saddle);
			GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), " SI", "IIB", 'I', Items.gold_ingot, 'B', Blocks.gold_block, 'S', Items.saddle);
			GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), " SI", "IIB", 'I', Items.diamond, 'B', Blocks.diamond_block, 'S', Items.saddle);
		}
    	
    	if (ConfigHelper.recipeSaddle) {
			GameRegistry.addRecipe(new ItemStack(Items.saddle), "LLL", "LSL", "ILI", 'L', Items.leather, 'S', Items.string, 'I', Items.iron_ingot);
		}
    	
		if (ConfigHelper.recipeNameTag) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag), new Object[] { 
				new ItemStack(Items.feather, 1),
				new ItemStack(Items.leather, 1),
				new ItemStack(Items.leather, 1),
				new ItemStack(Items.string, 1),
				new ItemStack(Items.string, 1),
				new ItemStack(Items.dye, 1, 0),
			});
		}
		
		if (ConfigHelper.recipePackedIce) {
			GameRegistry.addRecipe(new ItemStack(Blocks.packed_ice, 2), "II", "II", 'I', Blocks.ice);
		}
		
		if (ConfigHelper.recipeChainArmor) {
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "ISI", "S S", "   ", 'S', Items.string, 'I', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "   ", "ISI", "S S", 'S', Items.string, 'I', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), "I I", "SIS", "ISI", 'S', Items.string, 'I', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), "SIS", "I I", "S S", 'S', Items.string, 'I', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "S S", "I I", "   ", 'S', Items.string, 'I', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "   ", "S S", "I I", 'S', Items.string, 'I', Items.iron_ingot);
		}
		
		if (ConfigHelper.recipeSlab_Fullblock) {
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 0), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 0));
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 1), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 1));
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 2), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 2));
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 3), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 3));
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 4), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 4));
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 5), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 5));
			GameRegistry.addRecipe(new ItemStack(Blocks.planks, 1, 6), "S", "S", "S", 'S', new ItemStack(Blocks.wooden_slab, 1, 6));
			
			GameRegistry.addRecipe(new ItemStack(Blocks.stone), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 0));
			GameRegistry.addRecipe(new ItemStack(Blocks.sandstone, 1, 0), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 1));
			GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 3));
			GameRegistry.addRecipe(new ItemStack(Blocks.brick_block), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 4));
			GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 5));
			GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 6));
			GameRegistry.addRecipe(new ItemStack(Blocks.quartz_block), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab, 1, 7));
			GameRegistry.addRecipe(new ItemStack(Blocks.red_sandstone), "S", "S", "S", 'S', new ItemStack(Blocks.stone_slab2, 1, 0));
		}
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ConfigHelper.setupConfig(new Configuration(event.getSuggestedConfigurationFile()), event.getModLog());
    }
}
