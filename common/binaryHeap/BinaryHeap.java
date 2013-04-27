package binaryHeap;

import java.util.Vector;

import util.Comparable;
import util.Comparator;

// might want to use IHeapElem instead of Comparable. Check visibility for decision

public class BinaryHeap<T extends Comparable<T>> implements IBinaryHeap<T> {

	protected Vector<T> Heap = new Vector<T>();
	protected Comparator<T> cmp = null;

	// protected lastModified = -1; monitor time complexity of linear indexOf()
	// function.
	// Linear search vs depth first search vs data mapping
	// keep data integrity in mind

	public BinaryHeap(Comparator<T> cmp) {
		this.cmp = cmp;
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
		for (int i = 0; i < Heap.size(); i++) {
			if (Heap.elementAt(i).equals(elem))
				return i;
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return Heap.isEmpty();
	}

	protected void heapifyUp(int pos) {

		while (pos > 0) {
			int newpos = (int) Math.floor((pos - 1) / 2);
			if (cmp.compare(Heap.elementAt(pos), Heap.elementAt(newpos))) {
				T temp = Heap.elementAt(pos);
				Heap.setElementAt(Heap.elementAt(newpos), pos);
				Heap.setElementAt(temp, newpos);
				pos = newpos;
			} else {
				return;
			}
		}
	}

	protected void heapifyDown(int pos) {
		int tpos;
		while (true) {
			tpos = pos;
			if (2 * pos + 2 <= Heap.size() - 1) {
				if (cmp.compare(Heap.elementAt(2 * pos + 1),
						Heap.elementAt(pos)))
					tpos = 2 * pos + 1;
				if (cmp.compare(Heap.elementAt(2 * pos + 2),
						Heap.elementAt(tpos)))
					tpos = 2 * pos + 2;
			} else if (2 * pos + 1 <= Heap.size() - 1) {
				if (cmp.compare(Heap.elementAt(2 * pos + 1),
						Heap.elementAt(pos)))
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

	// public void print() {
	// for (int i = 0; i < Heap.size(); i++)
	// Heap.elementAt(i).print();
	// }

}
