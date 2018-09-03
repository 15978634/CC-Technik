package block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(CreativeTabs.MISC);
    public static BlockOre oreTin = new BlockOre("ore_tin").setCreativeTab(CreativeTabs.MISC);
    public static BlockOre oreUranium = new BlockOre("ore_tin").setCreativeTab(CreativeTabs.MISC);

    public static BlockBase basicAlloyFurnace = new BlockBase(Material.ROCK,"basicAlloyFurnace");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                oreTin,
                oreUranium
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                oreTin.createItemBlock(),
                oreUranium.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        oreTin.registerItemModel(Item.getItemFromBlock(oreTin));
        oreUranium.registerItemModel(Item.getItemFromBlock(oreUranium));
    }

}
