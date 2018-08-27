package cctechnik;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TechnikMod.modId, name = TechnikMod.name, version = TechnikMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class TechnikMod {

    public static final String modId = "tutorial";
    public static final String name = "Tutorial Mod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static TechnikMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
