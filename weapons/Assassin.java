package textgame.weapons;

import textgame.Effect;
import textgame.weapons.Weapon;

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
		this.element = null;
		//this.morphedInto.add("Ninja");
		//this.morphedInto.add("Covert");
		//this.morphedInto.add("Outsider");
		
		
	}
	
	
	
	
}
