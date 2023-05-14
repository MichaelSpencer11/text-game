package textgame;

import java.util.ArrayList;


import textgame.battle.*;
import textgame.elements.Element;
import textgame.Random;
import textgame.battle.Battle;

public class Monster {
	protected String name;
	protected int level;
	protected int hp;
	protected int maxHp;
	protected int mp;
	protected int maxMp;
	protected int xp;
	protected int gp;
	protected int battlePower;
	protected int vigor;
	protected int vigor2 = vigor * 2;
	protected int hitRate;
	protected int delay;
	protected int magicPower;
	protected int speed;
	protected int stamina;
	protected int defense;
	protected int magicDefense;
	protected int evade;
	protected int MBlock;
	protected int blockValue = (255 - this.getMBlock() * 2) + 1;
	protected ArrayList<Item> stolenItems = new ArrayList<Item>();
	protected ArrayList<Item> drops = new ArrayList<Item>();
	protected Room currentRoom;
	protected Room roomIn;
	protected String description;
	protected int atbGauge = 0;
	protected Character target;
	protected boolean protect;
	protected boolean shell;
	protected Element absorbs;
	protected Element immune;
	protected Element resistant;
	protected Element weak;
	protected boolean berserked;
	protected int critChance;
	protected int respawnTime;

	protected Room blocking;

	public String typeToString() {
		return this.getClass().toString().substring(24);
	}

	public void incrementATBGauge() {
		this.atbGauge += (96 * (speed + 20)) / 16;
    }

	public void startCounter(Battle battleContext){
			
			new BattleMenu(battleContext);
			
		
	}

	public void attack(Battle battleContext) {
		new MonsterAttack(battleContext);
	}

	public void applyDamage(int damage){
		this.hp = this.hp - damage;
	}

	public void applyHealing(int amount){
		hp = hp + amount;
		if(hp > maxHp ){
			hp = maxHp;
		}
	}

	public String getName () {return name;}
	public int getLevel () {return level;}
	public int getHp () {return hp;}
	public int getMp () {return mp;}
	public int getXp () {return xp;}
	public int getGp () {return gp;}
	public int getBattlePower () {return battlePower;}
	public int getHitRate () {return hitRate;}
	public int getMagicPower () {return magicPower;}
	public int getSpeed () {return speed;}
	public int getStamina () {return stamina;}
	public int getDefense () {return defense;}
	public int getMagicDefense () {return magicDefense;}
	public int getEvade () {return evade;}
	public boolean getProtect(){return protect;}
	public boolean getShell(){return shell;}
	public int getMBlock () {return MBlock;}
	public int getBlockValue(){return blockValue;}
	public ArrayList<Item> getStolenItems () {return stolenItems;}
	public ArrayList<Item> getDrops () {return drops;}
	public String getDescription() {return description;}
	public boolean getBerserked() {return berserked;}
	public int getCritChance() {return Random.roll(1,32);}
	public int getVigor2() {return vigor2;}
	public Element getAbsorbs(){return absorbs;}
	public Element getImmune(){return immune;}
	public Element getResistant(){return resistant;}
	public Element getWeak(){return weak;}
	public Room getCurrentRoom(){return currentRoom;}
	public int getDelay(){return delay;}
	public int getRespawnTime(){return respawnTime;}

	public void respawn(){
		this.hp = maxHp;
		this.mp = maxMp;
	}


	public int getVigor() {
		return vigor;
	}
}
