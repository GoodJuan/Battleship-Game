package battleship;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleshipGame {

	static Random rand = new Random();
	static int xPos;
	static int yPos;
	
	//static Ship aircraftCarrier = new Ship(5, 9, 8, directionGame, "Aircraft Carrier");
	
	static Scanner input = new Scanner(System.in);
	static String[][] playerBoard = {{" ","1","2","3","4","5","6","7","8","9","10"},
									{"A","~","~","~","~","~","~","~","~","~","~"},
									{"B","~","~","~","~","~","~","~","~","~","~"},
									{"C","~","~","~","~","~","~","~","~","~","~"},
									{"D","~","~","~","~","~","~","~","~","~","~"},
									{"E","~","~","~","~","~","~","~","~","~","~"},
									{"F","~","~","~","~","~","~","~","~","~","~"},
									{"G","~","~","~","~","~","~","~","~","~","~"},
									{"H","~","~","~","~","~","~","~","~","~","~"},
									{"I","~","~","~","~","~","~","~","~","~","~"},
									{"J","~","~","~","~","~","~","~","~","~","~"}};
	
	static String[][] hiddenBoard = {{" ","1","2","3","4","5","6","7","8","9","10"},
									{"A","~","~","~","~","~","~","~","~","~","~"},
									{"B","~","~","~","~","~","~","~","~","~","~"},
									{"C","~","~","~","~","~","~","~","~","~","~"},
									{"D","~","~","~","~","~","~","~","~","~","~"},
									{"E","~","~","~","~","~","~","~","~","~","~"},
									{"F","~","~","~","~","~","~","~","~","~","~"},
									{"G","~","~","~","~","~","~","~","~","~","~"},
									{"H","~","~","~","~","~","~","~","~","~","~"},
									{"I","~","~","~","~","~","~","~","~","~","~"},
									{"J","~","~","~","~","~","~","~","~","~","~"}};
	
									
									
	
	
	public static void inputPos(){
		System.out.println("Input a x coordinate (number)");
		xPos = input.nextInt();
		System.out.println("Input a letter for the y coordinate (letter)");
		char yCor = input.next().charAt(0);
		if (yCor == 'A'){
			yPos = 1;
		}
		else if (yCor == 'B'){
			yPos = 2;
		}
		else if (yCor == 'C'){
			yPos = 3;
		}
		else if (yCor == 'D'){
			yPos = 4;
		}
		else if (yCor == 'E'){
			yPos = 5;
		}
		else if (yCor == 'F'){
			yPos = 6;
		}
		else if (yCor == 'G'){
			yPos = 7;
		}
		else if (yCor == 'H'){
			yPos = 8;
		}
		else if (yCor == 'I'){
			yPos = 9;
		}
		else if (yCor == 'J'){
			yPos = 10;
		}
		
	}
	

	
	
	public static void makeShipArray() { 
		
		int xAC = CreateShips.aircraftCarrier.getX();
		int yAC = CreateShips.aircraftCarrier.getY();
		System.out.println(xAC);
		System.out.println(yAC);
		for (int a = 0; a < CreateShips.aircraftCarrier.getSize(); a++){
			hiddenBoard[yAC][xAC] = "½";
			if (CreateShips.aircraftCarrier.getDirection() == 1){
				yAC++;
			}
			else if (CreateShips.aircraftCarrier.getDirection() == 2){
				yAC--;
			}
			else if (CreateShips.aircraftCarrier.getDirection() == 3){
				xAC++;
			}
			else {
				xAC--;
			}
		}
		
		int xBC = CreateShips.battleShip.getX();
		int yBC = CreateShips.battleShip.getY();
		System.out.println(xAC);
		System.out.println(yAC);
		for (int a = 0; a < CreateShips.battleShip.getSize(); a++){
			hiddenBoard[yBC][xBC] = "Æ";
			if (CreateShips.battleShip.getDirection() == 1){
				yBC++;
			}
			else if (CreateShips.battleShip.getDirection() == 2){
				yBC--;
			}
			else if (CreateShips.battleShip.getDirection() == 3){
				xBC++;
			}
			else {
				xBC--;
			}
		}
	}
	

	private static void printArray(String[][] arr) {
		// TODO Auto~generated method stub
		for (String[] rows : arr){
			for (String i : rows){
				System.out.print(" " + i );
			}
			System.out.println();
		}
		
	}
	
	public static void checkArray() {
		//if hit a battleship
		if (hiddenBoard[yPos][xPos].equals("Æ")){
			playerBoard[yPos][xPos] = "X";
			System.out.println("You hit something!");
			printArray(hiddenBoard);
			System.out.println("\n");
			printArray(playerBoard);
			System.out.println("\n\n\n");
			game();
		}
		//if hit a carrier
		else if (hiddenBoard[yPos][xPos].equals("½")){
			playerBoard[yPos][xPos] = "X";
			System.out.println("You hit something!");
			printArray(hiddenBoard);
			System.out.println("\n");
			printArray(playerBoard);
			System.out.println("\n\n\n");
			game();
		}
		//if hit a submarine
		else if (hiddenBoard[yPos][xPos].equals("×")){
			playerBoard[yPos][xPos] = "X";
			System.out.println("You hit something!");
			printArray(hiddenBoard);
			System.out.println("\n");
			printArray(playerBoard);
			System.out.println("\n\n\n");
			game();
		}
		//if hit a pt boat
		else if (hiddenBoard[yPos][xPos].equals("¸")){
			playerBoard[yPos][xPos] = "X";
			System.out.println("You hit something!");
			printArray(hiddenBoard);
			System.out.println("\n");
			printArray(playerBoard);
			System.out.println("\n\n\n");
			game();
		}
		else {
			System.out.println("You missed!");
			playerBoard[yPos][xPos] = "O";
			printArray(hiddenBoard);
			System.out.println("\n");
			printArray(playerBoard);
			System.out.println("\n\n\n");
			game();
		}
	}

	
	public static void game(){
		inputPos();
		makeShipArray();
		checkArray();

	}
	
	
	public static void main(String[] args) {
		// TODO Auto~generated method stub
		game();
	}



}
