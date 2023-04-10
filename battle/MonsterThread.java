package textgame.battle;

import textgame.Monster;

public class MonsterThread implements Runnable{
    
    Battle battleContext;
    boolean isAlive;
    

    public MonsterThread(Battle battleContext){
        this.isAlive = true;
        this.battleContext = battleContext;
        
    }

    public boolean isAlive(boolean isAlive){
        return isAlive;
    }

    public void run(){
        while(battleContext.getPlayerThread().isAlive && battleContext.getMonsterThread().isAlive){
            try{
            Thread.sleep(battleContext.getPlayer().getMainHand().getDelay());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            new MonsterAttack(battleContext);
            if(battleContext.getPlayer().getJob().getHp() <= 0){
                battleContext.stopPlayerThread();
                battleContext.stopMonsterThread();
                battleContext.battleOn = false;
                System.out.println("Defeated...");
                battleContext.player.homePoint();
                break;
            }
        }
        
        
    }

    
}
