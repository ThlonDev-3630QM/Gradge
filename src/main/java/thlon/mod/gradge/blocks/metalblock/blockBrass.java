package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockBrass extends Block {
    public blockBrass() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockBrass");
        setBlockTextureName("gradge:blockbrass");
        setHardness(2F);
        setResistance(1.0F);
    }
}
