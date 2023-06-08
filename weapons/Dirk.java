package textgame.weapons;


public class Dirk extends Weapon {
    public Dirk () {
        this.type = "Dirk";
		this.battlePower = 60;
		this.hitRate = 180;
		this.delay = 500;
		this.description = "Basic blade forged as stainless steel";
		this.canThrow = true;
		this.canUseSwdtech = false;
		this.canUseRunic = true;
		this.canUse2Handed = false;
		this.element = null;
		//this.morphedInto.add("Thief");
    }

	
}
