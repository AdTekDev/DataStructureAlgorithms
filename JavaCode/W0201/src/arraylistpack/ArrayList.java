package arraylistpack;

import java.util.List;

public class ArrayList<E>  // implements List<E> 
{
	private static final int DEFAULT_CAPACITY = 4;
	private Object[]  elements;
	
	private int size;
	
	public ArrayList() {
		this.elements = new Object[DEFAULT_CAPACITY];
	}
	
	public boolean add(E element) {
		if (this.size == this.elements.length) {
			// Expend ... Elements Capacity 
			// this.elements = grow();
			return false;
		}
		// else 
		this.elements[this.size++] = element;
		return true;	
	}
	
	public void ShowList() {
		System.out.println("\n\nDanh sach phan tu: " + size);
		for(int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}
	}
}
