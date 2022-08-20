package textgame.battle;

import textgame.Monster;
import textgame.World;
import textgame.Character;

public class ATBGauge {
    protected long atbGauge = 0;
    public ATBGauge(Character player){
        
    }

    public ATBGauge(Monster target){

    }

    public void incrementATBGauge() {
        atbGauge++;
    }
    
    
}
