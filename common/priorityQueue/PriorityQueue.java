package priorityQueue;

import advancedHeap.AdvancedHeap;

public class PriorityQueue<T> implements IPriorityQueue<T> {

	protected AdvancedHeap<PriorityElem<T>> Heap = new AdvancedHeap<PriorityElem<T>>(
			new PriorityComparator<PriorityElem<T>>());

	@Override
	public void pushWithPriority(T elem, int priority) {
		Heap.push(new PriorityElem<T>(elem, priority));
	}

	@Override
	public void updatePriority(T elem, int priority) {
		Heap.update(new PriorityElem<T>(elem, priority));
	}

	// public void updatePriority(int pos, int priority) {
	// }

	@Override
	public T pop() {
		return Heap.pop().elem;
	}

	@Override
	public boolean isEmpty() {
		return Heap.isEmpty();
	}

	@Override
	public int elemPos(T elem) {
		return Heap.elemPos(new PriorityElem<T>(elem, 0));
	}

}
