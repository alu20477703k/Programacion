package Author;

public class Point {
	private int x;
	private int y;
	Point() {
		x=0;
		y=0;
	}
	Point(int newX, int newY) {
		x=newX;
		y=newY;
	}
	public String toString() {
		return "("+x+" , "+y+")";
	}
	public void moveTo(int newX, int newY) {
		x = newX;
		y = newY;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int newX) {
		x = newX;
	}
	public void setY(int newY) {
		y = newY;
	}
	public void setOffset(int offX, int offY) {
		x = x + offX;    //x += offX;
		y = y + offY;
	}
	public static float distance(Point p1,Point p2){
		
		int distX = p2.getX()-p1.getX();
		int distY = p2.getY()-p1.getY();
		
		float dist = (float)Math.sqrt(distY*distY+distX*distX);
		return Math.abs(dist);
	}
}
