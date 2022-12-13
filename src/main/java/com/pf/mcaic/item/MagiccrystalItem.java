
package com.pf.mcaic.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.pf.mcaic.init.McaicModTabs;

public class MagiccrystalItem extends Item {
	public MagiccrystalItem() {
		super(new Item.Properties().tab(McaicModTabs.TAB_AIC).stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
