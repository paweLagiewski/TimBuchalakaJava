package Exercise;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount<0 || smallCount<0 || goal<0)
            return false;

        for(; bigCount>0; bigCount--){
            if(goal - 5 >= 0)
                goal-=5;
        }

        if(smallCount >= goal)
            return true;


        return false;
    }
}
