package textgame.weapons;

import textgame.Effect;
import textgame.Weapon;

public class Dirk extends Weapon {
    public Dirk () {
        this.type = "Dirk";
		this.battlePower = 26;
		this.hitRate = 180;
		this.equipableBy.setAll(true);
		this.description = "Basic blade forged as stainless steel";
		this.canThrow = true;
		this.canUseSwdtech = false;
		this.canUseRunic = true;
		this.canUse2Handed = false;
		this.element = null;
		this.specialEffect.setDescription("");
		this.element = null;
		this.morphedInto.add("Thief");
    }
}
