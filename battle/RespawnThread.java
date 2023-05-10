package textgame.battle;


public class RespawnThread implements Runnable {
    Battle battleContext;
    Thread respawnThread;

    public RespawnThread(Battle battleContext){
        this.battleContext = battleContext;
        respawnThread = new Thread(this, "respawnThread");
        respawnThread.start();
    }

    public void run(){
        try{
        Thread.sleep(battleContext.getMonster().getRespawnTime());
        System.out.println("Sleeping the respawn thread");
        } catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        battleContext.getCurrentRoom().getMonsters().add(battleContext.getMonster());

    }
}
