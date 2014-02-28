package Ship;


public class Board {
	
	int[][] tabla = new int[8][8];
	char[][] barcos = {
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ',' ',' ',' '}};
	
	boolean[][] shipPlaces=new boolean[8][8];
	int sunkShips;
	
	public void createShips(int ships) {
		
		int fila, col;
		
		for (int i=0;i<ships;i++) {
			
			fila = 1 + (int)(Math.random() * ((7 - 1) + 1));
			col = 1 + (int)(Math.random() * ((7 - 1) + 1));
		
			tabla[fila][col] = 1;
			
		}
	
	} // void createShips(int ships)
	
	public int getSunkShips (){

		return sunkShips;
		
	} // void getSunkShips ()
	

	public void print () {
		
		char letter = 'a';
		System.out.println("    0 1 2 3 4 5 6 7");
		System.out.print("    ------------------");
		for(int i=0;i<8;i++){
			
			System.out.println("");
			System.out.print(letter + " | ");
			letter++;
			
			for(int j=0;j<8;j++){
				System.out.print(barcos[i][j] + " ");
			}
		}System.out.println("");
		System.out.println("----------------------");
	}

	public boolean shotAt (char row, int col){
		
		boolean x = false;
		int fila = row - 97;
		
		if ((fila < 0 || fila > 7 ) || ( col < 0 || col > 7)){ 
			System.out.println("Invalid Values!");
			return x;
			
		}		
		
		if (tabla[fila][col] == 1){

			x = true;
			sunkShips++;
			tabla[fila][col] = 0;
			System.out.println("Good Shot!, there are still " + ( 10 - sunkShips ) + " boats alive");
			barcos[fila][col] = 'X';

		}else{
			
			System.out.println("Bad Shot!, Enter new values!");
			barcos[fila][col] = 'O';
			print();
		}
		return x;
	}





}



	