package me.NoChance.PvPManager.Dependencies;

import org.bukkit.entity.Player;

public interface AFKDependency extends Dependency {

	public boolean isAFK(Player player);

	public default boolean shouldProtectAFK() {
		return getConfigBoolean("Protect AFK", true);
	}

}
