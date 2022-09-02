package textgame.items;

import textgame.Item;
import textgame.Player;

public class Tincture extends Item {
    private int healingAmount = 50;
    private boolean empty = false;
    public Tincture(){
        this.itemName = "Tincture";
        this.consumable = true;
        this.dropRate = 40;
        
    }

    public void useTincture(Player player) {
        player.job.addMp(healingAmount);
        this.empty = true;

    }
}
