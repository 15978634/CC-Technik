package item.tool;

import net.minecraft.item.Item;
import cctechnik.TechnikMod;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {

    private String name;

    public ItemPickaxe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        TechnikMod.proxy.registerItemRenderer(this, 0, name);
    }

}
