package textgame.jobs;

import java.util.ArrayList;

public class Warrior extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;
	
    public Warrior() {
		this.level = 1;
		setMaxHp(level);
		setMaxExp(level);
		setMaxMp(level);
		this.vigor = 50;
		this.speed = 28;
		this.stamina = 33;
		this.magicPower = 25;
		this.battlePower = 25;
		this.defense = 48;
		this.magicDefense = 30;
		this.mBlock = 1;
		this.evade = 6;
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("Attack");
		this.magic = new Ability("Magic");
		this.item = new Ability("Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.3 + (newLevel / 7.0)) * 100 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.16 + (newLevel / 25.0)) * 100 );
		mp = maxMp;
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}
