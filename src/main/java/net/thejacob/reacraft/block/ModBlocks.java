package net.thejacob.reacraft.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thejacob.reacraft.ReaCraft;
import net.thejacob.reacraft.item.ModCreativeModeTab;
import net.thejacob.reacraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ReaCraft.MOD_ID);

    public static final RegistryObject<Block> ANDESITE_PEBBLE_BLOCK = registerBlock("andesite_pebble_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).instabreak()), ModCreativeModeTab.REA_CRAFT);
    public static final RegistryObject<Block> ADAKITE_PEBBLE_BLOCK = registerBlock("adakite_pebble_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).instabreak()), ModCreativeModeTab.REA_CRAFT);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
