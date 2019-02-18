package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String WinningMove = "";

        if (handSign == ROCK ) {
            WinningMove = PAPER;
        }else if ( handSign == PAPER) {
            WinningMove = SCISSOR;
        }else if ( handSign == SCISSOR) {
            WinningMove = ROCK;
        } else {
            return null;
        }

        return WinningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String LosingMove = "";

        if (handSign == ROCK ) {
            LosingMove = SCISSOR;
        }else if ( handSign == PAPER) {
            LosingMove = ROCK;
        }else if ( handSign == SCISSOR) {
            LosingMove = PAPER;
        } else {
            return null;
        }

        return LosingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String Winner = "";
        if(handSignOfPlayer1 == SCISSOR && handSignOfPlayer2 == PAPER) {
            Winner = handSignOfPlayer1;
        }else if (handSignOfPlayer1 == PAPER && handSignOfPlayer2 == ROCK) {
            Winner = handSignOfPlayer1;
        }else if (handSignOfPlayer1 == ROCK && handSignOfPlayer2 == SCISSOR) {
            Winner = handSignOfPlayer1;
        } else if (handSignOfPlayer1 == handSignOfPlayer2) {
            Winner = "Tie";
        } else {
            Winner = handSignOfPlayer2;
        }

       return Winner;
    }
}
