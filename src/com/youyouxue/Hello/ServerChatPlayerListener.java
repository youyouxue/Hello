package com.youyouxue.Hello;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class ServerChatPlayerListener extends PlayerListener {
	
	public static Hello plugin;
	Logger log = Logger.getLogger("Minecraft");
	
	public ServerChatPlayerListener(Hello instance)	{
		plugin = instance;
	}
	public void onPlayerChat(PlayerChatEvent chat) {
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lowercase = message.toLowerCase();
		ChatColor RED = ChatColor.RED;
		ChatColor WHITE = ChatColor.WHITE;
			if (message_lowercase.equals("?? hello")) {
			p.sendMessage(RED + "[AP] " + WHITE + "Hello " + p.getName() + "!");
			chat.setCancelled(true);
			log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
			} else {
				if (message_lowercase.equals("?? ip")) {
				p.sendMessage(RED + "[AP] " + WHITE + "The IP is s.apmc.us!");
				chat.setCancelled(true);
				log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
				} else {
					if (message_lowercase.equals("?? owner")) {
					p.sendMessage(RED + "[AP] " + WHITE + "The owner is You You Xue!");
					chat.setCancelled(true);
					log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
					} else {
						if (message_lowercase.equals("?? build")) {
						p.sendMessage(RED + "[AP] " + WHITE + "You can build at /warp build!");
						chat.setCancelled(true);
						log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
						} else {
							if (message_lowercase.equals("?? ip")) {
							p.sendMessage(RED + "[AP] " + WHITE + "The IP is s.apmc.us!");
							chat.setCancelled(true);
							log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
							} else {
								if (message_lowercase.equals("?? website")) {
								p.sendMessage(RED + "[AP] " + WHITE + "The website is www.apmc.us!");
								chat.setCancelled(true);
								log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
								} else {
									if (message_lowercase.equals("?? forums")) {
									p.sendMessage(RED + "[AP] " + WHITE + "The forums are located at www.apmc.us/forums!");
									chat.setCancelled(true);
									log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
									} else {
										if (message_lowercase.equals("?? money")) {
										p.sendMessage(RED + "[AP] " + WHITE + "Check your money using /money!");
										p.sendMessage(RED + "[AP] " + WHITE + "Players can receive money or pay money!");
										p.sendMessage(RED + "[AP] " + WHITE + "Learn more on the website (?? website)");
										chat.setCancelled(true);
										log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
										} else {
											if (message_lowercase.equals("?? honeypot")) {
											p.sendMessage(RED + "[AP] " + WHITE + "A HoneyPot is a griefer trap!");
											p.sendMessage(RED + "[AP] " + WHITE + "Some blocks are 'HoneyPots'");
											p.sendMessage(RED + "[AP] " + WHITE + "Break too many, and you will be banned!");
											chat.setCancelled(true);
											log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
											} else {
												if (message_lowercase.equals("?? donate")) {
												p.sendMessage(RED + "[AP] " + WHITE + "Donate today at www.apmc.us!");
												p.sendMessage(RED + "[AP] " + WHITE + "Donators receive special privileges!");
												p.sendMessage(RED + "[AP] " + WHITE + "Read more about it online today!");
												chat.setCancelled(true);
												log.info(p.getName() + " asked the [AP] bot: " + chat.getMessage());
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

