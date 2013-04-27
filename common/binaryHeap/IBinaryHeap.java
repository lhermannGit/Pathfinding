package binaryHeap;

public interface IBinaryHeap<T> {

	public void push(T elem); // T has to have equals method

	public T pop();

	public int elemPos(T elem);

	public boolean isEmpty();

}
