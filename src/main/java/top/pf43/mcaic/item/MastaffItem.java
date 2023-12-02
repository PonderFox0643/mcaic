
package top.pf43.mcaic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MastaffItem extends Item {
	public MastaffItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
