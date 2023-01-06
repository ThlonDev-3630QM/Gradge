package thlon.mod.gradge;

import net.minecraft.item.Item;
import thlon.mod.gradge.items.dust.*;

public class GradgeItems {
    public static Item dustTungsten;
    public static Item ingotTungsten;
    public static Item dustDandilium;
    public static Item ingotDandilium;
    public static Item dustSteel;
    public static Item ingotSteel;
    public static Item dustTungSteel;
    public static Item ingotTungSteel;
    public static Item dustTungdirium;
    public static Item ingotTungdirium;
    public static Item dustTungdiriumSteel;
    public static Item ingotTungdiriumSteel;
    public static Item dustDandilas;
    public static Item ingotDandilas;
    public static Item dustDandSteel;
    public static Item ingotDandSteel;
    public static Item dustRuby;
    public static Item crystalRuby;
    public static Item dustSapphire;
    public static Item crystalSapphire;
    public static Item dustGreenSapphire;
    public static Item CrystalGreenSapphire;
    public static Item dustBrass;

    public static void ItemRegister(){
        dustBrass = new dustBrass();
        dustDandilas = new dustDandilium();
        dustDandilium = new dustDandilas();
        dustTungsten = new dustTungsten();
        dustDandSteel = new dustDandSteel();
        dustSteel = new dustSteel();
        dustTungSteel = new dustTungSteel();

    }
}
