package Exercise;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){

        if(first<10 || second<10)
            return -1;

        for(int i=first; i>=0; i-- ){

            for(int y=second; y>=0; y--){


                if(i == y){
                    if(first%i==0){
                        if(second%y==0){
                            return y;
                        }
                    }
                }

//                if(first%i==0){
//                    if(second%y==0){
//                        if(i == y) {
//                            return divided;
//                        }
//                    }
//                }


            }
        }

        return -1;
    }
}
