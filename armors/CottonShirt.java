package textgame.armors;

public class CottonShirt extends Armor{
    public CottonShirt() {
        super();
        this.itemName = "Cotton Tunic";
        this.type = "body";
        this.weight = "light";
        this.defense = 8;
        this.gpValue = defense * 20;
    }
}
