package textgame.battle;

import textgame.Monster;
import textgame.Room;
import textgame.Character;

public class Battle {
    protected boolean battleOn;
    protected Character player;
    protected Monster monster;
    public BattleTimeCounter btCounter = new BattleTimeCounter();
    public Battle(Character player, Monster monster, Room currentRoom ){
        this.battleOn = true;
        this.player = player;
        this.monster = monster;
        System.out.println("Battle started with " + monster.getName());
        while(player.getHp() > 0 || monster.getHp() > 0){
            player.startCounter(this);
            monster.startCounter(this);
        }
        if(player.getHp() <= 0){
            battleOn = false;
            System.out.println("Defeated...");
            player.homePoint();
        }
        else if(monster.getHp() <= 0){
            battleOn = false;
            System.out.println("Victory!");
            new Victory();
        }

    }

    public Character getPlayer() {
        return this.player;
    }
    public Monster getMonster(){
        return this.monster;
    }
}
