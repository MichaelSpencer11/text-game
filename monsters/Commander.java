package textgame.monsters;

import textgame.Monster;
import textgame.Room;
import textgame.items.Tonic;
import textgame.weapons.Dagger;

public class Commander extends Monster {
    public Commander(Room roomIn, Room blocking) {

		this.name = "Commander";
        this.level = 10;
		this.maxHp = 102;
		this.hp = maxHp;
		this.mp = 50;
		this.xp = 85;
		this.gp = 153;
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
		this.respawnTime = 60000;
		roomIn.getMonsters().add(this);
		this.blocking = blocking;

		//Initialize drops for Monster
		final Tonic tonic = new Tonic();
		this.stolenItems.add(tonic);
		final Dagger dagger = new Dagger();
		this.drops.add(dagger);

    }
}
