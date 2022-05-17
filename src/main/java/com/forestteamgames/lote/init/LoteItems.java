package com.forestteamgames.lote.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.common.ForgeSpawnEggItem;

import com.forestteamgames.lote.Lote;
import com.forestteamgames.lote.item.*;

public class LoteItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lote.MODID);	
	public static final RegistryObject<Item> ENDORIUM_SWORD = ITEMS.register("endorium_sword",
            () -> new EndoriumSwordItem(LoteTiers.ENDORIUM, 3, -2.4f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
    public static final RegistryObject<Item> ENDORIUM_SHOVEL = ITEMS.register("endorium_shovel",
            () -> new EndoriumShovelItem(LoteTiers.ENDORIUM, 1.5f, -3f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    
    public static final RegistryObject<Item> ENDORIUM_PICKAXE = ITEMS.register("endorium_pickaxe",
            () -> new EndoriumPickaxeItem(LoteTiers.ENDORIUM, 1, -2.8f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    
    public static final RegistryObject<Item> ENDORIUM_AXE = ITEMS.register("endorium_axe",
            () -> new EndoriumAxeItem(LoteTiers.ENDORIUM, 5, -3f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    
    public static final RegistryObject<Item> ENDORIUM_HOE = ITEMS.register("endorium_hoe",
            () -> new EndoriumHoeItem(LoteTiers.ENDORIUM, -5, 1f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));	
	
    public static final RegistryObject<Item> ENDERKNIGHT_HELMET = ITEMS.register("enderknight_helmet",
            () -> new EnderknightArmorItem(LoteArmorMaterials.ENDERKNIGHT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> ENDERKNIGHT_CHESTPLATE = ITEMS.register("enderknight_chestplate",
            () -> new ArmorItem(LoteArmorMaterials.ENDERKNIGHT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> ENDERKNIGHT_LEGGINGS = ITEMS.register("enderknight_leggings",
            () -> new ArmorItem(LoteArmorMaterials.ENDERKNIGHT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> ENDERKNIGHT_BOOTS = ITEMS.register("enderknight_boots",
            () -> new ArmorItem(LoteArmorMaterials.ENDERKNIGHT, EquipmentSlot.FEET,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));    
    
	public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana",
            () -> new SwordItem(Tiers.WOOD, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
	public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana",
            () -> new SwordItem(Tiers.STONE, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
	public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana",
            () -> new SwordItem(Tiers.IRON, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
	public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana",
            () -> new SwordItem(Tiers.GOLD, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
	public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana",
            () -> new SwordItem(Tiers.DIAMOND, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
	public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana",
            () -> new SwordItem(Tiers.NETHERITE, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));

	public static final RegistryObject<Item> ENDORIUM_KATANA = ITEMS.register("endorium_katana",
            () -> new EndoriumSwordItem(LoteTiers.ENDORIUM, 2, -2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));	
	
	public static final RegistryObject<Item> KANABO = ITEMS.register("kanabo",
            () -> new SwordItem(Tiers.IRON, 9, -3.5f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
	
    public static final RegistryObject<Item> MONK_HAT = ITEMS.register("monk_hat",
            () -> new MonkArmorItem(LoteArmorMaterials.MONK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> MONK_CHEST = ITEMS.register("monk_chest",
            () -> new ArmorItem(LoteArmorMaterials.MONK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> MONK_PANTS = ITEMS.register("monk_pants",
            () -> new ArmorItem(LoteArmorMaterials.MONK, EquipmentSlot.LEGS,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> MONK_BOOTS = ITEMS.register("monk_boots",
            () -> new ArmorItem(LoteArmorMaterials.MONK, EquipmentSlot.FEET,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));   	

    public static final RegistryObject<Item> SAMURAI_HELMET = ITEMS.register("samurai_helmet",
            () -> new SamuraiArmorItem(LoteArmorMaterials.SAMURAI, EquipmentSlot.HEAD,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> SAMURAI_CHESTPLATE = ITEMS.register("samurai_chestplate",
            () -> new ArmorItem(LoteArmorMaterials.SAMURAI, EquipmentSlot.CHEST,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> SAMURAI_LEGGINGS = ITEMS.register("samurai_leggings",
            () -> new ArmorItem(LoteArmorMaterials.SAMURAI, EquipmentSlot.LEGS,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));
    public static final RegistryObject<Item> SAMURAI_BOOTS = ITEMS.register("samurai_boots",
            () -> new ArmorItem(LoteArmorMaterials.SAMURAI, EquipmentSlot.FEET,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));       
    
	public static final RegistryObject<Item> MASAMUNE = ITEMS.register("masamune",
            () -> new MasamuneItem(LoteTiers.BOSS_ITEM, 6, -3.2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));		
	
	public static final RegistryObject<Item> DEATHSINGER_BROADSWORD = ITEMS.register("deathsinger_broadsword",
            () -> new DeathsingerBroadswordItem(LoteTiers.BOSS_ITEM, 9, -3.2f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));	
	
	public static final RegistryObject<Item> HEROBRINE_SCYTHE = ITEMS.register("herobrine_scythe",
            () -> new HerobrineScytheItem(LoteTiers.BOSS_ITEM, 8, -3f,
                    new Item.Properties().tab(LoteTabs.LOTE_COMBAT_TAB)));	
	
	
	public static final RegistryObject<Item> RAMEN = ITEMS.register("ramen", () -> new BowlFoodItem(new BowlFoodItem.Properties().
			stacksTo(1).tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.RAMEN)));		
	
	public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.SUSHI)));		
	
	public static final RegistryObject<Item> ONIGIRI = ITEMS.register("onigiri", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.ONIGIRI)));		
	
	public static final RegistryObject<Item> RAW_YAKITORI = ITEMS.register("raw_yakitori", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.RAW_YAKITORI)));		
	
	public static final RegistryObject<Item> YAKITORI = ITEMS.register("yakitori", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.YAKITORI)));		
	
	public static final RegistryObject<Item> DANGO = ITEMS.register("dango", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.DANGO)));	
	
	public static final RegistryObject<Item> SAKE = ITEMS.register("sake", () -> new HoneyBottleItem(new HoneyBottleItem.Properties().
			stacksTo(16).tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.SAKE)));						
	
	public static final RegistryObject<Item> TOFU_CHEESE = ITEMS.register("tofu_cheese", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.TOFU_CHEESE)));		
	
	public static final RegistryObject<Item> TOFU = ITEMS.register("tofu", () -> new BowlFoodItem(new BowlFoodItem.Properties().
			stacksTo(1).tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.TOFU)));			
	
	public static final RegistryObject<Item> BAOZI = ITEMS.register("baozi", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.BAOZI)));	

	public static final RegistryObject<Item> FENZHENGROU = ITEMS.register("fenzhengrou", () -> new BowlFoodItem(new BowlFoodItem.Properties().
			stacksTo(1).tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.FENZHENGROU)));	
		
	public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.CHERRY)));	
	
	public static final RegistryObject<Item> SOUL_BERRIES = ITEMS.register("soul_berries", () -> new Item(new Item.Properties().
			tab(LoteTabs.LOTE_FOOD_TAB).food(LoteFoods.CHERRY)));
	

    public static final RegistryObject<Item> RAW_ENDORIUM = ITEMS.register("raw_endorium",
            () -> new Item(new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	
    
    public static final RegistryObject<Item> ENDORIUM_INGOT = ITEMS.register("endorium_ingot",
            () -> new Item(new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	
    
    public static final RegistryObject<Item> SILK = ITEMS.register("silk",
            () -> new Item(new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	
    
    public static final RegistryObject<Item> ARD = ITEMS.register("ard",
            () -> new Item(new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	    
    
    public static final RegistryObject<Item> RICESEEDS = ITEMS.register("riceseeds",
            () -> new Item(new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	
    
    public static final RegistryObject<Item> RICEFLOUR = ITEMS.register("riceflour",
            () -> new Item(new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	
    
	public static final RegistryObject<Item> ONI = ITEMS.register("oni_egg",
			() -> new ForgeSpawnEggItem(LoteEntities.ONI, -9335864, -13551284, new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));
	
	public static final RegistryObject<Item> RONIN = ITEMS.register("ronin_egg",
			() -> new ForgeSpawnEggItem(LoteEntities.RONIN, -9734292, -3040397, new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));
	
	public static final RegistryObject<Item> VOLTARIS = ITEMS.register("voltaris_egg",
			() -> new ForgeSpawnEggItem(LoteEntities.VOLTARIS, -13224381, -121050, new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));	
	
	public static final RegistryObject<Item> TSUKUYOMI = ITEMS.register("tsukuyomi_egg",
			() -> new ForgeSpawnEggItem(LoteEntities.TSUKUYOMI, -2698284, -16735363, new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));		
	
	public static final RegistryObject<Item> DEATHSINGER = ITEMS.register("deathsinger_egg",
			() -> new ForgeSpawnEggItem(LoteEntities.DEATHSINGER, -11711915, -41907, new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));		
	
	public static final RegistryObject<Item> HEROBRINE = ITEMS.register("herobrine_egg",
			() -> new ForgeSpawnEggItem(LoteEntities.HEROBRINE, -16728386, -1, new Item.Properties().tab(LoteTabs.LOTE_MISC_TAB)));		
	
	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}