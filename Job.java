package textgame;

public class Job {

	protected int level;
	protected int hp;
	protected int mp;
	protected int vigor;
	protected int speed;
	protected int stamina;
	protected int magicPower;
	protected int battlePower;
	protected int defense;
	protected int magicDefense;
	protected int mBlock;
	protected int evade;

	public void addHp(int hp){
		this.hp += hp;
	}

	public void addMp(int mp){
		this.mp += mp;
	}

	public void changeJob(Character player, Job newJob){
		player.job = newJob;
	}
	public int getLevel(){return level;}
	public int getHp(){return hp;}
	public int getMp(){return mp;}
	public int getVigor(){return vigor;}
	public int getSpeed(){return speed;}
	public int getStamina(){return stamina;}
	public int getMagicPower(){return magicPower;}
	public int getBattlePower(){return battlePower;}
	public int getDefense(){return defense;}
	public int getMagicDefense(){return magicDefense;}
	public int getMBlock(){return mBlock;}
	public int getEvade(){return evade;}
}
