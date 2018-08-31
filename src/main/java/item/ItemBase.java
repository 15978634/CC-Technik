package item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cctechnik.TechnikMod;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TechnikMod.creativeTab);
    }

    public void registerItemModel() {
        TechnikMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
