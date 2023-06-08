package textgame.armors;

public class PlateBoots extends Armor{
    public PlateBoots() {
        super();
        this.itemName = "Plate Boots";
        this.type = "feet";
        this.weight = "heavy";
        this.defense = 6;
        this.gpValue = defense * 20;
    }
}
