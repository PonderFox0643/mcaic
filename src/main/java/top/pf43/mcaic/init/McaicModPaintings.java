
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.McaicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class McaicModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, McaicMod.MODID);
	public static final RegistryObject<PaintingVariant> NOEL_PDD = REGISTRY.register("noel_pdd", () -> new PaintingVariant(32, 16));
	public static final RegistryObject<PaintingVariant> NOELAND_T = REGISTRY.register("noeland_t", () -> new PaintingVariant(32, 16));
}
