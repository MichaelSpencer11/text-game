package textgame.jobs;

import textgame.spells.*;
import java.util.ArrayList;

public class BlackMage extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public BlackMage() {
		this.level = 1;
		setMaxHp(level);
		setHp(maxHp);
		setMaxExp(level);
		setMaxMp(level);
		setMp(maxMp);
		setVigor(level);
		this.speed = 33;
		this.stamina = 28;
		this.magicPower = 45;
		this.battlePower = 14;
		this.defense = 36;
		this.magicDefense = 40;
		this.mBlock = 7;
		this.evade = 14;
		this.defMod = 2;
		//this.spells.add(new Fire());
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("a: Attack");
		this.magic = new Ability("m: Magic");
		this.item = new Ability("i: Item");
		this.abilities.add(attack);
		this.abilities.add(magic);
		this.abilities.add(item);	
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((.2 + (newLevel / 12.0)) * 100 );
		hp = maxHp;
	}

	public void setMaxMp(int newLevel){
		maxMp = (int)Math.floor((.2 + (newLevel / 14.0)) * 100 );
		mp = maxMp;
	}

	public void setVigor(int newLevel){
		vigor = 28 + newLevel;
	}
	public void setDefense(){}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	
}
