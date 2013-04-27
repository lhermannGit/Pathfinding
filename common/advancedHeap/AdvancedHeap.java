package advancedHeap;

import util.Comparable;
import util.Comparator;
import binaryHeap.BinaryHeap;

// AdvancedHeap used to incorporate an update function a normal Heap does not need.
// Element T is supposed to have the inherited equals method overridden to supply a comparison for the udate function
public class AdvancedHeap<T extends Comparable<T>> extends BinaryHeap<T>
		implements IAdvancedHeap<T> {

	public AdvancedHeap(Comparator<T> cmp) {
		super(cmp);
	}

	// indexOf does not return through T's equals method
	@Override
	public void update(T elem) {
		int index = elemPos(elem);
		if (index > 0) {
			Heap.setElementAt(elem, index);
			heapifyUp(index);
			heapifyDown(index);
		}
	}

	@Override
	public void updateLesser(T elem) {
		int index = elemPos(elem);
		if (index > 0)
			if (elem.lessThan(Heap.elementAt(index)))
				Heap.setElementAt(elem, index);
	}

	@Override
	public void updateGreater(T elem) {
		int index = elemPos(elem);
		if (index > 0)
			if (elem.greaterThan(Heap.elementAt(index)))
				Heap.setElementAt(elem, index);
	}

}
