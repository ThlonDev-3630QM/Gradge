package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockTungdiriumSteel extends Block {
    public blockTungdiriumSteel() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockTungdiriumSteel");
        setBlockTextureName("gradge:blocktungdiriumsteel");
        setHardness(2F);
        setResistance(1.0F);
    }
}
