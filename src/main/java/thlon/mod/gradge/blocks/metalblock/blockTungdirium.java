package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockTungdirium extends Block {
    public blockTungdirium() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockTungdirium");
        setBlockTextureName("gradge:blockTungdirium");
        setHardness(2F);
        setResistance(1.0F);
    }
}
