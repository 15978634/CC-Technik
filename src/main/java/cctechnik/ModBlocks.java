package cctechnik;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(CreativeTabs.MISC);
    public static BlockOre oreTin = new BlockOre("ore_tin").setCreativeTab(CreativeTabs.MISC);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                oreTin
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                oreTin.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        oreTin.registerItemModel(Item.getItemFromBlock(oreTin));
    }

}
