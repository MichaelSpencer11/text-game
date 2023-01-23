package textgame.items;

import textgame.Item;
import textgame.Player;

public class Tonic extends Item {
    private int healingAmount = 50;
    private boolean empty = false;
    public Tonic(){
        this.itemName = "Tonic";
        this.dropRate = 95;

        
    }

    public void applyEffect(Player player) {
        player.job.addHp(healingAmount);
        this.empty = true;

    }
}
