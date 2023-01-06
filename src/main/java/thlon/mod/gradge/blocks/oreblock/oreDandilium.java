package thlon.mod.gradge.blocks.oreblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreDandilium extends Block {
    public oreDandilium() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("oreDandilium");
        setBlockTextureName("gradge:oredandilium");
        setHardness(2F);
        setResistance(1.0F);
    }
}
