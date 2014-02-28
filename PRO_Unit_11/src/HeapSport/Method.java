package HeapSport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Method<E> {

	public static void main(String[] args) {
		Collection<Integer> coll = new HashSet<Integer>();
		
		coll.add(2);
		coll.add(3);
		coll.add(24);
		coll.add(7);
		coll.add(9);
		
		System.out.println(heapSort(coll));

	}

	public static <E> List<E> heapSort(Collection<E> c) {

		Queue<E> queue = new PriorityQueue<E>(c);
		List<E> result = new ArrayList<E>();

		while (!queue.isEmpty())
			result.add(queue.remove());
		return result;

	}
}
