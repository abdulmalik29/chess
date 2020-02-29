package chess;

public class Rook extends Piece{

  public Rook (PieceColour a){
		if (PieceColour.WHITE == a){
			setSymbol("\u2656");
		}
		else{
      setSymbol("\u265C");
		}
  }
  public boolean isLegitMove(int i0, int j0, int i1, int j1){
    Square [][] board = Board.getBoard();
		int diff_i = Math.abs(i0 - i1);
		int diff_j = Math.abs(j0 - j1);
    int i;
    int j;
    if((diff_i >= 1 && diff_j == 0) || (diff_j >= 1 && diff_i == 0)){
      // for (i = i0; i<= i1 ; i++) {
      //   for (j = j0; j<= j1; j++) {
      //
      //     if (board[i][j].hasPiece() == true){
      //       return false;
      //     }
      //     else {return true;}
          return true;}

      //   }
      // }
    return false;
  }
}
