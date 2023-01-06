package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockTungSteel extends Block {
    public blockTungSteel() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockTungSteel");
        setBlockTextureName("gradge:blocktungsteel");
        setHardness(2F);
        setResistance(1.0F);
    }
}
