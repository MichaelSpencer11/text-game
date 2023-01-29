package textgame.battle;

import textgame.Monster;

public class MonsterThread implements Runnable{
    
    Battle battleContext;
    boolean isAlive;
    Thread t;

    public MonsterThread(Battle battleContext){
        this.battleContext = battleContext;
    }

    public boolean isAlive(boolean isAlive){
        return isAlive;
    }

    public void run(){
        isAlive = true;
        while(battleContext.getPlayer().getJob().getHp() > 0 || battleContext.getMonster().getHp() > 0){
            t = new Thread();
            try{
            Thread.sleep(battleContext.getPlayer().getMainHand().getDelay());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            new MonsterAttack(battleContext);
        }
        isAlive = false;
        
    }
}
