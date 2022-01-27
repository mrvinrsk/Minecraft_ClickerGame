package de.mrvinrsk.brrrrrrclicker.main;

import de.mrvinrsk.brrrrrrclicker.upgrades.ppc.PPC_Test;
import de.mrvinrsk.brrrrrrclicker.util.ClickerUpgrade;
import de.mrvinrsk.brrrrrrclicker.util.UpgradeManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class Clicker extends JavaPlugin {

    private static Clicker instance;

    public static Clicker getInstance() {
        return instance;
    }

    private UpgradeManager manager = UpgradeManager.getInstance();

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;

        registerUpgrades();

        for(ClickerUpgrade upgrade : manager.getUpgrades()) {
            System.out.println(upgrade.getCostForPlayer(Bukkit.getPlayer(UUID.fromString("f04cf578-f7ac-42ef-8603-57c5b3c13603"))));
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    private void registerUpgrades() {
        manager.registerUpgrade(new PPC_Test());
    }

}
