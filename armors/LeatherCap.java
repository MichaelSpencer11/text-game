package textgame.armors;

public class LeatherCap extends Armor{
    public LeatherCap() {
        super();
        this.itemName = "Leather Cap";
        this.type = "head";
        this.weight = "medium";
        this.defense = 7;
        this.gpValue = defense * 20;
    }
}
