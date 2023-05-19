package textgame.jobs;

import java.util.ArrayList;

public class WhiteMage extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public WhiteMage() {
		this.level = 2;
		setMaxHp(level);
		setHp(getMaxHp());
		setMaxExp(level);
		setMaxMp(level);
		setMp(getMaxMp());
		setVigor(level);
		this.speed = 34;
		this.stamina = 22;
		this.magicPower = 44;
		this.battlePower = 11;
		this.defense = 35;
		this.magicDefense = 35;
		this.mBlock = 9;
		this.evade = 13;
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("Attack");
		this.magic = new Ability("Magic");
		this.item = new Ability("Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);
		
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.18 + (newLevel / 12.0)) * 100 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 15.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel){
		vigor = 26 + newLevel;
	}

	public void setDefense(){}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}
