package info.zthings.yammfus;

import info.zthings.yammfus.util.ConfigHelper;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class YAEventHandler {
	@SubscribeEvent
	public void onBonemealUse(BonemealEvent ev) {
		if (ConfigHelper.cloneLily) {
			if (ev.getBlock() == Blocks.WATERLILY) {
				Random rand = new Random();
				
				if (rand.nextInt(ConfigHelper.randCloneLily+1) == 0) {
					BlockPos sPos = new BlockPos(ev.getPos());
					while (true) { //CHECK crash when surrounded?
						int cX, cZ;
						
						if (rand.nextInt(2) == 0) cX = sPos.getX() - rand.nextInt(3);
						else cX = sPos.getX() + rand.nextInt(3);
						
						if (rand.nextInt(2) == 0) cZ = sPos.getZ() - rand.nextInt(3);
						else cZ = sPos.getZ() + rand.nextInt(3);
						
						if (ev.getWorld().getBlockState(new BlockPos(cX, ev.getPos().getY()-1, cZ)).getBlock() == Blocks.WATER) {
							ev.getWorld().setBlockState(new BlockPos(cX, ev.getPos().getY(), cZ), Blocks.WATERLILY.getDefaultState());
							break;
						}
					}					
				}
				ev.setResult(Result.ALLOW);
			}
		}
	}
}
