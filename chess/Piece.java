package chess;
// abstract
public abstract class Piece {
  private int row;
  private int column;
  private String symbol;
  protected PieceColour colour;

  public Piece(){}

  public String getSymbol(){
    return symbol;
  }

  public void setSymbol(String s){
    symbol = s;
  }

  public PieceColour getColour(){
    return colour;
  }

  public void updateCoordinates(int x, int y){
    row = x;
    column = y;
  }

  public abstract boolean isLegitMove(int x1, int y1, int x2, int y2);

}
