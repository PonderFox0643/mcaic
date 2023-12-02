
package com.pf43.mcaic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import com.pf43.mcaic.itemgroup.McaicItemGroup;
import com.pf43.mcaic.McaicModElements;

@McaicModElements.ModElement.Tag
public class ReNoelBattleItem extends McaicModElements.ModElement {
	@ObjectHolder("mcaic:re_noel_battle")
	public static final Item block = null;

	public ReNoelBattleItem(McaicModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, McaicModElements.sounds.get(new ResourceLocation("mcaic:mcaic.noel.battle")),
					new Item.Properties().group(McaicItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("re_noel_battle");
		}
	}
}
