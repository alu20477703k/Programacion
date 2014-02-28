package Exercises;

public class MainClass {

	public static void main(String[] args) {

		StringMatcher s = new StringMatcher();
		
		System.out.println("Method 1: ");
		System.out.println("yes -> "+s.method1("yes"));
		System.out.println("Yes -> "+s.method1("Yes"));
		System.out.println("True -> "+s.method1("True"));
		System.out.println("true -> "+s.method1("true"));
		System.out.println("tue -> "+s.method1("tue"));
		
		System.out.println("\nMethod 2: ");
		System.out.println("true -> "+s.method2("true"));
		System.out.println("zztruezz -> "+s.method2("zztruezz"));
		System.out.println("This is true -> "+s.method2("This is true"));
		System.out.println("true is this -> "+s.method2("true is this"));
		
		System.out.println("\nMethod 3: ");
		System.out.println("true -> "+s.method3("true"));
		System.out.println("tru -> "+s.method3("tru"));
		System.out.println("TRU -> "+s.method3("TRU"));
		System.out.println("ñtu -> "+s.method3("3tu"));
		
		System.out.println("\nMethod 4: ");
		System.out.println("true -> "+s.method4("true"));
		System.out.println("3ru -> "+s.method4("3ru"));
		
		System.out.println("\nMethod 5: ");
		System.out.println("ball -> "+s.method5("ball"));
		System.out.println("tribe -> "+s.method5("tribe"));
		System.out.println("true -> "+s.method5("true"));
		
		System.out.println("\nMethod 6: ");
		System.out.println("4250 -> "+s.method6("4250"));
		System.out.println("99 -> "+s.method6("99"));
		System.out.println("300 -> "+s.method6("300"));
		System.out.println("4000 -> "+s.method6("4000"));
		
		System.out.println("\nMethod 7: ");
		System.out.println("192.168.1.1 -> "+s.method6("192.168.1.1"));
		System.out.println("19216811 -> "+s.method6("19216811"));
		System.out.println("256.255.255.255 -> "+s.method6("256.255.255.255"));
		
		

	}

}
