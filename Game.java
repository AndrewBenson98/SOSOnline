import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		AI ai = new AI();
		AI ai2 = new AI();
		char[][] grid = new char[16][16];

		// Make the board
		for (int y = 3; y < grid.length - 3; y++) {
			for (int x = 3; x < grid[y].length - 3; x++) {
				grid[x][y] = '-';
			}
		}

		Scanner keyboard = new Scanner(System.in);

		// Dispalys the grid
		while (!isBoardFull(grid)) {
			// ai.displayGrid(grid);

			System.out.println("AI TURN");
			while (ai.myTurn(grid)&&!isBoardFull(grid)) {
				
			}
			if(isBoardFull(grid))
				break;
			// ai.displayGrid(grid);
//			System.out.println("PLAYER TURN");
//			char c = keyboard.next().charAt(0);
//			 int x = keyboard.nextInt();
//			 int y = keyboard.nextInt();
//			 
//			 playTurn(grid,x+3,y+3,c);
//			 ai.displayGrid(grid);
			System.out.println("AI2 TURN");
			while (ai2.myTurn(grid)&&!isBoardFull(grid)) {
				
			}
			if(isBoardFull(grid))
				break;
		}

		System.out.println("PLAYER 1: "+ai.getPoints()+" Points");
		System.out.println("PLAYER 2: "+ai2.getPoints()+" Points");
		keyboard.close();
	}

	public static void playTurn(char[][] grid, int x, int y, char letter) {
		if (grid[y][x] == '-') {
			grid[y][x] = letter;
		} else
			System.out.println("Invalid location");

	}

	public static boolean isBoardFull(char[][] grid) {
		// Make the board
		for (int y = 3; y < grid.length - 3; y++) {
			for (int x = 3; x < grid[y].length - 3; x++) {
				if (grid[y][x] == '-') {
					return false;
				}
			}
		}
System.out.println("Board is full");
		return true;
	}
}
