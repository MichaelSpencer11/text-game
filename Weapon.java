package textgame;

import java.util.ArrayList;
import java.util.List;

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
	protected String element;
	protected SpecialEffect specialEffect;
	protected ArrayList<String> stolenFrom;
}
