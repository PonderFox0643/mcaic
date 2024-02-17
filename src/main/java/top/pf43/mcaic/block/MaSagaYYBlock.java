
package top.pf43.mcaic.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class MaSagaYYBlock extends Block {
	public MaSagaYYBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).lightLevel(s -> 15).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(7.3, 11.8, 7.3, 7.7, 16.2, 7.7), box(7.25, 14.25, 6.75, 7.75, 14.75, 7.25), box(7.25, 14.25, 7.75, 7.75, 14.75, 8.25), box(6.75, 14.25, 7.25, 7.25, 14.75, 7.75), box(7.75, 14.25, 7.25, 8.25, 14.75, 7.75),
				box(7, 8, 7, 8, 10, 8), box(7, 8, 7, 8, 10, 8), box(7, 8, 7, 8, 10, 8), box(7, 8, 7, 8, 10, 8), box(7, 7.65, 7, 8, 9.65, 8), box(6.15, 9.45, 6.15, 8.85, 10.15, 8.85), box(7, 10, 7, 8, 12, 8), box(7, 10, 7, 8, 12, 8),
				box(7, 10, 7, 8, 12, 8), box(7, 10, 7, 8, 12, 8), box(7, 10, 7, 8, 12, 8));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
