package textgame;

import java.util.Random;

public class Thief extends Job {
	public Thief() {
		this.level = 1;
		this.vigor = 37;
		this.speed = 40;
		this.stamina = 31;
		this.magicPower = 28;
		this.battlePower = 14;
		this.defense = 46;
		this.magicDefense = 23;
		this.mBlock = 2;
		this.evade = 15;
	}
	
	public void steal(Monster monster, Player player) {
		Random r = new Random();
		int selected = r.nextInt(monster.stolenItems.size());
		Item stolen = monster.stolenItems.get(selected);
		monster.stolenItems.remove(selected);
		player.inventory.add(stolen);
		
	}
}
