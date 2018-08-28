package cctechnik;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.creativetab.CreativeTabs;


public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MISC);

    public static void init() {
        //ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MISC);

    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
    }

}
