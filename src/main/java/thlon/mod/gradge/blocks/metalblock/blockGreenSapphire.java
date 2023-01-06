package thlon.mod.gradge.blocks.metalblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockGreenSapphire extends Block {
    public blockGreenSapphire() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("blockGreenSapphire");
        setBlockTextureName("gradge:blockgreensapphire");
        setHardness(2F);
        setResistance(1.0F);
    }
}
