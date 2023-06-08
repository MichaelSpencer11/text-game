package textgame.armors;

public class PlateLeggings extends Armor{
    public PlateLeggings() {
        super();
        this.itemName = "Plate Leggings";
        this.type = "legs";
        this.weight = "heavy";
        this.defense = 8;
        this.gpValue = defense * 20;
    }
}
