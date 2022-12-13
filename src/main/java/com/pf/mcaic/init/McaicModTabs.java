
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pf.mcaic.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McaicModTabs {
	public static CreativeModeTab TAB_AIC;

	public static void load() {
		TAB_AIC = new CreativeModeTab("tabaic") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(McaicModItems.NOEL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
