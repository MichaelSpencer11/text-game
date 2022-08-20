package textgame.weapons;

import textgame.Weapon;
import textgame.elements.Lightning;

public class ThunderRod extends Weapon{
    public ThunderRod() {
        this.type = "Rod";
		this.battlePower = 79;
		this.hitRate = 135;
		this.equipableBy.setBlackMage(true);
        this.equipableBy.setRedMage(true);
		this.description = "Rod of the element of thunder";
		this.canThrow = true;
		this.canUseSwdtech = false;
		this.canUseRunic = false;
		this.canUse2Handed = true;
		this.element = new Lightning();
		this.specialEffect.setDescription("Randomly casts Bolt2");
		//this.morphedInto.add("Wizard");
    }
}
