package com.forestteamgames.lote.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class LoteFoods {
	public static final FoodProperties RAMEN = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.9F).build();	
	
	public static final FoodProperties SUSHI = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();		
	
	public static final FoodProperties ONIGIRI = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();				
	
	public static final FoodProperties RAW_YAKITORI = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.6F).meat().build();
	
	public static final FoodProperties YAKITORI = (new FoodProperties.Builder()).nutrition(4).saturationMod(1F).meat().build();		
	
	public static final FoodProperties DANGO = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2f).build();		
	
	public static final FoodProperties SAKE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.2f).build();	
	
	public static final FoodProperties TOFU_CHEESE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 0), 0.3F).meat().build();	
	
	public static final FoodProperties TOFU = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6f).build();		

	public static final FoodProperties BAOZI = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6f).meat().build();
	
	public static final FoodProperties FENZHENGROU = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.5f).meat().build();		
	
	public static final FoodProperties CHERRY = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1f).build();		
	
}