package Generics_Stack_Queue;
public class LinkedList<T> {
	
	private Element<T> first;
	private Element<T> last;

	public LinkedList() {
		first = null;
		last = null;
	}
	public void insertFirst(T obj) {
		Element<T> element = new Element<T>(obj);
		element.setNext(first);
		first = element;
		if (last == null) 
			last = element;
	}
	public void insertLast(T obj) {
		Element<T> element = new Element<T>(obj);
		element.setNext(null);
		if (last!=null)
			last.setNext(element);
		last= element;
		if (first == null) 
			first = element;
	}
	public void print() {
		Element<T> e = first;
		while (e!=null) {
			System.out.println(e.getObject());
			e = e.getNext();
		}
	}
	public boolean isEmpty() {
		if (first==null)
			return true;
		else 
			return false;
	}
	public void remove(Object obj) throws ObjectNotFoundException, EmptyListException {
		Element<T> previous = first;
		Element<T> e = first;
		
		if (first==null) {
			throw new EmptyListException();
		}
		while ((e!=null) && e.getObject()!=obj) {
			previous=e;
			e=e.getNext();
		}
		if (e==null) {
			throw new ObjectNotFoundException(); 
		}
		if (first==last) {
			first = null;
			last = null;
		} else {
			if (first==e) {
				first = e.getNext();
			}
			if (last==e) {
				last=previous;
			}
			previous.setNext(e.getNext());
		}
		e.delete();
	}
	public Object getLastObject() throws EmptyListException {
		if (first==null) 
			throw new EmptyListException();
		return last.getObject();
	}
	public Object getFirstObject() throws EmptyListException {
		if (first==null) 
			throw new EmptyListException();
		return last.getObject();
	}
	public Object getObjectAtPosition(int i) throws EmptyListException, 
												InvalidIndexException {
		if (first==null) {
			throw new EmptyListException();
		}
		Element<T> e=first;
		int cont=0;
		while ((e!=null) && (cont<i)) {
			e=e.getNext();
			cont++;
		}
		if ((cont==i) && (e!=null)) {
			return e.getObject();
		} else {
			throw new InvalidIndexException();
		}
	}
	public int getNumElements() {
		Element<T> e = first;
		int cont = 0;
		while (e!=null) {
			e=e.getNext();
			cont++;
		}
		return cont;
	}
	
}
