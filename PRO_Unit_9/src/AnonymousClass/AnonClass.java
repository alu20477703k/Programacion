package AnonymousClass;

class AnonClass {

	public void read() {

		System.out.println("Hola!");
	}

	class AnonClass2 {

		AnonClass an = new AnonClass() {
			public void read() {
				System.out.println("Hola_2");
			}
		};
	}
	

	public static void main(String[] args) {

		AnonClass a = new AnonClass();

		}
}
