package info.zthings.yammfus;

import info.zthings.yammfus.proxy.ClientProxy;
import info.zthings.yammfus.util.ConfigHelper;
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

@Mod(modid = YAMMFUS.MODID, version = YAMMFUS.VERSION)
public class YAMMFUS {
    public static final String MODID = "yammfus";
    public static final String VERSION = "1.1";
    
    public static ClientProxy proxy = new ClientProxy();    
    
    @SuppressWarnings("unused")
	@EventHandler
    public void init(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new YAEventHandler());
    	
    	if (ConfigHelper.recipeCobWeb) {
			GameRegistry.addRecipe(new ItemStack(Blocks.WEB), "S S", " S ", "S S", 'S', Items.STRING);
		}
    	
		if (ConfigHelper.recipeHorseArmor) {
			GameRegistry.addRecipe(new ItemStack(Items.IRON_HORSE_ARMOR), " SI", "IIB", 'I', Items.IRON_INGOT, 'B', Blocks.IRON_BLOCK, 'S', Items.SADDLE);
			GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR), " SI", "IIB", 'I', Items.GOLD_INGOT, 'B', Blocks.GOLD_BLOCK, 'S', Items.SADDLE);
			GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR), " SI", "IIB", 'I', Items.DIAMOND, 'B', Blocks.DIAMOND_BLOCK, 'S', Items.SADDLE);
		}
    	
    	if (ConfigHelper.recipeSaddle) {
			GameRegistry.addRecipe(new ItemStack(Items.SADDLE), "LLL", "LSL", "ILI", 'L', Items.LEATHER, 'S', Items.STRING, 'I', Items.IRON_INGOT);
		}
    	
		if (ConfigHelper.recipeNameTag) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.NAME_TAG), new Object[] { 
				new ItemStack(Items.FEATHER, 1),
				new ItemStack(Items.LEATHER, 1),
				new ItemStack(Items.LEATHER, 1),
				new ItemStack(Items.STRING, 1),
				new ItemStack(Items.STRING, 1),
				new ItemStack(Items.DYE, 1, 0),
			});
		}
		
		if (ConfigHelper.recipePackedIce) {
			GameRegistry.addRecipe(new ItemStack(Blocks.PACKED_ICE, 2), "II", "II", 'I', Blocks.ICE);
		}
		
		if (ConfigHelper.recipeGodApple) {
			GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), "BBB", "BAB", "BBB", 'A', Items.APPLE, 'B', Blocks.GOLD_BLOCK);
		}
		
		if (ConfigHelper.recipeChainArmor) {
			GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_HELMET), "ISI", "S S", 'S', Items.STRING, 'I', Items.IRON_INGOT);
			GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE), "I I", "SIS", "ISI", 'S', Items.STRING, 'I', Items.IRON_INGOT);
			GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS), "SIS", "I I", "S S", 'S', Items.STRING, 'I', Items.IRON_INGOT);
			GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_BOOTS), "S S", "I I", 'S', Items.STRING, 'I', Items.IRON_INGOT);
		}
		
		if (ConfigHelper.recipeSlab_Fullblock) {
			for (int i=0; i<7; i++)	GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, i), "S", "S", "S", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 0));
			
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB));
			GameRegistry.addRecipe(new ItemStack(Blocks.SANDSTONE, 1, 0), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 1));
			GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 3));
			GameRegistry.addRecipe(new ItemStack(Blocks.BRICK_BLOCK), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 4));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONEBRICK), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 5));
			GameRegistry.addRecipe(new ItemStack(Blocks.NETHER_BRICK), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 6));
			GameRegistry.addRecipe(new ItemStack(Blocks.QUARTZ_BLOCK), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 7));
			GameRegistry.addRecipe(new ItemStack(Blocks.RED_SANDSTONE), "S", "S", "S", 'S', new ItemStack(Blocks.STONE_SLAB2, 1, 0));
			GameRegistry.addRecipe(new ItemStack(Blocks.PURPUR_BLOCK), "S", "S", "S", 'S', new ItemStack(Blocks.PURPUR_SLAB));
		}
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ConfigHelper.setupConfig(new Configuration(event.getSuggestedConfigurationFile()), event.getModLog());
    }
}
