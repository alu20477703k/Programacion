package LinkedList;
public class Stack {

	private LinkedList li;
	
	public Stack(){
		li = new LinkedList();  
	}
	
	public void push(Object ob){
		li.insertFirst(ob);
	}
	public Object pop() throws EmptyListException{
		return li.getLastObject();
		
	}
	public boolean isEmpty(){
		return li.isEmpty();
	}
	public void empty(Object ob) throws EmptyListException, ObjectNotFoundException{
		li.remove(ob);;
	}

	public void print(){
		
	}

}
