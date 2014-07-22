package me.supermaxman.pressurepounce;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;


public class PressurePounceListener implements Listener {

	final PressurePounce plugin;

	public PressurePounceListener(PressurePounce plugin) {
		this.plugin = plugin;
	}
	
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if(e.getAction().equals(Action.PHYSICAL)) {
			Player player = e.getPlayer();
			Vector vector = new Vector(0.0, 2.0, 0.0);
			player.setVelocity(vector);
		}
		
	}


}
