package textgame.battle;

import java.util.Scanner;

import textgame.Attack;
import textgame.Monster;

public class BattleMenu {
    public BattleMenu(textgame.battle.Battle battle){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Attack");
        System.out.println("2.Magic");
        System.out.println("3.Item");
        System.out.println("4.Flee");
        //System.out.println("3." + jobAbility.name);
        switch(sc.nextLine()) {
            case "1": 
                new Attack(battle);
                break;
            case "2":
                battle.getPlayer().magicMenu();
                break;
            case "3":
                player.itemMenu();
                break;
            case "4":
                //player.flee();
                break;

        }
    }

    public BattleMenu(Monster monster){
        monster.attack();
    }
}
