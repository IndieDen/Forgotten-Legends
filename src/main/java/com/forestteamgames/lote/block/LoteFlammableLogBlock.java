package com.forestteamgames.lote.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

import com.forestteamgames.lote.init.LoteBlocks;

public class LoteFlammableLogBlock extends RotatedPillarBlock {
    public LoteFlammableLogBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player,
                                           ItemStack stack, ToolAction toolAction) {
        if(stack.getItem() instanceof AxeItem) {
            if(state.is(LoteBlocks.SAKURA_LOG.get())) {
                return LoteBlocks.STRIPPED_SAKURA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(LoteBlocks.SAKURA_WOOD.get())) {
                return LoteBlocks.STRIPPED_SAKURA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            
            if(state.is(LoteBlocks.MAPLE_LOG.get())) {
                return LoteBlocks.STRIPPED_MAPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(LoteBlocks.MAPLE_WOOD.get())) {
                return LoteBlocks.STRIPPED_MAPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            
            if(state.is(LoteBlocks.ENDURA_LOG.get())) {
                return LoteBlocks.STRIPPED_ENDURA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(LoteBlocks.ENDURA_WOOD.get())) {
                return LoteBlocks.STRIPPED_ENDURA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }    
            
            if(state.is(LoteBlocks.VOID_LOG.get())) {
                return LoteBlocks.STRIPPED_VOID_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(LoteBlocks.VOID_WOOD.get())) {
                return LoteBlocks.STRIPPED_VOID_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, world, pos, player, stack, toolAction);
    }
}
