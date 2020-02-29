package chess;

public class Queen extends Piece{

  public Queen (PieceColour a){
    colour = a;
    if (colour == PieceColour.WHITE){
      setSymbol("\u2655");
    }
    else{
      setSymbol("\u265B");
    }
  }
  public boolean isLegitMove(int i0, int j0, int i1, int j1){
    int diff_i = Math.abs(i0 - i1);
    int diff_j = Math.abs(j0 - j1);

    if((diff_i >= 1 && diff_j == 0) || (diff_j >= 1 && diff_i == 0) ||
      (diff_i == diff_j)){
        return true;}
    return false;
  }
}
