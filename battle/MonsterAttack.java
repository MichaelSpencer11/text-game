package textgame.battle;

import textgame.Action;
import textgame.ConsoleColors;
import textgame.Random;

public class MonsterAttack extends Action {
    protected Battle battleContext;
    protected int attack;
    protected int damage;
    protected int damageMultiplier;
    public MonsterAttack(Battle battleContext){
        this.battleContext = battleContext;
        if(this.hits()){
            attack = battleContext.getMonster().getBattlePower() + (battleContext.getMonster().getVigor());
            damage = attack * (battleContext.getMonster().getLevel());
            damageMultiplier = 0;
            if(battleContext.getMonster().getBerserked()){
                damageMultiplier += 1;
            }
            if( battleContext.getMonster().getCritChance() == 32){
                damageMultiplier += 2;
            }
            damage = damage + ((damage / 2) * damageMultiplier);
            //Random variance
            damage = (int)(damage * Random.roll(7,15) / 10);
            //defense mod
            //we're fucking things up here
            //damage = damage / 100;
            damage = (int) (damage - (battleContext.getPlayer().getJob().getDefense() ));
            //protect
            if(battleContext.getPlayer().getProtect() == true){
                damage = (int)(damage * .5);
            }

            battleContext.getPlayer().getJob().applyDamage(damage); 
            System.out.println(ConsoleColors.RED + battleContext.getMonster().getName() + " hits " + battleContext.getPlayer().getName() + " for " + damage + " damage." + ConsoleColors.RESET);
        } else {
            System.out.println("The " + battleContext.getMonster().getName() + " misses you.");
        }
    }

    public boolean hits(){
        if(battleContext.getPlayer().getClear()){
            return false;
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
        // if(battleContext.getPlayer().getImage()){

        // }
        
        if((battleContext.getMonster().getHitRate() * battleContext.getPlayer().getBlockValue()) >= Random.roll(1,100)){
            return true;
        }

        System.out.println(ConsoleColors.YELLOW + "The " + battleContext.getMonster().getName() + "misses you." + ConsoleColors.RESET);
        return false;

    }
}
