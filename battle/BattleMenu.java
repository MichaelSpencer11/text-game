package textgame.battle;

import java.util.Scanner;

import textgame.Monster;

public class BattleMenu {
    public BattleMenu(textgame.battle.Battle battleContext){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Attack");
        System.out.println("2.Magic");
        System.out.println("3.Item");
        System.out.println("4.Flee");
        //System.out.println("3." + jobAbility.name);
        switch(sc.nextLine()) {
            case "1": 
                new PlayerAttack(battleContext);
                break;
            case "2":
                battleContext.getPlayer().magicMenu();
                break;
            case "3":
                battleContext.getPlayer().itemMenu();
                break;
            case "4":
                //player.flee();
                break;

        }
    }

    public BattleMenu(Monster monster, textgame.battle.Battle battleContext){

        monster.attack();
    }
}
