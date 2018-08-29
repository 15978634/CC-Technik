package cctechnik;

import net.minecraft.block.Block;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import proxy.CommonProxy;
import recipe.ModRecipes;
import world.ModWorldGenerator;

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
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(),3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(name + ":init");
        ModRecipes.init();
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
            ModBlocks.registerItemBlocks(event.getRegistry());
            //if not working uncomment this again
            //ModItems.registerModels();
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

    }

}
