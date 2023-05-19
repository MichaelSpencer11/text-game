package textgame.jobs;

import textgame.ConsoleColors;

public class LevelUp {
    public LevelUp(Job job, int exp, int maxExp ){
        System.out.println(ConsoleColors.BLUE + "Level Up!" + ConsoleColors.RESET);
        //carry over exp from previous level
        exp = exp - maxExp;
        //level up
        job.setLevel(job.getLevel() + 1);
        //set new exp need for next level up
        job.setMaxExp(job.getLevel());
        //set new hp
        job.setMaxHp(job.getLevel());
        //set new mp
        job.setMaxMp(job.getLevel());
        //set new vigor
        job.setVigor(job.getLevel());
        //set new defense
        job.setDefense();
        

    }
}
