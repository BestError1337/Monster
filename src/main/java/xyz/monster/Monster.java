package xyz.monster;

import org.lwjgl.opengl.Display;
import xyz.monster.modules.ModuleManager;

public class Monster {

    public static Monster INSTANCE = new Monster();
    public static ModuleManager moduleManager = new ModuleManager();

    public void run()
    {
        Display.setTitle("Monster client");

       // this.settingsManager = new SettingsManager();//moduleManager.setup();

       // FontUtil.init();
    }
}
