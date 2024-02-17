
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.McaicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class McaicModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McaicMod.MODID);
	public static final RegistryObject<CreativeModeTab> MCAIC = REGISTRY.register("mcaic",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mcaic.mcaic")).icon(() -> new ItemStack(McaicModItems.NOEL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McaicModItems.CRYSTALSTAFF.get());
				tabData.accept(McaicModItems.MACRYSTAL.get());
				tabData.accept(McaicModItems.MASTAFF.get());
				tabData.accept(McaicModItems.RE_NOEL_BATTLE.get());
				tabData.accept(McaicModItems.RE_NOEL_BSP.get());
				tabData.accept(McaicModBlocks.MCAICTBC.get().asItem());
				tabData.accept(McaicModBlocks.MA_XM.get().asItem());
				tabData.accept(McaicModBlocks.MA_DM.get().asItem());
				tabData.accept(McaicModBlocks.MA_F.get().asItem());
				tabData.accept(McaicModBlocks.MA_JM.get().asItem());
				tabData.accept(McaicModBlocks.MA_JUE.get().asItem());
				tabData.accept(McaicModBlocks.MAPGY.get().asItem());
				tabData.accept(McaicModBlocks.MA_JY.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_ROGE.get().asItem());
				tabData.accept(McaicModItems.TEST_1_SPAWN_EGG.get());
				tabData.accept(McaicModBlocks.MA_SAGA_QB.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_SAGA_QB.get().asItem());
				tabData.accept(McaicModBlocks.MA_SAGA_BB.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_SAGA_BB.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_SAGA_BG.get().asItem());
				tabData.accept(McaicModBlocks.MA_SAGA_BG.get().asItem());
				tabData.accept(McaicModBlocks.MA_SAGA_ZZ.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_SAGA_ZZ.get().asItem());
				tabData.accept(McaicModBlocks.MA_SAGA_YY.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_SAGA_YY.get().asItem());
				tabData.accept(McaicModBlocks.MA_SAGA_FF.get().asItem());
				tabData.accept(McaicModBlocks.L_MA_SAGA_FF.get().asItem());
			})

					.build());
}
