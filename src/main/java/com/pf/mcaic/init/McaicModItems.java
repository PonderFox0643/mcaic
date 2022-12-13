
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pf.mcaic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.pf.mcaic.item.StaffItem;
import com.pf.mcaic.item.NoelItem;
import com.pf.mcaic.item.MagicstaffItem;
import com.pf.mcaic.item.MagiccrystalItem;
import com.pf.mcaic.item.BigstaffItem;
import com.pf.mcaic.McaicMod;

public class McaicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McaicMod.MODID);
	public static final RegistryObject<Item> MAGICCRYSTAL = REGISTRY.register("magiccrystal", () -> new MagiccrystalItem());
	public static final RegistryObject<Item> STAFF = REGISTRY.register("staff", () -> new StaffItem());
	public static final RegistryObject<Item> MAGICSTAFF = REGISTRY.register("magicstaff", () -> new MagicstaffItem());
	public static final RegistryObject<Item> BIGSTAFF = REGISTRY.register("bigstaff", () -> new BigstaffItem());
	public static final RegistryObject<Item> NOEL = REGISTRY.register("noel", () -> new NoelItem());
}
