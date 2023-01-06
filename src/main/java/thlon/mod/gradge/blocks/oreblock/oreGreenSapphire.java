package thlon.mod.gradge.blocks.oreblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreGreenSapphire extends Block {
    public oreGreenSapphire() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("oreGreenSapphire");
        setBlockTextureName("gradge:oregreensapphire");
        setHardness(2F);
        setResistance(1.0F);
    }
}
