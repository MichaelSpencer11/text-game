package textgame.jobs;

import textgame.Esper;
import textgame.Form;
import textgame.Job;

public class Polymorph extends Job {
	protected Form<Esper> form;
	protected boolean morphed;
	
	public Polymorph() {
		this.level = 1;
		this.hp = 31;
		this.mp = 42;
		this.vigor = 31;
		this.speed = 33;
		this.stamina = 28;
		this.magicPower = 42;
		this.battlePower = 12;
		this.defense = 42;
		this.magicDefense = 33;
		this.mBlock = 7;
		this.evade = 5;
		this.form = null;
		
	}
	
	public void morph(Form<Esper> newForm) {
		this.form = newForm;
	}
}
