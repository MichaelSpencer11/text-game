package textgame.battle;

import textgame.Monster;
import textgame.World;
import textgame.Character;
import textgame.battle.*;

public class ATBGauge {
    protected long atbGauge = 0;
    public ATBGauge(Character player, Battle battleContext){
        
        int delay = player.getMainHand().getDelay();
        World.setTimeout(() -> new PlayerAttack(battleContext), delay);
    }

    public ATBGauge(Monster target){

    }

    public void incrementATBGauge() {
        atbGauge++;
    }
    
    
}
