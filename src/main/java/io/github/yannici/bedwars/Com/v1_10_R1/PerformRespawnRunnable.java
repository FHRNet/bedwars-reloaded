package io.github.yannici.bedwars.Com.v1_10_R1;

import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import net.minecraft.server.v1_10_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_10_R1.PacketPlayInClientCommand.EnumClientCommand;

public class PerformRespawnRunnable extends BukkitRunnable {

	private Player player = null;

	public PerformRespawnRunnable(Player player) {
		this.player = player;
	}

	@Override
	public void run() {
		PacketPlayInClientCommand clientCommand = new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN);
		CraftPlayer cp = (CraftPlayer) player;

		cp.getHandle().playerConnection.a(clientCommand);
	}

}
