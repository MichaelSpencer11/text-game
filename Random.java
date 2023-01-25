package textgame;

public class Random {

    public static int roll(int low, int high){
        return (int)Math.floor(Math.random() * (high + low) + low);
    }
}
