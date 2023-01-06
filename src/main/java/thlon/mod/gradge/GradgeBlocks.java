package thlon.mod.gradge;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import thlon.mod.gradge.blocks.metalblock.*;
import thlon.mod.gradge.blocks.oreblock.*;


public class GradgeBlocks {
    public static Block oreTungsten;
    public static Block blockTungsten;
    public static Block oreRuby;
    public static Block blockRuby;
    public static Block oreSapphire;
    public static Block blockSapphire;
    public static Block oreGreenSapphire;
    public static Block blockGreenSapphire;
    public static Block oreDandilium;
    public static Block blockDandilium;
    public static Block blockSteel;
    public static Block blockTungSteel;
    public static Block blockTungdirium;
    public static Block blockTungdiriumSteel;
    public static Block blockBrass;
    public static Block blockDandilas;
    public static Block blockDandSteel;

    public static void blockRegister(){
        oreTungsten = new oreTungsten();
        oreRuby = new oreRuby();
        oreSapphire = new oreSapphire();
        oreGreenSapphire = new oreGreenSapphire();
        oreDandilium = new oreDandilium();
        blockTungsten = new blockTungsten();
        blockRuby = new blockRuby();
        blockSapphire = new blockSapphire();
        blockGreenSapphire = new blockGreenSapphire();
        blockDandilium = new blockDandilium();
        blockSteel = new blockSteel();
        blockTungSteel = new blockTungSteel();
        blockTungdirium = new blockTungdirium();
        blockTungdiriumSteel = new blockTungdiriumSteel();
        blockBrass = new blockBrass();
        blockDandilas = new blockDandilas();
        blockDandSteel = new blockDandSteel();
        GameRegistry.registerBlock(oreTungsten, "oreTungsten");
        GameRegistry.registerBlock(oreRuby, "oreRuby");
        GameRegistry.registerBlock(oreSapphire, "oreSapphire");
        GameRegistry.registerBlock(oreGreenSapphire, "oreGreenSapphire");
        GameRegistry.registerBlock(oreDandilium, "oreDandilium");
        GameRegistry.registerBlock(blockTungsten, "blockTungsten");
        GameRegistry.registerBlock(blockSapphire, "blockSapphire");
        GameRegistry.registerBlock(blockGreenSapphire, "blockGreenSapphire");
        GameRegistry.registerBlock(blockDandilium, "blockDandilium");
        GameRegistry.registerBlock(blockSteel, "blockSteel");
        GameRegistry.registerBlock(blockTungSteel, "blockTungSteel");
        GameRegistry.registerBlock(blockTungdirium, "blockTungdirium");
        GameRegistry.registerBlock(blockTungdiriumSteel, "blockTungdiriumSteel");
        GameRegistry.registerBlock(blockBrass, "blockBrass");
        GameRegistry.registerBlock(blockDandilas, "blockDandilas");
        GameRegistry.registerBlock(blockDandSteel, "blockDandSteel");



    }
}
