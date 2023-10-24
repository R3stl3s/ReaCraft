package net.thejacob.reacraft.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thejacob.reacraft.ReaCraft;
import net.thejacob.reacraft.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ReaCraft.MOD_ID);

    public static final RegistryObject<Item> ADAKITE_PEBBLE =
            ITEMS.register("adakite_pebble", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REA_CRAFT).durability(4)));

    public static final RegistryObject<Item> ADAKITE_SPEARHEAD =
            ITEMS.register("adakite_spearhead", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REA_CRAFT)));

    public static final RegistryObject<Item> ANDESITE_PEBBLE =
            ITEMS.register("andesite_pebble", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.REA_CRAFT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
