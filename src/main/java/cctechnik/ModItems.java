package cctechnik;


import item.tool.ItemPickaxe;
import item.tool.ItemShovel;
import item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;


public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MISC);
    public static ItemSword copperSword = new ItemSword(TechnikMod.copperToolMaterial, "copper_sword");
    public static ItemShovel copperShovel = new ItemShovel(TechnikMod.copperToolMaterial, "copper_shovel");
    public static ItemPickaxe copperPickaxe = new ItemPickaxe(TechnikMod.copperToolMaterial, "copper_pickaxe");

    public static void init() {


    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                copperSword,
                copperPickaxe,
                copperShovel
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        copperSword.registerItemModel();
        copperPickaxe.registerItemModel();
        copperShovel.registerItemModel();
    }

}
