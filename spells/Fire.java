package textgame.spells;

import textgame.elements.Element;

public class Fire extends Spell {
    private String name = "Fire";
    private String type = "Black Magic";
    private int mp = 4;
    private int spellPower = 21;
    private int hitRate = 150;
    private boolean reflectable = true;
    private boolean absorbedByRunic = true;
    private Element element = new textgame.elements.Fire();
    private boolean physicalDamage = false;
    private boolean ignoresDefense = false;
    private boolean ignoresMBlock = false;
    private String description = "Emits a blast of fire at the target.";


    public Fire(Monster target){

    }
    
}
