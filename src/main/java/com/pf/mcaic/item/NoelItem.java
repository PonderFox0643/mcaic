
package com.pf.mcaic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NoelItem extends Item {
	public NoelItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
