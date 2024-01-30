package xyz.monster.modules;

import xyz.monster.event.Event;
import xyz.monster.modules.enums.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleManager
{
    public static List<Module> modules = new ArrayList<>();
    public Module getModule(Class<? extends Module> clazz) {
        for (Module m : modules) {
            if (m.getClass() == clazz) {
                return m;
            }
        }
        return null;
    }
    public void setup()
    {
        //COMBAT
        //MOVEMENT
        //PLAYER
        //RENDER
    }

    public void handleEvent(Event e)
    {
        List<Module> m = modules.stream().filter(mod ->  mod.enabled).collect(Collectors.toList());
        m.forEach(mod -> mod.onEvent(e));
    }

    public List<Module> getModuleByCat(Category c) {
        return modules.stream().filter(m -> m.category == c).collect(Collectors.toList());
    }
}
