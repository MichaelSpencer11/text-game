package textgame.monsters;

import textgame.Monster;
import textgame.Random;
import textgame.Room;
import textgame.items.Tonic;

public class Leafer extends Monster {
    public Leafer(Room firstRoom) {

		this.name = "Leafer";
        this.level = 1;
		this.hp = 32;
		this.mp = 0;
		this.xp = 24;
		this.gp = Random.roll(10,20);
		this.battlePower = 5;
		this.hitRate = 100;
		this.delay = 300;
		this.magicPower = 10;
		this.speed = 30;
		this.stamina = 0;
		this.defense = 60;
		this.magicDefense = 140;
		this.evade = 0;
		this.MBlock = 0;
		this.respawnTime = 30000; 
		this.currentRoom = firstRoom;
		currentRoom.getMonsters().add(this);
		
		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		this.drops.add(tonic);

    }
}
