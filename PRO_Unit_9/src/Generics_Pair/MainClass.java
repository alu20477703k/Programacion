package Generics_Pair;

public class MainClass {

	public static void main(String[] args) {

		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("Hello","World");

		System.out.format("Key p1: %s", p1.getKey());
		System.out.format("\nValue p1: %d ", p1.getValue());

		System.out.format("\nKey p2: %s\n", p2.getKey());
		System.out.format("Value p2: %s ", p2.getValue());

	}

}
