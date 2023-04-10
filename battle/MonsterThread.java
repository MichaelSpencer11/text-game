package textgame.battle;

import textgame.Monster;

public class MonsterThread implements Runnable{
    
    Battle battleContext;
    boolean isAlive;
    Thread mt;
    

    public MonsterThread(Battle battleContext){
        this.isAlive = true;
        this.battleContext = battleContext;
        mt = new Thread(this, "monsterThread");
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
            if(battleContext.getPlayer().getJob().getHp() <= 0 || battleContext.getMonster().getHp() <= 0){
                
                break;
            }
        }
        
        
        
    }

    
}
