package cctechnik;


import item.tool.ItemAxe;
import item.tool.ItemPickaxe;
import item.tool.ItemShovel;
import item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;


public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(TechnikMod.creativeTab);
    public static ItemBase ingotTin = new ItemBase("ingot_tin").setCreativeTab(TechnikMod.creativeTab);

    public static ItemSword copperSword = new ItemSword(TechnikMod.copperToolMaterial, "copper_sword");
    public static ItemShovel copperShovel = new ItemShovel(TechnikMod.copperToolMaterial, "copper_shovel");
    public static ItemPickaxe copperPickaxe = new ItemPickaxe(TechnikMod.copperToolMaterial, "copper_pickaxe");
    public static ItemAxe copperAxe = new ItemAxe(TechnikMod.copperToolMaterial, "copper_axe");

    public static void init() {


    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                ingotTin,
                copperSword,
                copperPickaxe,
                copperShovel,
                copperAxe
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        ingotTin.registerItemModel();
        copperSword.registerItemModel();
        copperPickaxe.registerItemModel();
        copperShovel.registerItemModel();
        copperAxe.registerItemModel();

    }

}
