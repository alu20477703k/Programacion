package EnumTypes;

import Nums;

public class EnumTest {

		Nums num;

		public EnumTest(Nums num) {
			
			this.num=num;

		}

		public void di() {
			switch (num) {
			case ZERO:
				System.out.println("0");
				break;
			case ONE:
				System.out.println("1");
				break;
			case TWO:
				System.out.println("2");
				break;
			case THREE:
				System.out.println("3");
				break;
			default:
				System.out.println("Mec");
			}
		}
	

	public static void main(String[] args) {

		EnumTest first = new EnumTest(Nums.ZERO);
		first.di();
		EnumTest second = new EnumTest(Nums.ONE);
		first.di();
		EnumTest third = new EnumTest(Nums.TWO);
		first.di();
		EnumTest forth = new EnumTest(Nums.THREE);
		first.di();

	}
}