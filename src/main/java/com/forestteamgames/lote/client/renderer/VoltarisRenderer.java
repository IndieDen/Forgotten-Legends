package com.forestteamgames.lote.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import com.forestteamgames.lote.entity.monster.VoltarisEntity;

public class VoltarisRenderer extends HumanoidMobRenderer<VoltarisEntity, HumanoidModel<VoltarisEntity>> {
	public VoltarisRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<VoltarisEntity, HumanoidModel<VoltarisEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("lote:textures/entity/voltaris/tygren_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(VoltarisEntity entity) {
		return new ResourceLocation("lote:textures/entity/voltaris/tygren.png");
	}
}