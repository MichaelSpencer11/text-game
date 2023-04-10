package textgame.battle;

public class PlayerThread implements Runnable {
    
    Battle battleContext;
    boolean isAlive;
    

    public PlayerThread(Battle battleContext){
        this.isAlive = true;
        this.battleContext = battleContext;
       
        
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
            if(battleContext.getMonster().getHp() <= 0 ){
                battleContext.stopMonsterThread();
                battleContext.stopPlayerThread();
                new Victory(battleContext);
                battleContext.battleOn = false;
                //remove monster from field
                if(battleContext.currentRoom.getMonsters().contains(battleContext.getMonster())){
                    battleContext.currentRoom.getMonsters().remove(battleContext.getMonster());
                }
                break;
            }
            
        }
            
    }
}
