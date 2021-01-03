package net.programmingpenguin.prgpengsuite.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.programmingpenguin.prgpengsuite.registry.ScreenHandlerRegistryB;
import net.programmingpenguin.prgpengsuite.things.miscblocks.screen.TestStorageScreen;

@Environment(EnvType.CLIENT)
public class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ScreenHandlerRegistryB.BOX_SCREEN_HANDLER, TestStorageScreen::new);
    }

}
