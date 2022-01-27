package de.mrvinrsk.brrrrrrclicker.util;

import org.bukkit.entity.Player;

/**
 * This class represents an Upgrade of any type.
 * See also: {@link }
 */
public abstract class ClickerUpgrade {

    /**
     * Get the base price, which is the price for the first time someone buys the upgrade.
     * @return the base price.
     */
    abstract int getBaseCost();

    /**
     * Get the highest possible level for the upgrade.
     * @return the highest possible level.
     */
    abstract int getMaxLevel();

    public int getCostForPlayer(Player player) {
        return getBaseCost() * UpgradeManager.getInstance().getUpgradeLevel(player, this);
    }

}
