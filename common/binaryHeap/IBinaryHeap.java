package binaryHeap;

public interface IBinaryHeap<T> {
	
	
	public void push(T elem);
	
	public T pop();
	
	public boolean isElem(T elem);
	
	public boolean isEmpty();
	

}
