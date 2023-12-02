
package com.pf43.mcaic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.pf43.mcaic.itemgroup.McaicItemGroup;
import com.pf43.mcaic.McaicModElements;

@McaicModElements.ModElement.Tag
public class CrystalStaffItem extends McaicModElements.ModElement {
	@ObjectHolder("mcaic:crystal_staff")
	public static final Item block = null;

	public CrystalStaffItem(McaicModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1440;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 0f, new Item.Properties().group(McaicItemGroup.tab)) {
		}.setRegistryName("crystal_staff"));
	}
}
