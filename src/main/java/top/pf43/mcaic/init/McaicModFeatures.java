
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.world.features.plants.MapgyFeature;
import top.pf43.mcaic.world.features.plants.MaXmFeature;
import top.pf43.mcaic.world.features.plants.MaJyFeature;
import top.pf43.mcaic.world.features.plants.MaJueFeature;
import top.pf43.mcaic.world.features.plants.MaJmFeature;
import top.pf43.mcaic.world.features.plants.MaFFeature;
import top.pf43.mcaic.world.features.plants.MaDmFeature;
import top.pf43.mcaic.McaicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class McaicModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, McaicMod.MODID);
	public static final RegistryObject<Feature<?>> MA_XM = REGISTRY.register("ma_xm", MaXmFeature::new);
	public static final RegistryObject<Feature<?>> MA_DM = REGISTRY.register("ma_dm", MaDmFeature::new);
	public static final RegistryObject<Feature<?>> MA_F = REGISTRY.register("ma_f", MaFFeature::new);
	public static final RegistryObject<Feature<?>> MA_JM = REGISTRY.register("ma_jm", MaJmFeature::new);
	public static final RegistryObject<Feature<?>> MA_JUE = REGISTRY.register("ma_jue", MaJueFeature::new);
	public static final RegistryObject<Feature<?>> MAPGY = REGISTRY.register("mapgy", MapgyFeature::new);
	public static final RegistryObject<Feature<?>> MA_JY = REGISTRY.register("ma_jy", MaJyFeature::new);
}
