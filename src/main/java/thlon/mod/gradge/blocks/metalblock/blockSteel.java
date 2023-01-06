package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockSteel extends Block {
    public blockSteel() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockSteel");
        setBlockTextureName("gradge:blockSteel");
        setHardness(2F);
        setResistance(1.0F);
    }
}
