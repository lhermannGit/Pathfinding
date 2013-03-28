package binaryHeap;

public interface IBinaryHeap<T> {

	public void push(T elem);

	public T pop();

	public int elemPos(T elem);

	public boolean isEmpty();

}
