
package top.pf43.mcaic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NoelItem extends Item {
	public NoelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
