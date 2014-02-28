package Ship;

import java.util.Scanner;

public class Ships {
	final static int NUM_SHIPS=10;
	public static void main(String[] args) {
		
		Scanner inputValue = new Scanner (System.in);
		Board Board = new Board();
		
		char row;
		int column;
		
		Board.createShips(NUM_SHIPS);
		
		int shots=0;
		int sunkShips=0;
		
		while (sunkShips < NUM_SHIPS) {
			
			System.out.println("---------------");
			System.out.println("Shots: " + shots);
			System.out.println("Sunk indexShips: " + Board.getSunkShips());
			Board.print();
			do {
				
				System.out.println("Enter the row ( letter ): " );
				row=inputValue.next().charAt(0);
				System.out.println("Enter a column ( number ): " );
				column=inputValue.nextInt();
				if ((row >= 0 && row <= 7 ) || ( column >= 0 && column <= 7))
				shots++;
			}while (!Board.shotAt(row,column));
				
		}
			
	}
			
}
