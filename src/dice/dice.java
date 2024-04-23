package dice;

public class dice {
    int MIN = 1;
    int  MAX = 6;

    public int dicedetail (){
        double d = (Math.random()*(MAX)) + MIN;
        return (int)d;
    }
    
}
