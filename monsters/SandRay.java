package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class SandRay extends Monster {
    
    public SandRay(Room roomIn) {

        this.level = 6;
		this.hp = 67;
		this.mp = 10;
		this.xp = 41;
		this.gp = 54;
		this.battlePower = 20;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 110;
		this.magicDefense = 145;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		//final Weapon weapon = new Weapon();
		//this.stolenItems.add(weapon);

    }
}
