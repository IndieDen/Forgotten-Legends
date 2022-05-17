package com.forestteamgames.lote.world.feature.tree;

import com.forestteamgames.lote.world.feature.LoteTreeFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class VoidTreeGrower extends AbstractMegaTreeGrower {
	   @Nullable
	   protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204321_, boolean p_204322_) {
	      return null;
	   }

	   @Nullable
	   protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredMegaFeature(Random p_204324_) {
		      return LoteTreeFeatures.VOID_TREE;
		   }
	}
