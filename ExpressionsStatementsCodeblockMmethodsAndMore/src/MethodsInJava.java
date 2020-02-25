public class MethodsInJava {
    public static void main (String[] args) {

        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Benjamin", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,
                                      int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String playerName, int position ){

        System.out.println(playerName + " managed to get into position " + position);

    }

    public static int calculatedHighScorePosition (int playerScore){

        if(playerScore >= 1000)
            return 1;
        if (playerScore >= 500)
            return 2;
        if (playerScore >= 100)
            return 3;
        else
            return 4;
    }
}
