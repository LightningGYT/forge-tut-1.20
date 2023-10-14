package net.wraith.ImprovedEnd.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wraith.ImprovedEnd.ImprovedEnd;
import net.wraith.ImprovedEnd.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImprovedEnd.MODID);

    public static final RegistryObject<CreativeModeTab> TUT_TAB =
            CREATE_MODE_TABS.register("tut_tab",
                    () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItem.STEEL.get()))
                            .title(Component.translatable("creativetab.tut_tab"))
                            .displayItems((pParameters, pOutput) -> {

                                //Steel
                                pOutput.accept(ModItem.STEEL.get());
                                pOutput.accept(ModBlocks.STEEL_BLOCK.get());

                                // Endium
                                pOutput.accept(ModBlocks.ENDIUM_ORE.get());
                                pOutput.accept(ModBlocks.ENDIUM_BLOCK.get());
                                pOutput.accept(ModItem.RAW_ENDIUM.get());
                                pOutput.accept(ModItem.ENDIUM_INGOT.get());

                                // Other Items
                                pOutput.accept(ModItem.METAL_DETECTOR.get());

                            })
                            .build());

    public static void register(IEventBus eventBus){
       CREATE_MODE_TABS.register(eventBus);
    }
}
