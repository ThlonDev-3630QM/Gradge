package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockSapphire extends Block {
    public blockSapphire() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockSapphire");
        setBlockTextureName("gradge:blocksapphire");
        setHardness(2F);
        setResistance(1.0F);
    }
}
