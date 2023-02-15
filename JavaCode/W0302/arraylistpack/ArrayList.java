package arraylistpack;

import java.util.List;

public class ArrayList<E>  // implements List<E> 
{
	private static final int DEFAULT_CAPACITY = 8;
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
		if (checkIndex(index)) {
			E oldvalue = (E) this.elements[index];
			//...
			this.elements[index] = newValue;
			return oldvalue;
		} else 
			return null;
	}
	
	public E remove(int index) {
		if (checkIndex(index)) {
			E oldElement = (E) this.elements[index];
			this.elements[index] = null;
			shift(index);
			this.size--;
			return oldElement;
		} else 
			return null;
	}
	
	public int indexOf(E element) {
		int vtri = -1;
		int i = 0;
		
		while (i < this.size  && vtri==-1) {
			if (this.elements[i] == element) {
				vtri = i;
			}
			i++;
		}
		return vtri;
	}
	
	
	
	public int numberOf(E element) {
		int solan =  0;
		int i = 0;
		
		for (i=0; i < this.size; i++) {
			if (this.elements[i] == element) {
				solan++;
			}
		}
		return solan;
	}
	
	public int getMaxFreqElement() {
		E xValue = null;
		int xSoLan = 0;
		int i,j;
		
		for(i=0; i< this.size; i++) {
			int htSoLan = 0;
			for(j=i;j<this.size;j++) {
				if (this.elements[i] == this.elements[j])
					htSoLan++;
			}
			if (htSoLan > xSoLan) {
				xValue = (E) this.elements[i];
				xSoLan = htSoLan;
			}
		}
		return xSoLan;
	}
	
	private void shift(int index) {
		for(int i=index; i<this.size-1; i++) {
			this.elements[i] = this.elements[i+1];
		}
	}
	
	private boolean checkIndex(int index) {
		if (index >= 0 && index < size) {
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
