
package top.pf43.mcaic.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ReNoelBattleItem extends RecordItem {
	public ReNoelBattleItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcaic:mcaic_noel_battle")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2885);
	}
}
