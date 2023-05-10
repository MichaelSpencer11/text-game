package textgame.jobs;

public class WhiteMage extends Job {

	protected ArrayList<Ability> abilities;
	protected Ability attack;
	protected Ability magic;
	protected Ability item;

    public WhiteMage() {
		this.level = 1;
		setMaxHp(level);
		setMaxExp(level);
		setMaxMp(level);
		this.vigor = 26;
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
		hp = maxMp;
	}

	public void loadAbilities(){
		for (Ability a : abilities){
			System.out.println(a.getName());
		}
	}
}
