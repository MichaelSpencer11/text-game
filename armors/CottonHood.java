package textgame.armors;

public class CottonHood extends Armor{

    public CottonHood(){
        super();
        this.itemName = "Cotton Hood";
        this.type = "head";
        this.weight = "light";
        this.defense = 6;
        this.gpValue = defense * 20;
    }
}
