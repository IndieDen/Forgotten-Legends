package com.forestteamgames.lote.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;


public class LoteTiers {
    public static final ForgeTier ENDORIUM = new ForgeTier(5, 2571, 10f,
            5f, 18, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(LoteItems.ENDORIUM_INGOT.get()));
    
    public static final ForgeTier BOSS_ITEM = new ForgeTier(3, 2461, 10f,
            5f, 16, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(LoteItems.ARD.get()));
}
