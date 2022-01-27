package de.mrvinrsk.brrrrrrclicker.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Clicker extends JavaPlugin {

    private static Clicker instance;

    public static Clicker getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
