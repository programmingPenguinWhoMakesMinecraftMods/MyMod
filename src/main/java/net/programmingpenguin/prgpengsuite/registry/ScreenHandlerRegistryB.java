package net.programmingpenguin.prgpengsuite.registry;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.programmingpenguin.prgpengsuite.things.blocks.screen.handler.TestStorageScreenHandler;

public class ScreenHandlerRegistryB {

    public static ScreenHandlerType<TestStorageScreenHandler> BOX_SCREEN_HANDLER;

    public static void init() {
        BOX_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier("penguin:test"), TestStorageScreenHandler::new);
    }
}
