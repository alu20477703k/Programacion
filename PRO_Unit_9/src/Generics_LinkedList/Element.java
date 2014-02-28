package Generics_LinkedList;

public class Element<T> {
	private T object;
	private Element<T> next;
	public Element(T newObject) {
		object=newObject;
		next = null;
	}
	public void setNext(Element<T> newNext) {
		next=newNext;
	}
	public Element<T> getNext() {
		return next;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T newObject) {
		object=newObject;
	}
	public void delete() {
		object=null;
		next=null;
	}
}
