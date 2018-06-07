package com.game.src.main.waves;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityE;
import com.game.src.main.enemies.BoneyBoi;
import com.game.src.main.enemies.CuChulainn;
import com.game.src.main.enemies.DontSpookMeKirei;
import com.game.src.main.enemies.DontSpookMeKirei1;
import com.game.src.main.enemies.DontSpookMeKirei2;
import com.game.src.main.enemies.DontSpookMeKirei3;
import com.game.src.main.enemies.Humunculus;
import com.game.src.main.enemies.Medea;
import com.game.src.main.enemies.bosses.GilgameshBoss;
import com.game.src.main.enemies.bosses.Jesus;
import com.game.src.main.enemies.bosses.LoliBoss;
import com.game.src.main.graphics.Textures;

public class Wave1 {
	private int wave=1;

	public void spawnEnemy(Controller c, Textures tex, Game game, Player p) {
		
		
		if(c.getSeconds()==1 && c.getTicks()==0 && wave==1) {
			c.addEntityE(new LoliBoss(Game.WIDTH-20,10.0, tex, p,c,4,34,10));
			c.setTicks(0);
			wave++;
		}
		
	}
	
	
	
	
	
	
}
