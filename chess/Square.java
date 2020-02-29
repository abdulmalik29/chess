package chess;


//This class is partially implemented
public class Square {
	private int i;
	private int j;
	private boolean hasPiece;
	private Piece p;

	public Square(int iIn, int jIn){
		i=iIn;
		j=jIn;
	}

	public Piece getPiece(){
		return p;
	}

	public void setPiece(Piece a){
		 p = a;
	}

	public void removePiece(){
		p = null;
	}

	public boolean hasPiece(){
		Square [][] board = Board.getBoard();
		return true;
		// return board[i][j].getPiece() !=null;
		// return !hasPiece;
	}

	public int getI(){
		return i;
	}

	public int getJ(){
		return j;
	}
}
