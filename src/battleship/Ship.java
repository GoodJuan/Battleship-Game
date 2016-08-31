package battleship;

public class Ship extends BattleshipGame {
	
	private static int size;
	private int x, y;
	private int direction; //true = vertical, false = horizontal
	private String typeOfShip;
	
	public Ship(int size, int x, int y, int direction, String typeOfShip) {
		this.size = size;
		this.direction = direction;
		this.typeOfShip = typeOfShip;
		this.x = x;
		this.y = y;
	}
	
	public int getSize(){
		return size;
	}
	public int getDirection() {
		return direction;
	}
	public int getX() {
		return x;
	}
	public int getY(){
		return y;
	}
	public String getName(){
		return typeOfShip;
	}

}
