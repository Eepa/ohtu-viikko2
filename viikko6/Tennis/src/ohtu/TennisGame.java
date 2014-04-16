package ohtu;

public class TennisGame {

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            player1Score++;
        } else {
            player2Score++;
        }

    }

    public String returnEvenScore(int score) {

        switch (score) {
            case 0:
                return "Love-All";

            case 1:
                return "Fifteen-All";

            case 2:
                return "Thirty-All";

            case 3:
                return "Forty-All";

        }
        return "Deuce";
    }

    public String returnAdvantageOrWinningScore(int playerScoreDistance) {

        if (playerScoreDistance == 1 || playerScoreDistance == -1) {
            return this.returnAdvantageScore(playerScoreDistance);
        }

        return this.returnWinningScore(playerScoreDistance);

    }

    public String returnAdvantageScore(int playerScoreDistance) {
        if (playerScoreDistance == 1) {
            return "Advantage player1";
        }
        return "Advantage player2";

    }

    public String returnWinningScore(int playerScoreDistance) {
        if (playerScoreDistance >= 2) {
            return "Win for player1";
        }
        return "Win for player2";

    }

    public String returnUnevenScore() {

        return this.getPlayerScore(player1Score) + "-" + this.getPlayerScore(player2Score);

    }

    public String getPlayerScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";

            case 1:
                return "Fifteen";

            case 2:
                return "Thirty";

            case 3:
                return "Forty";

        }
        return "";
    }

    public String getScore() {

        if (player1Score == player2Score) {
            return this.returnEvenScore(player1Score);

        } else if (player1Score >= 4 || player2Score >= 4) {
            return this.returnAdvantageOrWinningScore(player1Score - player2Score);

        }

        return this.returnUnevenScore();

    }
}
