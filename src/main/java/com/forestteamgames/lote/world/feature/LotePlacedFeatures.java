package com.forestteamgames.lote.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class LotePlacedFeatures {
    public static final Holder<PlacedFeature> SAKURA_PLACED = PlacementUtils.register("sakura_placed",
    		LoteTreeFeatures.SAKURA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
    
    public static final Holder<PlacedFeature> MAPLE_PLACED = PlacementUtils.register("maple_placed",
    		LoteTreeFeatures.MAPLE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
    
    public static final Holder<PlacedFeature> ENDURA_PLACED = PlacementUtils.register("endura_placed",
    		LoteTreeFeatures.ENDURA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
}
