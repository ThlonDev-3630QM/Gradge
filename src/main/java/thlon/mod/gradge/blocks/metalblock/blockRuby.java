package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockRuby extends Block {
    public blockRuby() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockRuby");
        setBlockTextureName("gradge:blockruby");
        setHardness(2F);
        setResistance(1.0F);
    }
}
