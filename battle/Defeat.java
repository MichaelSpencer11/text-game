package textgame.battle;

public class Defeat {
    public Defeat (Battle battleContext){
        System.out.println("Defeated by " + battleContext.getMonster().getName() + ".");
        battleContext.getPlayer().homePoint();

    }
}
