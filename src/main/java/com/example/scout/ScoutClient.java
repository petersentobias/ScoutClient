package com.example.scout;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.network.chat.Component;

public final class ScoutClient implements ClientModInitializer {
    private boolean freecamPreview;
    private boolean chestMarkers;
    private boolean chunkOverlay;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (ModKeybinds.FREECAM.consumeClick()) {
                freecamPreview = !freecamPreview;
                notify(client, "Freecam preview", freecamPreview);
            }
            while (ModKeybinds.CHEST_MARKERS.consumeClick()) {
                chestMarkers = !chestMarkers;
                notify(client, "Chest markers", chestMarkers);
            }
            while (ModKeybinds.CHUNK_OVERLAY.consumeClick()) {
                chunkOverlay = !chunkOverlay;
                if (client.player != null) {
                    String message = chunkOverlay
                            ? "Chunk: " + Math.floorDiv((int) Math.floor(client.player.getX()), 16)
                              + ", " + Math.floorDiv((int) Math.floor(client.player.getZ()), 16)
                            : "Chunk coordinates: OFF";
                    client.player.displayClientMessage(Component.literal(message), true);
                }
            }
            while (ModKeybinds.OPEN_MENU.consumeClick()) {
                if (client.player != null) {
                    client.player.displayClientMessage(
                            Component.literal("Scout Client: F6 preview, F7 chest markers, F8 chunk coordinates"),
                            true);
                }
            }
            while (ModKeybinds.SHULKER_HIGHLIGHTS.consumeClick()) {
                VisualFeatures.shulkerHighlights = !VisualFeatures.shulkerHighlights;
                notify(client, "Shulker highlights (placeholder)", VisualFeatures.shulkerHighlights);
            }
            while (ModKeybinds.ENDER_CHEST_HIGHLIGHTS.consumeClick()) {
                VisualFeatures.enderChestHighlights = !VisualFeatures.enderChestHighlights;
                notify(client, "Ender chest highlights (placeholder)", VisualFeatures.enderChestHighlights);
            }
            while (ModKeybinds.PLAYER_HITBOXES.consumeClick()) {
                VisualFeatures.playerHitboxes = !VisualFeatures.playerHitboxes;
                notify(client, "Player hitboxes (placeholder)", VisualFeatures.playerHitboxes);
            }
            while (ModKeybinds.STORAGE_TRACERS.consumeClick()) {
                VisualFeatures.storageTracers = !VisualFeatures.storageTracers;
                notify(client, "Storage tracers (placeholder)", VisualFeatures.storageTracers);
            }
        });
    }

    private static void notify(net.minecraft.client.Minecraft client, String feature, boolean enabled) {
        if (client.player != null) {
            client.player.displayClientMessage(
                    Component.literal(feature + ": " + (enabled ? "ON" : "OFF")), true);
        }
    }
}
