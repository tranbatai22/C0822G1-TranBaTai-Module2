package ss8_clean_and_refactoring.exercise;

public class TennisGame {
    public static String getScore(String namePlayer1, String namePlayer2, int scoreNumber1, int scoreNumber2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        int minusResult = scoreNumber1 - scoreNumber2;
        if (scoreNumber1 == scoreNumber2) {
            switch (scoreNumber1) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (scoreNumber2 >= 4 || scoreNumber1 >= 4) {
            switch (minusResult) {
                case 1:
                    score = new StringBuilder("Advantage player1");
                    break;
                case -1:
                    score = new StringBuilder("Advantage player2");
                    break;
                default:
                    if (minusResult > 0)
                        score = new StringBuilder("Win for player1");
                    else {
                        score = new StringBuilder("Win for player2");
                    }
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreNumber1;
                else {
                    score.append("-");
                    tempScore = scoreNumber2;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}