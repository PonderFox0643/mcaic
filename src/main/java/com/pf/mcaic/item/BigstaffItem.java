
package com.pf.mcaic.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.pf.mcaic.init.McaicModTabs;

public class BigstaffItem extends PickaxeItem {
	public BigstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 3300;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.IRON_BLOCK));
			}
		}, 1, -3.2f, new Item.Properties().tab(McaicModTabs.TAB_AIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u7269\u6709\u6240\u503C"));
		list.add(Component.literal("\u8D76\u7D27\u5408\u6210\u7F62"));
	}
}
