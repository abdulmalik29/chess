package chess;

public class Pawn extends Piece{

	public Pawn (PieceColour a){
		colour = a;
		if (colour == PieceColour.WHITE){
			setSymbol("\u2659");
		}
		else{
			setSymbol("\u265F");
		}
	}
	public boolean isLegitMove(int i0, int j0, int i1, int j1){
    int diff_i = Math.abs(i0 - i1);
    int diff_j = Math.abs(j0 - j1);

		if (diff_i == 1) {
			return true;
		}
		else if ((i0 == 1 )|| (i0 == 6)){
			if ((diff_i == 1) || ((diff_i == 2))) {
				return true;
			}
		}
		return false;
	}
}
