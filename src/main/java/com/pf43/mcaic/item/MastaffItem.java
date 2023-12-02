
package com.pf43.mcaic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.pf43.mcaic.itemgroup.McaicItemGroup;
import com.pf43.mcaic.McaicModElements;

@McaicModElements.ModElement.Tag
public class MastaffItem extends McaicModElements.ModElement {
	@ObjectHolder("mcaic:mastaff")
	public static final Item block = null;

	public MastaffItem(McaicModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(McaicItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("mastaff");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
