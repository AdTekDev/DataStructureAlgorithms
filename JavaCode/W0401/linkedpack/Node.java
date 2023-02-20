package linkedpack;

public class Node<E> {
	private E element;
	private Node<E> next;
	private Node<E> previous;
	
	
	public Node(E value) {
		this.element = value;
		this.next = null;
		this.previous = null;
	}
}
