package com.forestteamgames.lote.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LoteTabs {
	public static CreativeModeTab LOTE_BLOCKS_TAB;
	public static CreativeModeTab LOTE_DECORATIONS_TAB;
	public static CreativeModeTab LOTE_COMBAT_TAB;
	public static CreativeModeTab LOTE_FOOD_TAB;
	public static CreativeModeTab LOTE_MISC_TAB;

	public static void load() {
		LOTE_BLOCKS_TAB = new CreativeModeTab("lote_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LoteBlocks.SAKURA_LOG.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		LOTE_DECORATIONS_TAB = new CreativeModeTab("lote_decorations") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LoteBlocks.END_CAMPFIRE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		LOTE_COMBAT_TAB = new CreativeModeTab("lote_combat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LoteItems.IRON_KATANA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		LOTE_FOOD_TAB = new CreativeModeTab("lote_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LoteItems.YAKITORI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		LOTE_MISC_TAB = new CreativeModeTab("lote_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LoteItems.ENDORIUM_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}