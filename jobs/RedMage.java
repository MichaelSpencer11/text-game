package textgame.jobs;

import java.util.ArrayList;

public class RedMage extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public RedMage() {
		this.level = 1;
		setMaxHp(level);
		setMaxExp(level);
		setMaxMp(level);
		this.vigor = 34;
		this.speed = 34;
		this.stamina = 31;
		this.magicPower = 38;
		this.battlePower = 20;
		this.defense = 40;
		this.magicDefense = 40;
		this.mBlock = 9;
		this.evade = 14;
		this.attack = new Ability("Attack");
		this.magic = new Ability("Magic");
		this.item = new Ability("Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.24 + (newLevel / 9.0)) * 100 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 16.0)) * 100 );
		hp = maxMp;
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}
