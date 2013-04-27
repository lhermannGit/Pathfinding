package priorityQueue;

import util.Comparable;

public class PriorityElem<T> implements Comparable<PriorityElem<T>> {

	public T elem;
	public int priority;

	public PriorityElem(T elem, int priority) {
		this.elem = elem;
		this.priority = priority;
	}

	@Override
	public boolean equals(Object elem) {
		return (this.elem == ((PriorityElem<T>) elem).elem);
	}

	@Override
	public boolean lessThan(PriorityElem<T> elem) {
		return (this.priority < elem.priority);
	}

	@Override
	public boolean greaterThan(PriorityElem<T> elem) {
		return (this.priority > elem.priority);
	}

	@Override
	public boolean equalTo(PriorityElem<T> elem) {
		return (this.priority == elem.priority);
	}

}
