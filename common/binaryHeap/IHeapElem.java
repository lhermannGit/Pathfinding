package binaryHeap;

public interface IHeapElem<T> extends Comparable<T> {

	public T getValue();

	public void changeValue(T elem);

}
