package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockDandSteel extends Block {
    public blockDandSteel() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockDandSteel");
        setBlockTextureName("gradge:blockdandsteel");
        setHardness(2F);
        setResistance(1.0F);
    }
}
