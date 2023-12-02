
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.McaicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class McaicModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, McaicMod.MODID);
	public static final RegistryObject<SoundEvent> MCAIC_NOEL_BATTLE = REGISTRY.register("mcaic_noel_battle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mcaic", "mcaic_noel_battle")));
}
