package net.programmingpenguin.prgpengsuite.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final Item CLEANING_FLUID = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("penguin", "cleaning_fluid"), CLEANING_FLUID);
        FuelRegistry.INSTANCE.add(CLEANING_FLUID, 300);
    }
}
