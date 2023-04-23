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
            attack = battleContext.getMonster().getBattlePower() + (battleContext.getMonster().getVigor2());
            damage = battleContext.getMonster().getBattlePower() + ((battleContext.getMonster().getLevel() ^ 2 * attack) / 256 ) * 3 / 2;
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
            damage = (int) (damage * (255 - battleContext.getPlayer().getDefense()) / 256) + 1;
            //protect
            if(battleContext.getPlayer().getProtect() == true){
                damage = (int)(damage * 170 / 256) + 1;
            }
            battleContext.getPlayer().getJob().applyDamage(damage); 
            System.out.println(ConsoleColors.RED + battleContext.getMonster().getName() + " hits you for " + damage + " damage." + ConsoleColors.RESET);
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

        System.out.println(ConsoleColors.YELLOW + "The " + battleContext.getMonster().typeToString() + "misses you." + ConsoleColors.RESET);
        return false;

    }
}
