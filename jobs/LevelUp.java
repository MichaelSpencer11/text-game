package textgame.jobs;

public class LevelUp {
    public LevelUp(Job job, int exp, int maxExp ){
        //carry over exp from previous level
        exp = exp - maxExp;
        //level up
        job.setLevel(job.getLevel() + 1);
        //set new exp need for next level up
        job.increaseMaxExp(job.getLevel());
        //set new hp
        job.setMaxHp(job.getLevel());
        //set new mp
        
        

    }
}
