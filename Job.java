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
}
