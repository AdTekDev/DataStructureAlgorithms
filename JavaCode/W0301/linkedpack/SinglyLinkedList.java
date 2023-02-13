package linkedpack;


public class SinglyLinkedList<E> {
	
	private static class iNode<E> {
		private E element;
		private iNode<E> next;
		
		public iNode(E element) {
			this.element = element;
		}
	}
	private iNode<E> head;
	private int size;
	
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
	
	public void showSinglyList() {
		iNode<E> currentNode;
		
		System.out.println("\n\n SHOW SinglyLinked List !!! ");
		currentNode = this.head;
		while( currentNode != null ) {
			System.out.println(currentNode.element);
			currentNode = currentNode.next;
		}
		
	}

}
