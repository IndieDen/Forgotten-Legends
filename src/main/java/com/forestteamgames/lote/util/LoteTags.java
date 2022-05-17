package com.forestteamgames.lote.util;

import com.forestteamgames.lote.Lote;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class LoteTags {
    public static class Blocks {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Lote.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MEATS = tag("meats");    	
    
        public static final TagKey<Item> RAMEN_MEAT = tag("ramen_meat");       
      
        public static final TagKey<Item> SAKE_SHROOMS = tag("sake_shrooms");    
        
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Lote.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
