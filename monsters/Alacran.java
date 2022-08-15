package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.weapons.Dirk;

public class Alacran extends Monster {
    public Alacran(Room roomIn) {

        //unfinished, needs stats
        this.level = 6;
		this.hp = 87;
		this.mp = 15;
		this.xp = 37;
		this.gp = 94;
		this.battlePower = 20;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 80;
		this.magicDefense = 135;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Dirk dirk = new Dirk();
		this.stolenItems.add(dirk);

    }
}
