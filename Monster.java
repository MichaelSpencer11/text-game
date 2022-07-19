package textgame;

import java.util.ArrayList;

public class Monster {
	protected int level;
	protected int hp;
	protected int mp;
	protected int xp;
	protected int gp;
	protected int battlePower;
	protected int hitRate;
	protected int magicPower;
	protected int speed;
	protected int stamina;
	protected int defense;
	protected int magicDefense;
	protected int evade;
	protected int MBlock;
	protected ArrayList<Item> stolenItems;
	protected ArrayList<Item> drops;
	protected Room roomIn;
	protected String description;

	public String typeToString() {
		return this.getClass().toString().substring(24);
	}

	public int getLevel () {return level;}
	public int getHP () {return hp;}
	public int getMP () {return mp;}
	public int getXP () {return xp;}
	public int getGP () {return gp;}
	public int getBattlePower () {return battlePower;}
	public int getHitRate () {return hitRate;}
	public int getMagicPower () {return magicPower;}
	public int getSpeed () {return speed;}
	public int getStamina () {return stamina;}
	public int getDefense () {return defense;}
	public int getMagicDefense () {return magicDefense;}
	public int getEvade () {return evade;}
	public int getMBlock () {return MBlock;}
	public ArrayList<Item> getStolenItems () {return stolenItems;}
	public ArrayList<Item> getDrops () {return drops;}
	public String getDescription () {return description;}

	
}
