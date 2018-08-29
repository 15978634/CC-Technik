package item.tool;

import net.minecraft.item.Item;
import cctechnik.TechnikMod;

public class ItemSword extends net.minecraft.item.ItemSword {
    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        TechnikMod.proxy.registerItemRenderer(this, 0, name);
    }
}
