package nl.ravithrasworld.bettervanilla.main;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nl.ravithrasworld.bettervanilla.util.ConfigHelper;

public class BVEventHandler {
	@SubscribeEvent
	public void onBonemealUse(BonemealEvent event) {
		if (ConfigHelper.cloneLily) {
			if (event.block.getBlock() == Blocks.waterlily) {
				Random rand = new Random();
				
				if (rand.nextInt(ConfigHelper.randCloneLily+1) == 0) {
					BlockPos sPos = new BlockPos(event.pos);
					while (true) {
						int cX, cZ;
						
						if (rand.nextInt(2) == 0) {
							cX = sPos.getX() - rand.nextInt(3);
						} else {
							cX = sPos.getX() + rand.nextInt(3);
							
						}
						
						
						
						if (rand.nextInt(2) == 0) {
							cZ = sPos.getZ() - rand.nextInt(3);

						} else {
							cZ = sPos.getZ() + rand.nextInt(3);
						}
						
						
						if (event.world.getBlockState(new BlockPos(cX, event.pos.getY()-1, cZ)).getBlock() == Blocks.water) {
							event.world.setBlockState(new BlockPos(cX, event.pos.getY(), cZ), Blocks.waterlily.getDefaultState());
							break;
						}
					}					
				}
				event.setResult(Result.ALLOW);
			}
		}
	}
}
