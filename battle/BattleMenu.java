package textgame.battle;

import java.util.Scanner;

import textgame.Monster;

public class BattleMenu {
    public BattleMenu(Battle battleContext){
        battleContext.getPlayer().getJob().loadAbilities();

    }

    public BattleMenu(Monster monster, Battle battleContext){

        monster.attack(battleContext);
    }
}
