package chess;

public class Knight extends Piece{

  public Knight (PieceColour a){
		colour = a;
		if (colour == PieceColour.WHITE){
			setSymbol("\u2658");
		}
		else{
			setSymbol("\u265E");
		}
  }
  public boolean isLegitMove(int i0, int j0, int i1, int j1){
    int diff_i = Math.abs(i0 - i1);
    int diff_j = Math.abs(j0 - j1);

    if( (diff_i == 2 && diff_j == 1)||(diff_j == 2 && diff_i == 1) ){
         return true;}

    return false;
  }
}
