package linkedpack;


public class SinglyLinkedList<E> {
	
	protected static class iNode<E> {
		protected E element;
		protected iNode<E> next;
		
		public iNode(E element) {
			this.element = element;
		}
		
		public E getElement() {
			return element;
		}
		
		public iNode<E> getNext() {
			return next;
		}
	}
	protected iNode<E> head;
	protected int size;
	
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(E element) {
		iNode<E> newNode = new iNode<E>(element);
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
	}
	
	public E getFirst() {
		if (this.head == null) 
			return null;
		else 
			return this.head.element;
	}
	
	public void addLast(E element) {
		iNode<E> newNode = new iNode<E>(element);
		iNode<E> lastNode;
		
		if (this.head == null) {
			this.head = newNode;
		} else {
			lastNode = this.head;
			while (lastNode.next != null)
				lastNode = lastNode.next;
			lastNode.next = newNode;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public void showSinglyList() {
		iNode<E> currentNode;
		
		System.out.println("\n\n SHOW SinglyLinked List !!! ");
		currentNode = this.head;
		while( currentNode != null ) {
			System.out.println(currentNode.element);
			currentNode = currentNode.next;
		}
		
	}

	public void showObjectInSinglyList() {
		iNode<E> currentNode;
		
		System.out.println("\n\n SHOW List !!! ");
		currentNode = this.head;
		while( currentNode != null ) {
			System.out.println(currentNode.element.toString());
			currentNode = currentNode.next;
		}
		
	}
}
