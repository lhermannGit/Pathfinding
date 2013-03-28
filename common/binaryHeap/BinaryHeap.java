package binaryHeap;

import java.util.Vector;

public class BinaryHeap<T extends IHeapElem<T>> implements IBinaryHeap<T> {

	Vector<T> Heap = new Vector<T>();

	public BinaryHeap() {
	}

	@Override
	public void push(T elem) {
		Heap.addElement(elem);
		heapifyUp(Heap.size() - 1);
	}

	@Override
	public T pop() {
		T result = Heap.firstElement();
		Heap.set(0, Heap.lastElement());
		Heap.remove(Heap.size() - 1);
		heapifyDown(0);

		return result;
	}

	@Override
	public int elemPos(T elem) {
		return Heap.indexOf(elem);
	}

	@Override
	public boolean isEmpty() {
		return Heap.isEmpty();
	}

	private void heapifyUp(int pos) {

		while (pos > 0) {
			int newpos = (int) Math.floor((pos - 1) / 2);
			if (Heap.elementAt(pos).lessThan(Heap.elementAt(newpos))) {
				T temp = Heap.elementAt(pos);
				Heap.setElementAt(Heap.elementAt(newpos), pos);
				Heap.setElementAt(temp, newpos);
				newpos = pos;
			} else
				return;

		}
	}

	private void heapifyDown(int pos) {
		int tpos;
		while (true) {
			tpos = pos;
			if (2 * pos + 1 <= Heap.size()) {
				if (Heap.elementAt(pos).greaterThan(Heap.elementAt(2 * pos)))
					tpos = 2 * pos;
				if (Heap.elementAt(tpos).greaterThan(Heap.elementAt(2 * pos + 1)))
					tpos = 2 * pos + 1;
			} else if (2 * pos <= Heap.size()) {
				if (Heap.elementAt(pos).greaterThan(Heap.elementAt(2 * pos)))
					tpos = 2 * pos;
			}

			if (pos != tpos) {
				T temp = Heap.elementAt(pos);
				Heap.setElementAt(Heap.elementAt(tpos), pos);
				Heap.setElementAt(temp, tpos);
			} else
				return;
		}

	}
}
