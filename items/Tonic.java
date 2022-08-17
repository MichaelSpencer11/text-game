package textgame.items;

import textgame.Item;
import textgame.Player;

public class Tonic extends Item {
    private int healingAmount = 50;
    private boolean empty = false;
    public Tonic(){
        this.consumable = true;
        
    }

    public void useTonic(Player player) {
        player.job.addHp(healingAmount);
        this.empty = true;

    }
}
