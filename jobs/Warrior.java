package textgame.jobs;

import textgame.Random;

import java.util.ArrayList;

public class Warrior extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;
	
    public Warrior() {
		this.level = 10;
		setMaxHp(level);
		setMaxExp(level);
		setMaxMp(level);
		setVigor(level);
		this.speed = 28;
		this.stamina = 33;
		this.magicPower = 25;
		setDefense(level);
		this.magicDefense = 30;
		this.mBlock = 1;
		this.evade = 6;
		this.defMod = 4;
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

	public void setVigor(int newLevel)
	{
		vigor = 43 + newLevel;
	}

	public void setDefense(int level){
		defense = ((level + 1) * 10);
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}
