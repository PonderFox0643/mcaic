
package top.pf43.mcaic.entity;

import top.pf43.mcaic.init.McaicModItems;
import top.pf43.mcaic.init.McaicModEntities;
import top.pf43.mcaic.init.McaicModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

public class Test1Entity extends Monster {
	public Test1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(McaicModEntities.TEST_1.get(), world);
	}

	public Test1Entity(EntityType<Test1Entity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 1;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new LeapAtTargetGoal(this, (float) 0.5));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(6, new RemoveBlockGoal(McaicModBlocks.MA_F.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(7, new RemoveBlockGoal(McaicModBlocks.MA_XM.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(8, new RemoveBlockGoal(McaicModBlocks.MA_DM.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(9, new RemoveBlockGoal(McaicModBlocks.MA_JM.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(10, new RemoveBlockGoal(McaicModBlocks.MA_JUE.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(11, new RemoveBlockGoal(McaicModBlocks.MAPGY.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(12, new RemoveBlockGoal(McaicModBlocks.MA_JY.get(), this, 0.5, (int) 3));
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(14, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(McaicModItems.RE_NOEL_BSP.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
