package textgame.jobs;

import java.util.Random;
import textgame.Item;
import textgame.jobs.Job;
import textgame.Monster;
import textgame.Player;

public class Thief extends Job {
	public Thief() {
		this.level = 1;
		this.hp = 37;
		this.maxHp = 37;
		this.mp = 28;
		this.maxMp = 28;
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
		int selected = r.nextInt(monster.getStolenItems().size());
		Item stolen = monster.getStolenItems().get(selected);
		monster.getStolenItems().remove(selected);
		player.getInventory().add(stolen);
		
	}

}
