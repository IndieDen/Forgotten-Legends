package com.forestteamgames.lote.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.forestteamgames.lote.client.renderer.OniRenderer;
import com.forestteamgames.lote.client.renderer.RoninRenderer;
import com.forestteamgames.lote.client.renderer.VoltarisRenderer;
import com.forestteamgames.lote.client.renderer.TsukuyomiRenderer;
import com.forestteamgames.lote.client.renderer.DeathsingerRenderer;
import com.forestteamgames.lote.client.renderer.HerobrineRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LoteEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LoteEntities.ONI.get(), OniRenderer::new);
		event.registerEntityRenderer(LoteEntities.RONIN.get(), RoninRenderer::new);
		event.registerEntityRenderer(LoteEntities.VOLTARIS.get(), VoltarisRenderer::new);
		event.registerEntityRenderer(LoteEntities.TSUKUYOMI.get(), TsukuyomiRenderer::new);
		event.registerEntityRenderer(LoteEntities.DEATHSINGER.get(), DeathsingerRenderer::new);
		event.registerEntityRenderer(LoteEntities.HEROBRINE.get(), HerobrineRenderer::new);
	}
}