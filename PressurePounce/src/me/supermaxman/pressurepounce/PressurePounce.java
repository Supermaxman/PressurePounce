package me.supermaxman.pressurepounce;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;



public class PressurePounce extends JavaPlugin {
	public static PressurePounce plugin;
	public static final Logger log = Logger.getLogger("Minecraft");
	private final PressurePounceListener Listener = new PressurePounceListener(this);

	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(Listener, this);
		
		log.info(getName() + " has been enabled.");
	}

	public void onDisable() {

		log.info(getName() + " has been disabled.");
	}

}