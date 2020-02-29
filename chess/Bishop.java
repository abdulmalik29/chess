package chess;

public class Bishop extends Piece{

  public Bishop (PieceColour a){
		colour = a;
		if (colour == PieceColour.WHITE){
      setSymbol("\u2657");
		}
		else{
			setSymbol("\u265D");
		}
  }
  public boolean isLegitMove(int i0, int j0, int i1, int j1){
		int diff_i = Math.abs(i0 - i1);
		int diff_j = Math.abs(j0 - j1);
    if(diff_i == diff_j){return true;}
    return false;
  }
}
