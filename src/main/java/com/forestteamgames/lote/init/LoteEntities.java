package com.forestteamgames.lote.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import com.forestteamgames.lote.entity.monster.OniEntity;
import com.forestteamgames.lote.entity.neutral.RoninEntity;
import com.forestteamgames.lote.entity.monster.VoltarisEntity;
import com.forestteamgames.lote.entity.boss.TsukuyomiEntity;
import com.forestteamgames.lote.entity.boss.DeathsingerEntity;
import com.forestteamgames.lote.entity.boss.HerobrineEntity;
import com.forestteamgames.lote.Lote;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LoteEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Lote.MODID);
	public static final RegistryObject<EntityType<OniEntity>> ONI = register("oni",
			EntityType.Builder.<OniEntity>of(OniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(OniEntity::new)

					.sized(0.6f, 1.8f));
	
	public static final RegistryObject<EntityType<RoninEntity>> RONIN = register("ronin",
			EntityType.Builder.<RoninEntity>of(RoninEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(RoninEntity::new)

					.sized(0.6f, 1.8f));
	
	public static final RegistryObject<EntityType<VoltarisEntity>> VOLTARIS = register("voltaris",
			EntityType.Builder.<VoltarisEntity>of(VoltarisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(VoltarisEntity::new)

					.sized(0.6f, 1.8f));
	
	public static final RegistryObject<EntityType<TsukuyomiEntity>> TSUKUYOMI = register("tsukuyomi",
			EntityType.Builder.<TsukuyomiEntity>of(TsukuyomiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(TsukuyomiEntity::new)

					.sized(0.6f, 1.8f));	
	
	public static final RegistryObject<EntityType<DeathsingerEntity>> DEATHSINGER = register("deathsinger",
			EntityType.Builder.<DeathsingerEntity>of(DeathsingerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(DeathsingerEntity::new)

					.sized(0.6f, 1.8f));
	
	public static final RegistryObject<EntityType<HerobrineEntity>> HEROBRINE = register("herobrine",
			EntityType.Builder.<HerobrineEntity>of(HerobrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(HerobrineEntity::new)

					.sized(0.6f, 1.8f));


	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return ENTITIES.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OniEntity.init();
			RoninEntity.init();
			VoltarisEntity.init();
			TsukuyomiEntity.init();
			DeathsingerEntity.init();
			HerobrineEntity.init();
		});
	}
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ONI.get(), OniEntity.createAttributes().build());
		event.put(RONIN.get(), RoninEntity.createAttributes().build());
		event.put(VOLTARIS.get(), VoltarisEntity.createAttributes().build());
		event.put(TSUKUYOMI.get(), TsukuyomiEntity.createAttributes().build());
		event.put(DEATHSINGER.get(), DeathsingerEntity.createAttributes().build());
		event.put(HEROBRINE.get(), HerobrineEntity.createAttributes().build());
	}
}