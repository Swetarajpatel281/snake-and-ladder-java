
package game;

import board.Board;
import coordinates.coordinates;
import dice.dice;
import jumper.Jumper;
import player.player;

public class Game {
    Board board;
    player[] players;
    boolean[] isAllowed;
    int turn;
    coordinates[] places;
    dice dice;

    public Game(Board board, player[] players, dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        turn = 0;
        isAllowed = new boolean[players.length];
        places = new coordinates[players.length];

        for(int i=0;i<players.length;i++) places[i] = new coordinates(board.getboardsize()-1, 0);
    }

    public void play() {
        while(true) {
            int num = dice.dicedetail();
            System.out.println(players[turn].getplayername() + " rolled -> " + num + " [" + places[turn].getrow() + "," + places[turn].getrcolValue() + "]");

            if (!isAllowed[turn]) {
                if (num != 1) {
                    turn = 1-turn;
                    // turn = 1 => 1-1 = 0;
                    // turn = 0 => 1-0 = 1;
                    continue;
                } else {
                    isAllowed[turn] = true;
                }
            }

            coordinates newCoordinates = getNewCoordinates(places[turn], num);
            if (newCoordinates.getrow() < 0) {
                System.out.println(players[turn].getplayername() + " has won");
                return;
            }

            places[turn] = newCoordinates;
            turn  = 1-turn;
        }
    }

    private coordinates getNewCoordinates(coordinates oldCoordinates, int num) {
        int row = oldCoordinates.getrow();
        int col = oldCoordinates.getrcolValue();

        while (num>0) {
            if (row%2 != 0) {
                if (col == board.getboardsize()-1) row--;
                else col++;

            } else {
                if (col == 0) row--;
                else col--;
            }

            num--;
        }

        if (row < 0) return new coordinates(row, col);
        if (checkIfJumperExists(row,col)) {
            Jumper jumper = board.jumper.get(board.board[row][col]);

            return jumper.end;

        }

        return new coordinates(row, col);
        
    }

    private boolean checkIfJumperExists(int row, int col) {
        return board.jumper.containsKey(board.board[row][col]);
    }
}