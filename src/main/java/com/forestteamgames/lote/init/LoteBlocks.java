package com.forestteamgames.lote.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import com.google.common.base.Supplier;

import java.util.function.ToIntFunction;

import com.forestteamgames.lote.Lote;
import com.forestteamgames.lote.block.*;
import com.forestteamgames.lote.world.feature.tree.SakuraTreeGrower;
import com.forestteamgames.lote.world.feature.tree.MapleTreeGrower;
import com.forestteamgames.lote.world.feature.tree.EnduraTreeGrower;
import com.forestteamgames.lote.world.feature.tree.VoidTreeGrower;

public class LoteBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lote.MODID);

	public static final RegistryObject<Block> SAKURA_PLANKS = registerBlock("sakura_planks", () -> new Block(BlockBehaviour.
			Properties.copy(Blocks.OAK_PLANKS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks", () -> new Block(BlockBehaviour.
			Properties.copy(Blocks.OAK_PLANKS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> ENDURA_PLANKS = registerBlock("endura_planks", () -> new Block(BlockBehaviour.
			Properties.copy(Blocks.OAK_PLANKS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);			
	
	public static final RegistryObject<Block> VOID_PLANKS = registerBlock("void_planks", () -> new Block(BlockBehaviour.
			Properties.copy(Blocks.OAK_PLANKS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_LOG = registerBlock("sakura_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> ENDURA_LOG = registerBlock("endura_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> VOID_LOG = registerBlock("void_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> STRIPPED_ENDURA_LOG = registerBlock("stripped_endura_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> STRIPPED_VOID_LOG = registerBlock("stripped_void_log", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_LOG)), LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);					

	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> STRIPPED_ENDURA_WOOD = registerBlock("stripped_endura_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> STRIPPED_VOID_WOOD = registerBlock("stripped_void_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.STRIPPED_OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_WOOD = registerBlock("sakura_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);	

	public static final RegistryObject<Block> ENDURA_WOOD = registerBlock("endura_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> VOID_WOOD = registerBlock("void_wood", () -> new LoteFlammableLogBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_WOOD)), LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> SAKURA_SLAB = registerBlock("sakura_slab", () -> new SlabBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_SLAB)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab", () -> new SlabBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_SLAB)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);	
	
	public static final RegistryObject<Block> ENDURA_SLAB = registerBlock("endura_slab", () -> new SlabBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_SLAB)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> VOID_SLAB = registerBlock("void_slab", () -> new SlabBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_SLAB)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_STAIRS = registerBlock("sakura_stairs", () -> new StairBlock(() -> LoteBlocks.SAKURA_PLANKS.get().defaultBlockState(), 
			BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs", () -> new StairBlock(() -> LoteBlocks.SAKURA_PLANKS.get().defaultBlockState(), 
			BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
			
	
	public static final RegistryObject<Block> ENDURA_STAIRS = registerBlock("endura_stairs", () -> new StairBlock(() -> LoteBlocks.SAKURA_PLANKS.get().defaultBlockState(), 
			BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);		
	
	public static final RegistryObject<Block> VOID_STAIRS = registerBlock("void_stairs", () -> new StairBlock(() -> LoteBlocks.SAKURA_PLANKS.get().defaultBlockState(), 
			BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_BLOCKS_TAB);	

    public static final RegistryObject<Block> END_WILDS_NYLIUM = registerBlock("end_wilds_nylium",
            () -> new EndNyliumBlock(BlockBehaviour.Properties.of(Material.STONE)
            		.requiresCorrectToolForDrops().strength(3.0F, 9.0F).randomTicks().sound(SoundType.NYLIUM)), LoteTabs.LOTE_BLOCKS_TAB);	
	
    public static final RegistryObject<Block> VOID_NYLIUM = registerBlock("void_nylium",
            () -> new EndNyliumBlock(BlockBehaviour.Properties.of(Material.STONE)
            		.requiresCorrectToolForDrops().strength(3.0F, 9.0F).randomTicks().sound(SoundType.NYLIUM)), LoteTabs.LOTE_BLOCKS_TAB);	    
    
    public static final RegistryObject<Block> COAL_ORE_END = registerBlock("coal_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
            		.requiresCorrectToolForDrops().strength(3.0F, 9.0F), UniformInt.of(0, 2)), LoteTabs.LOTE_BLOCKS_TAB);
    
    public static final RegistryObject<Block> IRON_ORE_END = registerBlock("iron_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);	
 
    public static final RegistryObject<Block> COPPER_ORE_END = registerBlock("copper_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);	
    
    public static final RegistryObject<Block> GOLDEN_ORE_END = registerBlock("golden_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);	
    
    public static final RegistryObject<Block> REDSTONE_ORE_END = registerBlock("redstone_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);	
    
    public static final RegistryObject<Block> EMERALD_ORE_END = registerBlock("emerald_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);
    
    public static final RegistryObject<Block> LAPIS_ORE_END = registerBlock("lapis_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);
    
    public static final RegistryObject<Block> DIAMOND_ORE_END = registerBlock("diamond_ore_end",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);
    
    public static final RegistryObject<Block> ENDORIUM_ORE = registerBlock("endorium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 9.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);
    
    public static final RegistryObject<Block> ENDORIUM_BLOCK = registerBlock("endorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)), LoteTabs.LOTE_BLOCKS_TAB);

    public static final RegistryObject<Block> RAW_ENDORIUM_BLOCK = registerBlock("raw_endorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5.0F, 6.0F).requiresCorrectToolForDrops()), LoteTabs.LOTE_BLOCKS_TAB);  	
	
				
    
   public static final RegistryObject<Block> SAKURA_SAPLING = registerBlock("sakura_sapling", 
		   () -> new SaplingBlock(new SakuraTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), LoteTabs.LOTE_DECORATIONS_TAB);    
    
   public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling", 
		   () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), LoteTabs.LOTE_DECORATIONS_TAB);     
   
   public static final RegistryObject<Block> ENDURA_SAPLING = registerBlock("endura_sapling", 
		   () -> new SaplingBlock(new EnduraTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), LoteTabs.LOTE_DECORATIONS_TAB);      
   
   public static final RegistryObject<Block> VOID_SAPLING = registerBlock("void_sapling", 
		   () -> new SaplingBlock(new VoidTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), LoteTabs.LOTE_DECORATIONS_TAB);      
      
	public static final RegistryObject<Block> SAKURA_LEAVES = registerBlock("sakura_leaves", () -> new LeavesBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LEAVES)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 60;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 30;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves", () -> new LeavesBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LEAVES)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 60;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 30;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> ENDURA_LEAVES = registerBlock("endura_leaves", () -> new LeavesBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LEAVES)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 60;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 30;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> VOID_LEAVES = registerBlock("void_leaves", () -> new LeavesBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_LEAVES)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 60;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 30;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_FENCE = registerBlock("sakura_fence", () -> new FenceBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence", () -> new FenceBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> ENDURA_FENCE = registerBlock("endura_fence", () -> new FenceBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> VOID_FENCE = registerBlock("void_fence", () -> new FenceBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_BUTTON = registerBlock("sakura_button", () -> new WoodButtonBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_BUTTON)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button", () -> new WoodButtonBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_BUTTON)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> ENDURA_BUTTON = registerBlock("endura_button", () -> new WoodButtonBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_BUTTON)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> VOID_BUTTON = registerBlock("void_button", () -> new WoodButtonBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_BUTTON)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_PLATE = registerBlock("sakura_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.
			Properties.copy(Blocks.OAK_PRESSURE_PLATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
		
	public static final RegistryObject<Block> MAPLE_PLATE = registerBlock("maple_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.
			Properties.copy(Blocks.OAK_PRESSURE_PLATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> ENDURA_PLATE = registerBlock("endura_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.
			Properties.copy(Blocks.OAK_PRESSURE_PLATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> VOID_PLATE = registerBlock("void_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.
			Properties.copy(Blocks.OAK_PRESSURE_PLATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_DOOR = registerBlock("sakura_door", () -> new DoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_DOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door", () -> new DoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_DOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> ENDURA_DOOR = registerBlock("endura_door", () -> new DoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_DOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> VOID_DOOR = registerBlock("void_door", () -> new DoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_DOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> SAKURA_TRAPDOOR = registerBlock("sakura_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_TRAPDOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_TRAPDOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> ENDURA_TRAPDOOR = registerBlock("endura_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_TRAPDOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> VOID_TRAPDOOR = registerBlock("void_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_TRAPDOOR)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);		
	
	public static final RegistryObject<Block> SAKURA_GATE = registerBlock("sakura_gate", () -> new FenceGateBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE_GATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	

	public static final RegistryObject<Block> MAPLE_GATE = registerBlock("maple_gate", () -> new FenceGateBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE_GATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	

	public static final RegistryObject<Block> ENDURA_GATE = registerBlock("endura_gate", () -> new FenceGateBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE_GATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);	
	
	public static final RegistryObject<Block> VOID_GATE = registerBlock("void_gate", () -> new FenceGateBlock(BlockBehaviour.
			Properties.copy(Blocks.OAK_FENCE_GATE)) {
		@Override
		public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return true;
		}
		
		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}	
		
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}			
	}, LoteTabs.LOTE_DECORATIONS_TAB);
	
	public static final RegistryObject<Block> END_LANTERN = registerBlock("end_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187431_) -> {
  		      return 13;
 		   }).noOcclusion()), LoteTabs.LOTE_DECORATIONS_TAB);  	
	
	public static final RegistryObject<Block> END_CAMPFIRE = registerBlock("end_campfire",
	            () -> new CampfireBlock(false, 2, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD).lightLevel(litBlockEmission(13)).
	            		noOcclusion()), LoteTabs.LOTE_DECORATIONS_TAB);  		   
	   
   // public static final RegistryObject<Block> END_STONE = registerBlock("end_stone",
    //        () -> new EndStoneBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 9.0F)), CreativeModeTab.TAB_BUILDING_BLOCKS);		
	
	private static ToIntFunction<BlockState> litBlockEmission(int p_50760_) {
		return (p_50763_) -> {
			return p_50763_.getValue(BlockStateProperties.LIT) ? p_50760_ : 0;
			};
		}	  
	
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return LoteItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
