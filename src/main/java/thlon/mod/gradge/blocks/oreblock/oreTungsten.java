package thlon.mod.gradge.blocks.oreblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreTungsten extends Block {
    public oreTungsten() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("oreTungsten");
        setBlockTextureName("gradge:oretungsten");
        setHardness(2F);
        setResistance(1.0F);
    }
}
