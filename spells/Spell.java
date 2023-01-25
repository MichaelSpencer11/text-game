package textgame.spells;

import textgame.elements;

public class Spell extends Action {
	
	private String name;
	private String type;
	private int mp;
	private int spellPower;
	private int hitRate;
	private boolean reflectable;
	private boolean absorbedByRunic;
	private Element element;
	private boolean physicalDamage;
	private boolean ignoresDefense;
	private boolean ignoresMBlock;
	private String description;
	
	public Spell(String spellName, Battle battleContext){
		Spell selection;
		int damage;
		for (Spell s : battleContext.getPlayer().getJob().getSpells()){
			if(s.name.equals(spellName)){
				selection = s;
			}
		}
		
		damage = selection.spellPower * 4 + (battleContext.getPlayer().getLevel() * battleContext.getPlayer().getMagicPower() * selection.spellPower / 32 );
		//Random variance
		damage = (damage * Random.roll(224,255) / 256) + 1;
		//Mdef mod
		damage = (damage * (255 - battleContext.getMonster().getMagicDefense()) / 256) + 1;
		//shell
		if(battleContext.getMonster().getShell() == true){
			damage = (int)(damage * 170 / 256) + 1;
		}
		//elemental mods
		if(battleContext.getMonster().getAbsorbs() == selection.element){
			battleContext.getMonster().applyHealing(damage);
		}
		if(battleContext.getMonster().getImmune() == selection.element){
			damage = 0;
		}
		if(battleContext.getMonster().getResistant() == selection.element){
			damage = damage / 2;
		}
		if(battleContext.getMonster().getWeak() == selection.element){
			damage = damage * 2;
		}

		battleContext.getMonster().applyDamage(damage);
	}

	
	
}
