package priorityQueue;

import util.Comparable;
import util.Comparator;

public class PriorityComparator<T extends Comparable<T>> implements
		Comparator<T> {

	@Override
	public boolean compare(T elem1, T elem2) {
		return (elem1.lessThan(elem2));
	}
}
