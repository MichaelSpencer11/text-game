package textgame.battle;

import java.net.SocketTimeoutException;

import textgame.Action;
import textgame.ConsoleColors;
import textgame.Random;

public class PlayerAttack extends Action {
    protected Battle battleContext;
    protected int attack;
    protected int damage;
    protected int damageMultiplier;
    protected boolean magical;
    protected boolean physical;
    public PlayerAttack(Battle battleContext){
        this.battleContext = battleContext;
        if(this.hits()){
            
            // 1b
            attack = battleContext.getPlayer().getMainHand().getBattlePower() + (battleContext.getPlayer().getJob().getVigor());
            //1d
            damage = attack * (battleContext.getPlayer().getLevel());
            damageMultiplier = 0;
            if(battleContext.getPlayer().getBerserked()){
                damageMultiplier++;
            }
            if( battleContext.getPlayer().getCritChance() == 32){
                damageMultiplier += 2;
                System.out.println("Critical hit!");
            }
            damage = damage + ((damage / 2) * damageMultiplier);
            //Random variance, this can be improved with luck stat
            damage = (damage * Random.roll(7,15) / 10);
            //defense mod
            //we're fucking things up here
            //damage = damage / 100;
            damage = (int) (damage - (battleContext.getMonster().getDefense()));
            //protect
            if(battleContext.getMonster().getProtect() == true){
                damage = (int)(damage * .5);
            }

            battleContext.getMonster().applyDamage(damage); 
            System.out.println(ConsoleColors.RED + battleContext.getPlayer().getName() + " hits " + battleContext.getMonster().typeToString() + " for " + damage + " damage." + ConsoleColors.RESET);
        } else {
            System.out.println("You miss the " + battleContext.getMonster().getName() + ".");
        }
    }

    public boolean hits(){
        
        if(battleContext.getPlayer().getClear()){
            return true;
        }
        if(this.unblockable == true){
            return true;
        }
        if(battleContext.getPlayer().getAsleep() == true ||
           battleContext.getPlayer().getPetrify() == true ||
           battleContext.getPlayer().getFrozen() == true ||
           battleContext.getPlayer().getStop() == true) {
            return true;
        }
        //when implementing ninja
        // if(battleContext.getMonster().getImage()){

        // }
        if(battleContext.getMonster().getBlockValue() > 255){battleContext.getPlayer().setBlockValue(255);}
        if(battleContext.getMonster().getBlockValue() < 1){battleContext.getPlayer().setBlockValue(1);}

        if((battleContext.getPlayer().getMainHand().getHitRate() * battleContext.getMonster().getBlockValue()) >= (int) Random.roll(0,99)){
            return true;
        }

        System.out.println(ConsoleColors.YELLOW + "You miss the " + battleContext.getMonster().typeToString() + ConsoleColors.RESET);
        return false;

    }
}
