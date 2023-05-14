package textgame.weapons;

public class Dagger extends Weapon{
    public Dagger () {
        this.type = "Dagger";
        this.battlePower = 25;
        this.hitRate = 180;
        this.delay = 500;
        this.description = "Basic blade forged as stainless steel";
        this.canThrow = true;
        this.canUseSwdtech = false;
        this.canUseRunic = true;
        this.canUse2Handed = false;
        this.element = null;
    }
}
