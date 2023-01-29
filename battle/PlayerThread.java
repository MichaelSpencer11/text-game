package textgame.battle;

public class PlayerThread implements Runnable {
    
    Battle battleContext;
    boolean isAlive;
    Thread t;

    public PlayerThread(Battle battleContext){
        this.battleContext = battleContext;
    }

    public boolean isAlive(boolean isAlive){
        return isAlive;
    }

    public void run(){
        isAlive = true;
        while(battleContext.getMonster().getHp() > 0 || battleContext.getPlayer().getJob().getHp() > 0){
            t = new Thread();
            try{
            Thread.sleep(battleContext.getPlayer().getMainHand().getDelay());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            new PlayerAttack(battleContext);
        }
        isAlive = false;    
    }
}
