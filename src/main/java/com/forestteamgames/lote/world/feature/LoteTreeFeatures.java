package com.forestteamgames.lote.world.feature;

import com.forestteamgames.lote.init.LoteBlocks;
import com.google.common.collect.ImmutableList;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;

import java.util.List;
import java.util.OptionalInt;

public class LoteTreeFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SAKURA_TREE =
            FeatureUtils.register("sakura", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(LoteBlocks.SAKURA_LOG.get()),
                    new StraightTrunkPlacer(2, 4, 2),
                    BlockStateProvider.simple(LoteBlocks.SAKURA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 2, 0)).build());

    public static final Holder<PlacedFeature> SAKURA_CHECKED = PlacementUtils.register("sakura_checked", SAKURA_TREE,
                    PlacementUtils.filteredByBlockSurvival(LoteBlocks.SAKURA_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> SAKURA_SPAWN =
            FeatureUtils.register("sakura_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(SAKURA_CHECKED,
                            0.5F)), SAKURA_CHECKED));
    
    
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MAPLE_TREE =
            FeatureUtils.register("maple", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(LoteBlocks.MAPLE_LOG.get()),
                    new StraightTrunkPlacer(2, 4, 2),
                    BlockStateProvider.simple(LoteBlocks.MAPLE_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 2, 0)).build());

    public static final Holder<PlacedFeature> MAPLE_CHECKED = PlacementUtils.register("maple_checked", MAPLE_TREE,
                    PlacementUtils.filteredByBlockSurvival(LoteBlocks.MAPLE_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MAPLE_SPAWN =
            FeatureUtils.register("maple_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MAPLE_CHECKED,
                            0.5F)), MAPLE_CHECKED));   
    
    
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ENDURA_TREE =
            FeatureUtils.register("endura", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(LoteBlocks.ENDURA_LOG.get()),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    BlockStateProvider.simple(LoteBlocks.ENDURA_LEAVES.get()),
                    new DarkOakFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                    new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())).build());

    public static final Holder<PlacedFeature> ENDURA_CHECKED = PlacementUtils.register("endura_checked", ENDURA_TREE,
                    PlacementUtils.filteredByBlockSurvival(LoteBlocks.ENDURA_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ENDURA_SPAWN =
            FeatureUtils.register("endura_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ENDURA_CHECKED,
                            0.5F)), ENDURA_CHECKED));  
    
    
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> VOID_TREE =
            FeatureUtils.register("void_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(LoteBlocks.VOID_LOG.get()),
                    new MegaJungleTrunkPlacer(10, 2, 19),
                    BlockStateProvider.simple(LoteBlocks.VOID_LEAVES.get()),
                    new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                    new TwoLayersFeatureSize(1, 1, 0)).build());

    public static final Holder<PlacedFeature> VOID_CHECKED = PlacementUtils.register("void_checked", VOID_TREE,
                    PlacementUtils.filteredByBlockSurvival(LoteBlocks.ENDURA_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> VOID_SPAWN =
            FeatureUtils.register("void_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(VOID_CHECKED,
                            0.5F)), VOID_CHECKED));  
}
