package textgame.weapons;

import textgame.Effect;
import textgame.Weapon;

public class Guardian extends Weapon {
    public Guardian () {
        this.type = "Dirk";
		this.battlePower = 59;
		this.hitRate = 180;
		this.equipableBy.setThief(true);
		this.description = "Randomly evades an enemy attack";
		this.canThrow = true;
		this.canUseSwdtech = false;
		this.canUseRunic = true;
		this.canUse2Handed = true;
		this.element = null;
        this.effects.add(new Effect("speed", 4));
        this.effects.add(new Effect("evade", 10));
		this.specialEffect.setDescription("");
		//this.morphedInto.add("Thief");
    }
}
