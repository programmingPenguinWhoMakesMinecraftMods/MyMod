package net.programmingpenguin.prgpengsuite.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.things.blocks.container.TestFactoryBlock;
import net.programmingpenguin.prgpengsuite.things.blocks.container.TestStorageBlock;
import net.programmingpenguin.prgpengsuite.things.blocks.furniture.Test;
import net.programmingpenguin.prgpengsuite.things.blocks.ores.CopperOre;

public class BlockRegistry {

    public static final Block TEST = new Test(FabricBlockSettings.of(Material.METAL).hardness(1f));
    public static final Block COPPER_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block SILVER_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3.8f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block URANIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(19f, 12f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block PLUTONIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(12f, 9f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block BERYLLIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(7.7f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TITANIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(7f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block LITHIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2.7f, 1.7f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block COBALT_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3f, 2.2f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block PALLADIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(7f, 4f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block PLATINUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TUNGSTEN_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3f, 2f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block NIOBIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(5f, 2f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TRITIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block HELIUM_3_DEPOSIT = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block FRANCIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TERBIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TANTALUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block MOLYBDENUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TEST_STORAGE_BLOCK = new TestStorageBlock(FabricBlockSettings.copyOf(Blocks.BARREL));
    public static final Block TEST_FACTORY_BLOCK = new TestFactoryBlock(FabricBlockSettings.copyOf(Blocks.BARREL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("penguin", "test"), TEST);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "plutonium_ore"), PLUTONIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "beryllium_ore"), BERYLLIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "lithium_ore"), LITHIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "palladium_ore"), PALLADIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "niobium_ore"), NIOBIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "tritium_ore"), TRITIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "helium_3_deposit"), HELIUM_3_DEPOSIT);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "francium_ore"), FRANCIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "terbium_ore"), TERBIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "tantalum_ore"), TANTALUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "molybdenum_ore"), MOLYBDENUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "lmao"), TEST_STORAGE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("penguin", "factory"), TEST_FACTORY_BLOCK);


        //Blocks
        Registry.register(Registry.ITEM, new Identifier("penguin", "test"), new BlockItem(TEST, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "uranium_ore"), new BlockItem(URANIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "plutonium_ore"), new BlockItem(PLUTONIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "beryllium_ore"), new BlockItem(BERYLLIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "titanium_ore"), new BlockItem(TITANIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "lithium_ore"), new BlockItem(LITHIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "cobalt_ore"), new BlockItem(COBALT_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "palladium_ore"), new BlockItem(PALLADIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "platinum_ore"), new BlockItem(PLATINUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "niobium_ore"), new BlockItem(NIOBIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "tritium_ore"), new BlockItem(TRITIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "helium_3_deposit"), new BlockItem(HELIUM_3_DEPOSIT, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "francium_ore"), new BlockItem(FRANCIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "terbium_ore"), new BlockItem(TERBIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "tantalum_ore"), new BlockItem(TANTALUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "molybdenum_ore"), new BlockItem(MOLYBDENUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "lmao"), new BlockItem(TEST_STORAGE_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("penguin", "factory"), new BlockItem(TEST_FACTORY_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}
