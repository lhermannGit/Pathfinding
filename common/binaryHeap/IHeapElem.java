package binaryHeap;

import util.Comparable;

public interface IHeapElem<T> extends Comparable<T> {

	public T getValue();

	public void changeValue(T elem);

	public void print();

}
