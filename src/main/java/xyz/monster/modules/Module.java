package xyz.monster.modules;

import xyz.monster.event.Event;
import xyz.monster.modules.enums.Category;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;

public class Module
{
    public String name, displayName;
    public int key;
    public Category category;
    public String[] mode;

    public boolean enabled;
    public Minecraft mc = Minecraft.getMinecraft();
    public boolean expanded = false;

    public Module(String name, int key, Category category, String... mode) {
        this.name = name;
        this.key = key;
        this.category = category;
        this.mode = mode;
        setup();
    }

    public void onEnable() {

    }

    public void setup() {

    }

    public  void onDisable() {
        this.enabled = false;
    }

    public void toggle() {
        enabled = !enabled;

        if(enabled)
            onEnable();
        else
            onDisable();
    }

    public void onEvent(Event e) {

    }
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public String[] getMode(){
        return mode;
    }

    public void setMode(String mode){
        this.mode = new String[]{mode};
    }
    public String getDisplayName() {
        return displayName == null ? name : displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public void setKey(int key) {
        this.key = key;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Minecraft getMc() {
        return mc;
    }

    public void setMc(Minecraft mc) {
        this.mc = mc;
    }
}
