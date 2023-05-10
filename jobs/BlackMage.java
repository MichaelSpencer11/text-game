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
		setMaxExp(level);
		setMaxMp(level);
		this.vigor = 28;
		this.speed = 33;
		this.stamina = 28;
		this.magicPower = 45;
		this.battlePower = 14;
		this.defense = 36;
		this.magicDefense = 40;
		this.mBlock = 7;
		this.evade = 14;
		//this.spells.add(new Fire());
		this.abilities = new ArrayList<Ability>();
		this.attack = new Ability("Attack");
		this.magic = new Ability("Magic");
		this.item = new Ability("Item");
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
		hp = maxMp;
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}

	
}
