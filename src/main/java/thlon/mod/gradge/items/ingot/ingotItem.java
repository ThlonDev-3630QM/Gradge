package thlon.mod.gradge.items.ingot;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ingotItem extends Item {
    public ingotItem(){
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setMaxStackSize(64);
    }
}
