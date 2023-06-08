package textgame.armors;

public class CottonGloves extends Armor{
    public CottonGloves() {
        super();
        this.itemName = "Cotton Gloves";
        this.type = "hands";
        this.weight = "light";
        this.defense = 6;
        this.gpValue = defense * 20;
    }
}
