package textgame;

import java.net.SocketTimeoutException;

import textgame.battle.Battle;

public class Attack extends Action {
    protected Battle battleContext;
    protected int attack;
    protected int damage;
    protected int damageMultiplier;
    public Attack(Battle battleContext){
        this.battleContext = battleContext;
        if(this.hits()){
            attack = battleContext.getPlayer().getMainHand().getBattlePower() + (battleContext.getPlayer().getVigor2());
            damageMultiplier = 0;
            if(battleContext.getPlayer().getBerserked()){
                damageMultiplier += 1;
            }
            if( battleContext.getPlayer().getCritChance() == 32){
                damageMultiplier += 2;
            }
            damage = damage + ((damage / 2) * damageMultiplier)
            //Random variance
            damage = (int)(damage * (Math.random() * (255 + 244) + 244));
            //defense mod
            damage = (damage * (255 - battleContext.getMonster().getDefense()) / 256) + 1;
            //protect
            if(battleContext.getMonster().getProtect() == true){
                damage = (damage * 170 / 256) + 1;
            }
            System.out.println("You hit " + battleContext.getMonster().typeToString() + " for " + damage + " damage.");
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

        if((battleContext.getPlayer().getMainHand().getHitRate() * battleContext.getMonster().getBlockValue()) >= (int) ((Math.random() * (99 - 0)) + 0)){
            return true;
        }

        System.out.println("You miss the " + battleContext.getMonster().typeToString());
        return false;

    }
}
