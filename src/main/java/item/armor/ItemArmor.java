package item.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import cctechnik.TechnikMod;

public class ItemArmor extends net.minecraft.item.ItemArmor {

    String name;

    public ItemArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name) {
        super(materialIn, 0, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        TechnikMod.proxy.registerItemRenderer(this, 0, name);
    }
}
