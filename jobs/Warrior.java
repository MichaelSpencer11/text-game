package textgame.jobs;

public class Warrior extends Job {
	
    public Warrior() {
		this.level = 1;
		setMaxHp(1);
		this.mp = 25;
		this.vigor = 50;
		this.speed = 28;
		this.stamina = 33;
		this.magicPower = 25;
		this.battlePower = 25;
		this.defense = 48;
		this.magicDefense = 20;
		this.mBlock = 1;
		this.evade = 6;
	}

	public void setMaxHp(int newLevel){
		maxHp = (int)Math.floor((newLevel / 7) + .3);
		hp = maxHp;
	}
}
