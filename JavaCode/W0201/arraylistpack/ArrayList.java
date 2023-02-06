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
	
	public E get(int index) {
		if (checkIndex(index))
			return this.getElement(index);
		else
			return null;
	}
	
	public E set(int index, E newValue) {
		if (index >= 0 && index <= size) {
			E oldvalue = (E) this.elements[index];
			//...
			this.elements[index] = newValue;
			return oldvalue;
		} else 
			return null;
	}
	
	private boolean checkIndex(int index) {
		if (index >= 0 && index <= size) {
			return true;
		} else 
			return false;
	}
	
	private E getElement(int index) {
		return (E) this.elements[index];
	}
	
	public void ShowList() {
		System.out.println("\n\nDanh sach phan tu: " + size);
		for(int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}
	}
}
