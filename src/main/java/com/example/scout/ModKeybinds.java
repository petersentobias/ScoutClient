package com.example.scout;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import org.lwjgl.glfw.GLFW;

public final class ModKeybinds {
    private ModKeybinds() {}

    public static final KeyMapping.Category CATEGORY =
            KeyMapping.Category.register(
                    ResourceLocation.fromNamespaceAndPath("scoutclient", "main"));

    public static final KeyMapping FREECAM =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.freecam", GLFW.GLFW_KEY_F6, CATEGORY));

    public static final KeyMapping CHEST_MARKERS =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.chest_markers", GLFW.GLFW_KEY_F7, CATEGORY));

    public static final KeyMapping CHUNK_OVERLAY =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.chunk_overlay", GLFW.GLFW_KEY_F8, CATEGORY));

    public static final KeyMapping OPEN_MENU =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.open_menu", GLFW.GLFW_KEY_RIGHT_SHIFT, CATEGORY));

    public static final KeyMapping SHULKER_HIGHLIGHTS =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.shulker_highlights", GLFW.GLFW_KEY_UNKNOWN, CATEGORY));

    public static final KeyMapping ENDER_CHEST_HIGHLIGHTS =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.ender_chest_highlights", GLFW.GLFW_KEY_UNKNOWN, CATEGORY));

    public static final KeyMapping PLAYER_HITBOXES =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.player_hitboxes", GLFW.GLFW_KEY_UNKNOWN, CATEGORY));

    public static final KeyMapping STORAGE_TRACERS =
            KeyBindingHelper.registerKeyBinding(new KeyMapping(
                    "key.scoutclient.storage_tracers", GLFW.GLFW_KEY_UNKNOWN, CATEGORY));
}
