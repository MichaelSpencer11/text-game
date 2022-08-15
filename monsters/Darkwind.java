package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.weapons.AirLancet;

public class Darkwind extends Monster {

    public Darkwind(Room roomIn) {

        //unfinished, needs stats
        this.level = 0;
		this.hp = 0;
		this.mp = 0;
		this.xp = 0;
		this.gp = 0;
		this.battlePower = 0;
		this.hitRate = 0;
		this.magicPower = 0;
		this.speed = 0;
		this.stamina = 0;
		this.defense = 0;
		this.magicDefense = 0;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		final AirLancet airLancet = new AirLancet();
		this.stolenItems.add(airLancet);

    }
    
}
