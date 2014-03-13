package Counter;

class Counter {
	
	private int c=0;
	public void increment(){
		System.out.println(c);
		c++;
	}
	public void decrement(){
		c--;
	}
	public int value(){
		return c;
	}

}
