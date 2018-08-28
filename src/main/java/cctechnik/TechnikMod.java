package cctechnik;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import proxy.CommonProxy;

@Mod(modid = TechnikMod.modId, name = TechnikMod.name, version = TechnikMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class TechnikMod {

    public static final String modId = "cc-technik";
    public static final String name = "CC-Technik Mod";
    public static final String version = "1.0.0";

    @SidedProxy(serverSide = "proxy.CommonProxy", clientSide = "proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static TechnikMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(name + ":init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(name + ":postInit");
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            System.out.println("!!!REGISTEREVENT");
            ModItems.register(event.getRegistry());
            ModItems.registerModels();
        }

    }

}
