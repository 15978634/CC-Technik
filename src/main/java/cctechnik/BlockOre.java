package cctechnik;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BlockOre extends BlockBase {

    public BlockOre(String name) {
        super(Material.ROCK, name);

        setHarvestLevel("ItemPickaxe",2);
        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
