package textgame.weapons;

import java.util.ArrayList;
import java.util.List;
import textgame.EquipableBy;
import textgame.elements.*;
import textgame.Item;
import textgame.SpecialEffect;

public class Weapon extends Item{
	protected String type;
	protected int battlePower;
	protected int hitRate;
	protected EquipableBy equipableBy;
	protected String description;
	protected boolean canThrow;
	protected boolean canUseSwdtech;
	protected boolean canUseRunic;
	protected boolean canUse2Handed;
	protected Element element;
	protected SpecialEffect specialEffect;
	

	public int getBattlePower() {return battlePower;}
	public int getHitRate() {return hitRate;}

	
	
}
