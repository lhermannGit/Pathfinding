package advancedHeap;

public interface IAdvancedHeap<T> {
	
	public void update(T elem);
	
	public void updateLesser(T elem);
	
	public void updateGreater(T elem);
}
