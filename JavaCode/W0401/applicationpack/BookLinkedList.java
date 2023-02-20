package applicationpack;

import linkedpack.SinglyLinkedList;

public class BookLinkedList extends SinglyLinkedList<Book> {
	
	public void showBookListWithTitle(String tt) {
		iNode<Book> current;
		
		current = this.head;
		while (current != null) {
			if (current.getElement().hasTieuDe(tt)) {
				System.out.println(current.getElement().toString());
			}
			current = current.getNext();
		}
	}
	
	public void showBookListWithAuthor(String tg) {
		iNode<Book> current;
		
		current = this.head;
		while (current != null) {
			if (current.getElement().hasTacGia(tg)) {
				System.out.println(current.getElement().toString());
			}
			current = current.getNext();
		}
	}
}
