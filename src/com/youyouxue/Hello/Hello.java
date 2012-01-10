package com.youyouxue.Hello;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Hello extends JavaPlugin {
	
	public static Hello plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	public final ServerChatPlayerListener playerListener = new ServerChatPlayerListener(this);
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		// Gives name of the plugin and confirmation of disability.
		this.logger.info("[AP] " + pdfFile.getName() + " by youyouxue successfully disabled.");
	}
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_CHAT, this.playerListener, Event.Priority.Normal, this);
		PluginDescriptionFile pdfFile = this.getDescription();
		// Gives startup message with name and version number!
		this.logger.info("[AP] " + pdfFile.getName() + " v" + pdfFile.getVersion() + " by youyouxue has been enabled.");	
		
	}
}

