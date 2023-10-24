package net.thejacob.reacraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab REA_CRAFT = new CreativeModeTab("reacraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ANDESITE_PEBBLE.get());
        }
    };
}
