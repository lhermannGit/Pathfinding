package priorityQueue;

import binaryHeap.BinaryHeap;

public class PriorityQueue<T> implements IPriorityQueue<T> {
	
	BinaryHeap<PriorityElem<T>> Heap = new BinaryHeap<PriorityElem<T>>();
	
	@Override
	public void pushWithPriority(T elem, int priority) {
		Heap.push(new PriorityElem<T>(elem, priority));		
	}

	@Override
	public void updatePriority(T elem, int priority) {
		// implement changeElem in binaryHeap		
	}

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
		return Heap.elemPos(new PriorityElem<T>(elem,0));
	}

	
}
