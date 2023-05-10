package textgame.battle;


public class RespawnThread implements Runnable {
    Thread respawnThread;

    public RespawnThread(Battle battleContext){
        respawnThread = new Thread();
        respawnThread.start(battleContext);
    }

    public void run(Battle battleContext){
        Thread.sleep(battleContext.getMonster().getRespawnTime());
        battleContext.getCurrentRoom().getMonsters().add(battleContext.getMonster());
    }
}
