package chess;

import java.util.Scanner;


public class Game {
	public int coord1;
	public int coord2;
	public int coord3;
	public int coord4;
	public int counter = 0;
	private static boolean gameEnd=false;

	public Game(){
		Board b = new Board();
		b.initialisePieces();
		b.printBoard();

		while (!gameEnd){
		if (counter % 2 == 0){
			System.out.print("\n-----Whites move -----\n");}
		else{System.out.print("\n-----Blacks move -----\n");}

		counter++;

		Scanner input= new Scanner(System.in);
		System.out.print("Enter orgin: (number + letter) ");
		String orgin = input.nextLine();

		if (orgin.matches(("[1-8][a-hA-H]"))){
			System.out.print("Enter destination: ");
			String destination = input.nextLine();

			if (destination.matches(("[1-8][a-hA-H]"))){

				if 			(orgin.charAt(0) == '1'){coord1 = 0;}
				else if (orgin.charAt(0) == '2'){coord1 = 1;}
				else if (orgin.charAt(0) == '3'){coord1 = 2;}
				else if (orgin.charAt(0) == '4'){coord1 = 3;}
				else if (orgin.charAt(0) == '5'){coord1 = 4;}
				else if (orgin.charAt(0) == '6'){coord1 = 5;}
				else if (orgin.charAt(0) == '7'){coord1 = 6;}
				else if (orgin.charAt(0) == '8'){coord1 = 7;}

				if 			(orgin.charAt(1) == 'a'){coord2 = 0;}
				else if (orgin.charAt(1) == 'b'){coord2 = 1;}
				else if (orgin.charAt(1) == 'c'){coord2 = 2;}
				else if (orgin.charAt(1) == 'd'){coord2 = 3;}
				else if (orgin.charAt(1) == 'e'){coord2 = 4;}
				else if (orgin.charAt(1) == 'f'){coord2 = 5;}
				else if (orgin.charAt(1) == 'g'){coord2 = 6;}
				else if (orgin.charAt(1) == 'h'){coord2 = 7;}

				if 			(destination.charAt(0) == '1'){coord3 = 0;}
				else if (destination.charAt(0) == '2'){coord3 = 1;}
				else if (destination.charAt(0) == '3'){coord3 = 2;}
				else if (destination.charAt(0) == '4'){coord3 = 3;}
				else if (destination.charAt(0) == '5'){coord3 = 4;}
				else if (destination.charAt(0) == '6'){coord3 = 5;}
				else if (destination.charAt(0) == '7'){coord3 = 6;}
				else if (destination.charAt(0) == '8'){coord3 = 7;}

				if 			(destination.charAt(1) == 'a'){coord4 = 0;}
				else if (destination.charAt(1) == 'b'){coord4 = 1;}
				else if (destination.charAt(1) == 'c'){coord4 = 2;}
				else if (destination.charAt(1) == 'd'){coord4 = 3;}
				else if (destination.charAt(1) == 'e'){coord4 = 4;}
				else if (destination.charAt(1) == 'f'){coord4 = 5;}
				else if (destination.charAt(1) == 'g'){coord4 = 6;}
				else if (destination.charAt(1) == 'h'){coord4 = 7;}
				}

			else{ System.out.println("\nwrong input try again");}
			}

		else{ System.out.println("wrong input try again: ");}

		Square [][] board = Board.getBoard();
		Piece p = board[coord1][coord2].getPiece();
		Piece p1 = board[coord3][coord4].getPiece();
		boolean move = b.movePiece(coord1, coord2, coord3, coord4, p);
		// boolean empty = false;
		// String allay = p1.getSymbol();
		//
		// if ((counter % 2 == 0) && ((allay == "\u2659") ||
		// (allay == "\u2658")||
		// (allay == "\u2657")||
		// (allay == "\u2656")||
		// (allay == "\u2655")||
		// (allay == "\u2654"))){
		// 	move = false;
		// 	System.out.println("\n   cant move the piece, play again   ");
		// 	counter++;}

		if (move != true){
			System.out.println("\n**** cant move the piece, play again ****");
			counter++;}
		}
	}


	public static void main (String args[]){
		Game g  = new Game();
	}
}
