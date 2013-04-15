package binaryHeap;

import java.util.Vector;
import util.Comparable;

// might want to use IHeapElem instead of Comparable. Check visibility for decision

public class BinaryHeap<T extends Comparable<T>> implements IBinaryHeap<T> {

	Vector<T> Heap = new Vector<T>();

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
				pos = newpos;
			} else
				return;

		}
	}

	private void heapifyDown(int pos) {
		int tpos;
		while (true) {
			tpos = pos;
			if (2 * pos + 2 <= Heap.size() - 1) {
				if (Heap.elementAt(pos).greaterThan(Heap.elementAt(2 * pos + 1)))
					tpos = 2 * pos + 1;
				if (Heap.elementAt(tpos).greaterThan(Heap.elementAt(2 * pos + 2)))
					tpos = 2 * pos + 2;
			} else if (2 * pos + 1 <= Heap.size() - 1) {
				if (Heap.elementAt(pos).greaterThan(Heap.elementAt(2 * pos + 1)))
					tpos = 2 * pos + 1;
			}
			if (pos != tpos) {
				T temp = Heap.elementAt(pos);
				Heap.setElementAt(Heap.elementAt(tpos), pos);
				Heap.setElementAt(temp, tpos);
			} else
				return;
		}
	}

//	public void print() {
//		for (int i = 0; i < Heap.size(); i++)
//			Heap.elementAt(i).print();
//	}
	
}
