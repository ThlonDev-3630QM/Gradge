package thlon.mod.gradge.blocks.oreblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreSapphire extends Block {
    public oreSapphire() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("oreSapphire");
        setBlockTextureName("gradge:oresapphire");
        setHardness(2F);
        setResistance(1.0F);
    }
}
