package item.tool;

import cctechnik.TechnikMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends net.minecraft.item.ItemSpade {
    private String name;

    public ItemShovel(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }
    public void registerItemModel() {
        TechnikMod.proxy.registerItemRenderer(this, 0, name);
    }
}
