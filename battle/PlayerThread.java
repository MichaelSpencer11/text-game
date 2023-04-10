package textgame.battle;

public class PlayerThread implements Runnable {
    
    Battle battleContext;
    boolean isAlive;
    Thread pt;
    

    public PlayerThread(Battle battleContext){
        this.isAlive = true;
        this.battleContext = battleContext;
        pt = new Thread(this, "playerThread");
        
    }

    public boolean isAlive(boolean isAlive){
        return isAlive;
    }

    public void run(){
        while(battleContext.getMonsterThread().isAlive && battleContext.getPlayerThread().isAlive){
            try{
            Thread.sleep(battleContext.getPlayer().getMainHand().getDelay());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            new PlayerAttack(battleContext);
            if(battleContext.getMonster().getHp() <= 0 || battleContext.getPlayer().getJob().getHp() <= 0)
            
                break;
            }
              
    }
}
