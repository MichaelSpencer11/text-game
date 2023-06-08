package textgame.armors;

public class PlateVest extends Armor{
    public PlateVest() {
        super();
        this.itemName = "Plate Vest";
        this.type = "body";
        this.weight = "heavy";
        this.defense = 10;
        this.gpValue = defense * 20;
    }
}
