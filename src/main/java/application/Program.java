/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;


/**
 *
 * @author lelo0
 */
public class Program {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true){
        UI.printBoard(chessMatch.getPieces());
        System.out.println();
        System.out.print("Source: ");
        ChessPosition source = UI.readChessPosition(sc);
        System.out.println();
        System.out.print("Target: ");
        ChessPosition target = UI.readChessPosition(sc);
        ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
    }
    }
}
