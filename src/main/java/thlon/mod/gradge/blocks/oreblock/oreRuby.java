package thlon.mod.gradge.blocks.oreblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreRuby extends Block {
    public oreRuby() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("oreRuby");
        setBlockTextureName("gradge:oreruby");
        setHardness(2F);
        setResistance(1.0F);
    }
}
