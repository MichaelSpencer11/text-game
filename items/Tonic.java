package textgame.items;

import textgame.Item;
import textgame.Character;

public class Tonic extends Item {
    private int healingAmount = 50;
    private boolean empty = false;
    public Tonic(){
        this.itemName = "Tonic";
        this.dropRate = 85;

        
    }


    public void applyEffect(Character player) {
        player.getJob().addHp(healingAmount);
        this.empty = true;

    }
}
