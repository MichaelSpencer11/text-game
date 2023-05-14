package textgame.weapons;

import textgame.Effect;
import textgame.weapons.Weapon;
import textgame.elements.Pearl;

public class Graedus extends Weapon {
    public Graedus () {
        this.type = "Dirk";
		this.battlePower = 204;
		this.hitRate = 180;
		this.equipableBy.setAll(true);
		this.description = "Pearl-elemental blade";
		this.canThrow = true;
		this.canUseSwdtech = true;
		this.canUseRunic = true;
		this.canUse2Handed = true;
		this.element = new Pearl();;

    }
}
