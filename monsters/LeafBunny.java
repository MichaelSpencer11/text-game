package textgame.monsters;

import textgame.Monster;
import textgame.Room;

public class LeafBunny extends Monster {
    public LeafBunny(Room roomIn) {

        this.level = 5;
		this.hp = 33;
		this.mp = 0;
		this.xp = 24;
		this.gp = 45;
		this.battlePower = 13;
		this.hitRate = 100;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 60;
		this.magicDefense = 140;
		this.evade = 0;
		this.MBlock = 0;
		this.roomIn = roomIn;
		roomIn.getMonsters().add(this);
		
		//Initialize drops for Monster
		//final Weapon weapon = new Weapon();
		//this.stolenItems.add(weapon);

    }
}
