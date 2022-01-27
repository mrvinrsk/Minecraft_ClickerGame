package de.mrvinrsk.brrrrrrclicker.util;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class UpgradeManager {

    private static UpgradeManager manager;

    /**
     * Get an instance of this class.
     *
     * @return the instance.
     */
    public static UpgradeManager getInstance() {
        if (manager == null) {
            manager = new UpgradeManager();
        }

        return manager;
    }


    private static List<ClickerUpgrade> upgrades = new ArrayList<>();

    public List<ClickerUpgrade> getUpgrades() {
        return upgrades;
    }

    public void registerUpgrade(ClickerUpgrade upgrade) {
        upgrades.add(upgrade);
    }

    public int getUpgradeLevel(Player p, ClickerUpgrade upgrade) {
        return 5; // TODO
    }

}
