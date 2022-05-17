package com.forestteamgames.lote.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import com.forestteamgames.lote.entity.boss.TsukuyomiEntity;
import com.forestteamgames.lote.entity.monster.VoltarisEntity;

public class TsukuyomiRenderer extends HumanoidMobRenderer<TsukuyomiEntity, HumanoidModel<TsukuyomiEntity>> {
	public TsukuyomiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(TsukuyomiEntity entity) {
		return new ResourceLocation("lote:textures/entity/tsukuyomi.png");
	}
}