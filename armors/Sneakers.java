package textgame.armors;

public class Sneakers extends Armor{
    public Sneakers() {
        super();
        this.itemName = "Sneakers";
        this.type = "feet";
        this.weight = "light";
        this.defense = 4;
        this.gpValue = defense * 20;
    }
}
