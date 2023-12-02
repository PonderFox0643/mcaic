
package top.pf43.mcaic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MacrystalItem extends Item {
	public MacrystalItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.COMMON));
	}
}
