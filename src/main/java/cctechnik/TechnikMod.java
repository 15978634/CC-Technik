package cctechnik;

import block.ModBlocks;
import item.ModItems;
import item.potion.PotionTechnik;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.Potion;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
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

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@Mod(modid = TechnikMod.modId, name = TechnikMod.name, version = TechnikMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class TechnikMod {



    public static final String modId = "cc-technik";
    public static final String name = "CC-Technik Mod";
    public static final String version = "1.0.0";

    public static final TechnikModTab creativeTab = new TechnikModTab();

    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 200, 6, 2, 14);
    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", modId + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final Item.ToolMaterial uraniumToolMaterial = EnumHelper.addToolMaterial("URANIUM", 2, 300, 9, 3, 16);

    public static Potion customPotion;

    @SidedProxy(serverSide = "proxy.CommonProxy", clientSide = "proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static TechnikMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModItems.init();
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(),3);

        Potion[] potionTypes = null;

        for (Field f : Potion.class.getDeclaredFields()) {
            f.setAccessible(true);
            try {
                if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
                    Field modfield = Field.class.getDeclaredField("modifiers");
                    modfield.setAccessible(true);
                    modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

                    potionTypes = (Potion[])f.get(null);
                    final Potion[] newPotionTypes = new Potion[256];
                    System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
                    f.set(null, newPotionTypes);
                }
            }catch (Exception e) {
                System.err.println("Severe error, please report this to the mod author:");
                System.err.println(e);
            }
        }
        MinecraftForge.EVENT_BUS.register(new EventHooks());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(name + ":init");
        ModRecipes.init();

        //customPotion = (new PotionTechnik(32, false, 0)).setIconIndex(0,0);
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
