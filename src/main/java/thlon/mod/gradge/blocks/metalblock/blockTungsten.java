package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockTungsten extends Block {
    public blockTungsten() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockTungsten");
        setBlockTextureName("gradge:blocktungsten");
        setHardness(2F);
        setResistance(1.0F);
    }
}
