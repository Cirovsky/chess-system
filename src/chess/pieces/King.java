package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	
	public King(Color color) {
		super(null, color);
	}

	public King(Board board, Color color) {
		super(board, color);
	}

	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		// above
		p.setValues(position.getRow() - 1, position.getColumn());

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// down
		p.setValues(position.getRow() + 1, position.getColumn());

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// left

		p.setValues(position.getRow(), position.getColumn() - 1);

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// right

		p.setValues(position.getRow(), position.getColumn() + 1);

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal up left

		p.setValues(position.getRow() - 1, position.getColumn() - 1);

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal down right

		p.setValues(position.getRow() + 1, position.getColumn() + 1);

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal up right

		p.setValues(position.getRow() - 1, position.getColumn() + 1);

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		//diagonal down left
		
		p.setValues(position.getRow() + 1, position.getColumn() - 1);

		if (getBoard().positionExists(p) && (isThereOpponentPiece(p) || !getBoard().thereIsAPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}

}
