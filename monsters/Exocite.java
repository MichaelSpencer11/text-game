package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class Exocite extends Monster {
    public Exocite(Room roomIn) {

        this.level = 11;
		this.hp = 196;
		this.mp = 100;
		this.xp = 162;
		this.gp = 153;
		this.battlePower = 19;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 100;
		this.magicDefense = 150;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		this.drops.add(tonic);
    }
}
