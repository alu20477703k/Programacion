package InnerClass;
public class Calc {
	
	int a;
	int b;
	
	public Calc(int i, int j) {
		
		a = i;
		b = j;
		
		pro p = new pro();
		
		System.out.println("Producto: "+p.pro());
		System.out.println("Suma: "+p.sum());
		
	}

	class pro {
		public int pro() {
			int pro = a * b;
			return pro;
		}

		public int sum() {
			int sum = a + b;
			return sum;
		}
	}
}
