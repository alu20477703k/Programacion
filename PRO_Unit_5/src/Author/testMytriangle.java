package Author;

public class testMytriangle{

	public static void main(String[] args) {

		
		Triangle t2 = new Triangle(new Point(0,0),new Point(2,0),new Point(2,2));
		System.out.println("Triangle: "+t2);
		System.out.println("\nThis triangle has a perimeter of: "+t2.getPerimeter());
		System.out.println("This triangle is: "+t2.printType());


	}

}
