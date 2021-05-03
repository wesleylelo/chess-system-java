/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author lelo0
 */
public abstract class Rook extends ChessPiece {
    
    public Rook(Board board, Color color) {
        super(color, board);
    }


    @Override
    public String toString(){
        return "R";
    }
  
   @Override 
    public boolean[][] possibleMoves(){
        boolean[][] mat  = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);
        p.setValues(position.getRow() - 1, position.getColumn());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        p.setValues(position.getRow(), position.getColumn() - 1);
        while(getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if(getBoard().positionExists(p)&& isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        p.setValues(position.getRow() + 1, position.getColumn());
        while(getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if(getBoard().positionExists(p)&& isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        return mat;
    }
}