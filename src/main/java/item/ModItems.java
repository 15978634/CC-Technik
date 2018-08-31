package item;


import cctechnik.TechnikMod;
import item.armor.ItemArmor;
import item.tool.ItemAxe;
import item.tool.ItemPickaxe;
import item.tool.ItemShovel;
import item.tool.ItemSword;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;


public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(TechnikMod.creativeTab);
    public static ItemBase ingotTin = new ItemBase("ingot_tin").setCreativeTab(TechnikMod.creativeTab);

    public static ItemSword copperSword = new ItemSword(TechnikMod.copperToolMaterial, "copper_sword");
    public static ItemShovel copperShovel = new ItemShovel(TechnikMod.copperToolMaterial, "copper_shovel");
    public static ItemPickaxe copperPickaxe = new ItemPickaxe(TechnikMod.copperToolMaterial, "copper_pickaxe");
    public static ItemAxe copperAxe = new ItemAxe(TechnikMod.copperToolMaterial, "copper_axe");

    public static ItemArmor copperHelmet = new ItemArmor(TechnikMod.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copper_helmet");
    public static ItemArmor copperChestplate = new ItemArmor(TechnikMod.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copper_chestplate");
    public static ItemArmor copperLeggings  = new ItemArmor(TechnikMod.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copper_leggings");
    public static ItemArmor copperBoots = new ItemArmor(TechnikMod.copperArmorMaterial, EntityEquipmentSlot.FEET, "copper_boots");

    public static void init() {


    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                ingotTin,
                copperSword,
                copperPickaxe,
                copperShovel,
                copperAxe,
                copperHelmet,
                copperChestplate,
                copperLeggings,
                copperBoots
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        ingotTin.registerItemModel();
        copperSword.registerItemModel();
        copperPickaxe.registerItemModel();
        copperShovel.registerItemModel();
        copperAxe.registerItemModel();
        copperHelmet.registerItemModel();
        copperChestplate.registerItemModel();
        copperLeggings.registerItemModel();
        copperBoots.registerItemModel();
    }

}
