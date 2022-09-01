package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Paw extends ChessPiece{

	public Paw(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "P";
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
Position p = new Position(0, 0);
		
		// above
		p.setValues(position.getRow() - 1, position.getColumn());
		for( int i = 0; i < 1; i ++) {
			mat[p.getRow()][p.getColumn()] = true;
			i++;
		}
		if (getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = false;
		}
		//diagonal left
		
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//diagonal right
		
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}