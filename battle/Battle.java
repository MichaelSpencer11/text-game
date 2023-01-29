package textgame.battle;

import textgame.Monster;
import textgame.Room;
import textgame.Character;
import textgame.World;

public class Battle implements Runnable{
    protected boolean battleOn;
    protected Character player;
    protected Monster monster;
    protected Room currentRoom;
    protected PlayerThread playerThread;
    protected MonsterThread monsterThread;
    public Battle(Character player, Monster monster, Room currentRoom ){
        this.currentRoom = currentRoom;
        this.battleOn = true;
        this.player = player;
        this.monster = monster;
        playerThread = new PlayerThread(this);
        monsterThread = new MonsterThread(this);
        
        System.out.println("Battle started with " + monster.getName());
        //get rid of this while loop and put a while loop in playerthread and monstergthread
        
            World.setTimeout(playerThread, player.getMainHand().getDelay());
            World.setTimeout2(monsterThread, monster.getDelay());
        
        
        while(true){
            if (playerThread.isAlive == false || monsterThread.isAlive == false){
                if(player.getJob().getHp() <= 0){
                    battleOn = false;
                    System.out.println("Defeated...");
                    player.homePoint();
                    break;
                }
                else if(monster.getHp() <= 0){
                    battleOn = false;
                    new Victory(this);
                    //remove monster from field
                    if(currentRoom.getMonsters().contains(monster)){
                        currentRoom.getMonsters().remove(monster);
                    }
                    break;
                }
            }
        }   

    }

    public Character getPlayer() {
        return this.player;
    }
    public Monster getMonster(){
        return this.monster;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void run() {

    }
}
