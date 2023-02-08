package linkedpack;

public class Stack<E> {
	
	private static class iNode<E> {
		private E element;
		private iNode<E> previous;
		public iNode(E value) {
			element = value;
		}
	}
	private iNode<E> top;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	public void push(E element) {
		iNode<E> newTop = new iNode<E>(element);
		newTop.previous = this.top;
		this.top = newTop;
		this.size++;
	}
}
