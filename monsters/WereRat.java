package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;

public class WereRat extends Monster {
    public WereRat(Room roomIn) {

        this.level = 4;
		this.hp = 24;
		this.mp = 0;
		this.xp = 21;
		this.gp = 22;
		this.battlePower = 13;
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
