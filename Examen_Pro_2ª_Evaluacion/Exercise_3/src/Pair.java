import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Pair<K, V> implements Comparable {

	private K elem1;
	private V elem2;

	public Pair(K elem1, V elem2) {

		this.elem1 = elem1;
		this.elem2 = elem2;

	}

	@Override
	public String toString() {
		return "(" + elem1 + "," + elem2 + ")";
	}

	@SuppressWarnings("unchecked")
	public String toSortedString() {

		List list = new ArrayList();

		list.add(elem1);
		list.add(elem2);

		Collections.sort(list);

		elem1 = (K) list.get(0);
		elem2 = (V) list.get(1);

		return "(" + elem1 + "," + elem2 + ")";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
