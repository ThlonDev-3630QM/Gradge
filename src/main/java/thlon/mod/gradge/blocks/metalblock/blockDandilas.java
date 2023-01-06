package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockDandilas extends Block {
    public blockDandilas() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockDandilas");
        setBlockTextureName("gradge:blockdandilas");
        setHardness(2F);
        setResistance(1.0F);
    }
}
