package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Runs the A* search on a Board
 */
public class Game {
    public static void main(String [] args) throws IOException {
        File boardTxt = new File(args[0]);
        int heuristicChoice = Integer.parseInt(args[1]);
        Board board = new Board(boardTxt);
    }
}