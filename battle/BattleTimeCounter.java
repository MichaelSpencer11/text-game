package textgame.battle;

import textgame.World;

public class BattleTimeCounter {
    public static long btCounter = 0;
    public BattleTimeCounter(){
        
    }

    public void startCounter(){
        while(true){
            World.setTimeout(() -> incrementBattleTimeCounter(), 33 );
        }
    }

    public static void incrementBattleTimeCounter() {
        btCounter++;
    }


}
