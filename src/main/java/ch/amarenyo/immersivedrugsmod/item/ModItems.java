package ch.amarenyo.immersivedrugsmod.item;

import ch.amarenyo.immersivedrugsmod.ImmersiveDrugsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveDrugsMod.MOD_ID);

    public static final RegistryObject<Item> HEMP_SEED = ITEMS.register("hemp_seed",

            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
