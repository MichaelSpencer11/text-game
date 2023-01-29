package textgame.battle;

import java.util.Scanner;

import textgame.Monster;

public class BattleMenu {
    public BattleMenu(textgame.battle.Battle battleContext){

    }

    public BattleMenu(Monster monster, textgame.battle.Battle battleContext){

        monster.attack(battleContext);
    }
}
