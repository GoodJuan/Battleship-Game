package battleship;

public class CreateShips extends BattleshipGame{
	
	boolean directionGame;
	
	public static int randomDirection(){
		int directionNum = rand.nextInt(2);
		System.out.println(directionNum);
		return directionNum;
	}
	
	//replace 2nd to 4th number when we need to prompt the user to input their number.
	static Ship aircraftCarrier = new Ship(5, 1, 1, 1, "Aircraft Carrier");
	
	static Ship battleShip = new Ship(4, 8, 7, 1, "Battleship");
	
	Ship submarine = new Ship(3, 7, 6, 1, "Submarine");
	
	Ship ptBoat = new Ship(2, 5, 4, 1, "PT Boat");

}
