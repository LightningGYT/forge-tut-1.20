package net.wraith.ImprovedEnd.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wraith.ImprovedEnd.ImprovedEnd;
import net.wraith.ImprovedEnd.Item.custom.MetalDetectorItem;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ImprovedEnd.MODID);

    //Steel
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));


    //Emdium
    public static final RegistryObject<Item> RAW_ENDIUM = ITEMS.register("raw_endium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDIUM_INGOT = ITEMS.register("endium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(
                    new Item.Properties()
                            .durability(100)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
