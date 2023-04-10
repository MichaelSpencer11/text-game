package textgame.battle;

import java.util.Scanner;

import textgame.Monster;

public class BattleMenu {
    public BattleMenu(Battle battleContext){
        System.out.println("Attack");
        //load job abilities
    }

    public BattleMenu(Monster monster, Battle battleContext){

        monster.attack(battleContext);
    }
}
