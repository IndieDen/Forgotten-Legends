package com.forestteamgames.lote;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.Sheets;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

import com.forestteamgames.lote.init.*;

@Mod("lote")
public class Lote {
	public static final Logger LOGGER = LogManager.getLogger(Lote.class);
	public static final String MODID = "lote";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public Lote() {
		LoteTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		LoteBlocks.BLOCKS.register(bus);
		LoteItems.ITEMS.register(bus);
		LoteEntities.ENTITIES.register(bus);
		bus.addListener(this::clientSetup);
	}
	
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.SAKURA_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.SAKURA_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.MAPLE_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.MAPLE_TRAPDOOR.get(), RenderType.translucent());
        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.ENDURA_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.ENDURA_TRAPDOOR.get(), RenderType.translucent());
        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.VOID_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.VOID_TRAPDOOR.get(), RenderType.translucent());        
        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.SAKURA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.SAKURA_SAPLING.get(), RenderType.cutout());
        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.ENDURA_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.ENDURA_SAPLING.get(), RenderType.cutout());
                
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.VOID_LEAVES.get(), RenderType.cutout());        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.VOID_SAPLING.get(), RenderType.cutout());        
        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.END_LANTERN.get(), RenderType.cutout());        
        ItemBlockRenderTypes.setRenderLayer(LoteBlocks.END_CAMPFIRE.get(), RenderType.cutout());
    }	
	
	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
