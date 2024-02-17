
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.block.MapgyBlock;
import top.pf43.mcaic.block.MaXmBlock;
import top.pf43.mcaic.block.MaSagaZZBlock;
import top.pf43.mcaic.block.MaSagaYYBlock;
import top.pf43.mcaic.block.MaSagaTestBlock;
import top.pf43.mcaic.block.MaSagaQBBlock;
import top.pf43.mcaic.block.MaSagaFFBlock;
import top.pf43.mcaic.block.MaSagaBGBlock;
import top.pf43.mcaic.block.MaSagaBBBlock;
import top.pf43.mcaic.block.MaJyBlock;
import top.pf43.mcaic.block.MaJueBlock;
import top.pf43.mcaic.block.MaJmBlock;
import top.pf43.mcaic.block.MaFBlock;
import top.pf43.mcaic.block.MaDmBlock;
import top.pf43.mcaic.block.MCAICTBCBlock;
import top.pf43.mcaic.block.LMaSagaZZBlock;
import top.pf43.mcaic.block.LMaSagaYYBlock;
import top.pf43.mcaic.block.LMaSagaTestBlock;
import top.pf43.mcaic.block.LMaSagaQBBlock;
import top.pf43.mcaic.block.LMaSagaFFBlock;
import top.pf43.mcaic.block.LMaSagaBGBlock;
import top.pf43.mcaic.block.LMaSagaBBBlock;
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
	public static final RegistryObject<Block> MA_SAGA_QB = REGISTRY.register("ma_saga_qb", () -> new MaSagaQBBlock());
	public static final RegistryObject<Block> L_MA_SAGA_QB = REGISTRY.register("l_ma_saga_qb", () -> new LMaSagaQBBlock());
	public static final RegistryObject<Block> MA_SAGA_BB = REGISTRY.register("ma_saga_bb", () -> new MaSagaBBBlock());
	public static final RegistryObject<Block> L_MA_SAGA_BB = REGISTRY.register("l_ma_saga_bb", () -> new LMaSagaBBBlock());
	public static final RegistryObject<Block> L_MA_SAGA_BG = REGISTRY.register("l_ma_saga_bg", () -> new LMaSagaBGBlock());
	public static final RegistryObject<Block> MA_SAGA_BG = REGISTRY.register("ma_saga_bg", () -> new MaSagaBGBlock());
	public static final RegistryObject<Block> MA_SAGA_ZZ = REGISTRY.register("ma_saga_zz", () -> new MaSagaZZBlock());
	public static final RegistryObject<Block> L_MA_SAGA_ZZ = REGISTRY.register("l_ma_saga_zz", () -> new LMaSagaZZBlock());
	public static final RegistryObject<Block> MA_SAGA_YY = REGISTRY.register("ma_saga_yy", () -> new MaSagaYYBlock());
	public static final RegistryObject<Block> L_MA_SAGA_YY = REGISTRY.register("l_ma_saga_yy", () -> new LMaSagaYYBlock());
	public static final RegistryObject<Block> MA_SAGA_FF = REGISTRY.register("ma_saga_ff", () -> new MaSagaFFBlock());
	public static final RegistryObject<Block> L_MA_SAGA_FF = REGISTRY.register("l_ma_saga_ff", () -> new LMaSagaFFBlock());
}
