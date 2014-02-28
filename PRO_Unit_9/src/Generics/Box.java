package Generics;

public class Box<T> {
	
	private T t;
	
	public void set(T t){
		this.t = t;
		
	}
	public T get(){
		return t;
	}
	
	public static void main (String[] args){
		
		Box<Integer> integerBox;
		integerBox = new Box<Integer>();

		
	}

}
