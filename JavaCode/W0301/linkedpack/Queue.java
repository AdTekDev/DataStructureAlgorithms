package linkedpack;


public class Queue<E> {
	private static class iNode<E> {
		private E element;
		private iNode<E> next;
		
		public iNode(E element) {
			this.element = element;
		}
	}
	private iNode<E> head;
	private int size;
	
	public Queue() {
		head = null;
		size = 0;
	}
	
	public void offer(E element) {
		iNode<E> newNode = new iNode<E>(element);
		
		if (this.head == null) {
			this.head = newNode;
		} else {
			iNode<E> tail = this.head;
			while(tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
		}
		this.size++;
	}
	
	public int size() {
		return this.size;
	}
	
	public E peek() {
		if (this.head != null)
			return this.head.element;
		else 
			return null;
	}
	
	public boolean isEmpty() {
		return (this.size <= 0);
	}
	
	public void showQueue() {
		iNode<E> currentNode;
		
		System.out.println("\n\n SHOW Queue !!! ");
		currentNode = this.head;
		while( currentNode != null ) {
			System.out.println(currentNode.element);
			currentNode = currentNode.next;
		}
		
	}
}
