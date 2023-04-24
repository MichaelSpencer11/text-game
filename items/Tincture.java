package textgame.items;

import textgame.Item;
import textgame.Character;

public class Tincture extends Item {
    private int healingAmount = 50;
    private boolean empty = false;
    public Tincture(){
        this.itemName = "Tincture";
        this.dropRate = 85;
        
    }

    public void applyEffect(Character player) {
        player.getJob().addMp(healingAmount);
        this.empty = true;

    }
}
