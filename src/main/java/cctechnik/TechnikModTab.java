package cctechnik;

import item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TechnikModTab extends CreativeTabs {
    public TechnikModTab() {
        super(TechnikMod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
