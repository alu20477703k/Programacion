package Author;
public class MyPolynomial {

	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;

	}

	public int getDegree() {
		return coeffs.length;
	}

	public String toString() {
		String poly = "0";
		for (int i = 0; i < coeffs.length; i++) {
			poly = ((int) coeffs[i] + "x^" + (i + 1) + "+").concat(poly);
		}
		return poly;
	}

	public double evaluate(double num) {

		double res1 = 0, res2 = 0, resTotal = 0;
		for (int i = 0; i < coeffs.length; i++) {
			res1 = (coeffs[i] * num);
			res2 = Math.pow(res1, i + 1);
			resTotal = res2 + resTotal;

		}
		return resTotal;
	}

	public MyPolynomial add(MyPolynomial p) {

		double[] newPol;
		int lengthMax;

		if (p.getDegree() > getDegree()) {
			lengthMax = p.getDegree();
			newPol = new double[lengthMax];
			for (int i = 0; i < getDegree(); i++) {

			}
		} else {
			lengthMax = getDegree();
			newPol = new double[lengthMax];

		}

		return p;
	}

	public String multiply(MyPolynomial poly, MyPolynomial anotherPoly) {

		return "";
	}

}
