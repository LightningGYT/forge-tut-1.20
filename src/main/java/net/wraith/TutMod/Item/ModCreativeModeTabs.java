package net.wraith.TutMod.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wraith.TutMod.TutMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutMod.MODID);

    public static final RegistryObject<CreativeModeTab> TUT_TAB =
            CREATE_MODE_TABS.register("tut_tab",
                    () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItem.STEEL.get()))
                            .title(Component.translatable("creativetab.tut_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItem.STEEL.get());
                            })
                            .build());

    public static void register(IEventBus eventBus){
       CREATE_MODE_TABS.register(eventBus);
    }
}
