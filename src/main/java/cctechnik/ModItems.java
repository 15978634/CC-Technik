package cctechnik;


import item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;


public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MISC);
    public static ItemSword copperSword = new ItemSword(TechnikMod.copperToolMaterial, "copper_sword");

    public static void init() {


    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                copperSword
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        copperSword.registerItemModel();
    }

}
