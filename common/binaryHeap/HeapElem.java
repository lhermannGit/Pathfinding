package binaryHeap;

public abstract class HeapElem<T> {
	
	protected T elem;
	
	public HeapElem(T elem) {
		this.elem = elem;
	}

	public T getValue(){
		return this.elem;
	}

	public void changeValue(T elem){
		
	}

}
