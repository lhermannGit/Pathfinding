package binaryHeap;

public interface Comparable<T> {
	
	public boolean lessThan(T elem);
	
	public boolean greaterThan(T elem);
	
	public boolean equalTo(T elem);

}
