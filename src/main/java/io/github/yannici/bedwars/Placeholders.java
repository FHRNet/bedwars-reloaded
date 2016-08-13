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
			return String.valueOf(bedwars.getPlayerTeamColor(p));
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
		
		if (p == null) {
			return "";
		}
		return null;
	}
}
