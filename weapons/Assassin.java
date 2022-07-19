package textgame.weapons;

import textgame.Effect;
import textgame.Weapon;

public class Assassin extends Weapon {
	public Assassin() {
		this.type = "Dirk";
		this.battlePower = 106;
		this.hitRate = 180;
		this.equipableBy.setThief(true);
		//this.equipableBy.setNinja(true);
		this.description = "Randomly dispatches an enemy";
		this.canThrow = true;
		this.canUseSwdtech = false;
		this.canUseRunic = true;
		this.canUse2Handed = true;
		this.element = null;
		this.specialEffect.setDescription("Randomly attemtps to kill the enemy");
		this.effects.add(new Effect("speed", 3));
		this.effects.add(new Effect("magicPower", 2));
		this.effects.add(new Effect("evade", 10));
		this.element = null;
		this.morphedInto.add("Ninja");
		this.morphedInto.add("Covert");
		this.morphedInto.add("Outsider");
		
		
	}
	
	
	
	
}
