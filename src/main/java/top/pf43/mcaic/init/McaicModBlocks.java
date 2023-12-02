
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.block.MapgyBlock;
import top.pf43.mcaic.block.MaXmBlock;
import top.pf43.mcaic.block.MaSagaTestBlock;
import top.pf43.mcaic.block.MaJyBlock;
import top.pf43.mcaic.block.MaJueBlock;
import top.pf43.mcaic.block.MaJmBlock;
import top.pf43.mcaic.block.MaFBlock;
import top.pf43.mcaic.block.MaDmBlock;
import top.pf43.mcaic.block.MCAICTBCBlock;
import top.pf43.mcaic.block.LMaSagaTestBlock;
import top.pf43.mcaic.block.LMaRogeBlock;
import top.pf43.mcaic.McaicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class McaicModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McaicMod.MODID);
	public static final RegistryObject<Block> MCAICTBC = REGISTRY.register("mcaictbc", () -> new MCAICTBCBlock());
	public static final RegistryObject<Block> MA_XM = REGISTRY.register("ma_xm", () -> new MaXmBlock());
	public static final RegistryObject<Block> MA_DM = REGISTRY.register("ma_dm", () -> new MaDmBlock());
	public static final RegistryObject<Block> MA_F = REGISTRY.register("ma_f", () -> new MaFBlock());
	public static final RegistryObject<Block> MA_JM = REGISTRY.register("ma_jm", () -> new MaJmBlock());
	public static final RegistryObject<Block> MA_JUE = REGISTRY.register("ma_jue", () -> new MaJueBlock());
	public static final RegistryObject<Block> MAPGY = REGISTRY.register("mapgy", () -> new MapgyBlock());
	public static final RegistryObject<Block> MA_JY = REGISTRY.register("ma_jy", () -> new MaJyBlock());
	public static final RegistryObject<Block> L_MA_ROGE = REGISTRY.register("l_ma_roge", () -> new LMaRogeBlock());
	public static final RegistryObject<Block> L_MA_SAGA_TEST = REGISTRY.register("l_ma_saga_test", () -> new LMaSagaTestBlock());
	public static final RegistryObject<Block> MA_SAGA_TEST = REGISTRY.register("ma_saga_test", () -> new MaSagaTestBlock());
}
