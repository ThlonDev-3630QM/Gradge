package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockDandilium extends Block {
    public blockDandilium() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockDandilium");
        setBlockTextureName("gradge:dandilium");
        setHardness(2F);
        setResistance(1.0F);
    }
}
