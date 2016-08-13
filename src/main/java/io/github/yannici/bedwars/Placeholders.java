package io.github.yannici.bedwars;

import org.bukkit.entity.Player;

import me.clip.placeholderapi.external.EZPlaceholderHook;

public class Placeholders extends EZPlaceholderHook {
	private Main bedwars;
	
	public Placeholders(Main bedwars) {
		super(bedwars, "bedwars");
		
		this.bedwars = bedwars;
	}

	@Override
	public String onPlaceholderRequest(Player p, String identifier) {		
		if (identifier.equals("team_color")) {
			try {
				return String.valueOf(bedwars.getPlayerTeamColor(p));
			} catch(Exception e) {
				return "&f";
			}
		}
		
		if (p == null) {
			return "";
		}
		
		/*switch(identifier){
			case "team_color":
				return String.valueOf(bedwars.getPlayerTeamColor(p));
			case "current_players":
				return String.valueOf(bedwars.getGameInfo(p)[0]);
			case "players":
				return String.valueOf(bedwars.getGameInfo(p)[1]);
			case "max_players":
				return String.valueOf(bedwars.getGameInfo(p)[2]);
		}*/
		
		return null;
	}
}
