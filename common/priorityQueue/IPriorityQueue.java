package priorityQueue;

public interface IPriorityQueue<T> {

	public void pushWithPriority(T elem, int priority);

	public void updatePriority(T elem, int priority);

	// public void updatePriority(int pos, int priority); see BinaryHep comment
	// regarding search

	public T pop();

	public boolean isEmpty();

	public int elemPos(T elem);

}
