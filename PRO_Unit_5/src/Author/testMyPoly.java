package Author;

public class testMyPoly {

	public static void main(String[] args) {

		MyPolynomial poly = new MyPolynomial(2,3,4);
		MyPolynomial anotherPoly = new MyPolynomial(4,3);
		
		System.out.println("Degree: "+poly.getDegree());
		System.out.println("\nPoly: "+poly.toString() + "    evaluate(1) -> "+poly.evaluate(1));
		
		System.out.println(poly.add(anotherPoly));
		poly.multiply(poly,anotherPoly);

		
	}

}
