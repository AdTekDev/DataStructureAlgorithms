package applicationpack;

import java.time.Year;

import linkedpack.SinglyLinkedList;
import arraylistpack.ArrayList;

public class BookLinkedList extends SinglyLinkedList<Book> {
	
	public void showBookListWithTitle(String tt) {
		iNode<Book> current;
		
		System.out.println("\n\nshowBookListWithTitle");
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
		
		System.out.println("\n\nshowBookListWithAuthor");
		current = this.head;
		while (current != null) {
			if (current.getElement().hasTacGia(tg)) {
				System.out.println(current.getElement().toString());
			}
			current = current.getNext();
		}
	}
	
	public void showOldBookList(int sonam) {
		iNode<Book> current;
		int namHT = Year.now().getValue();
		
		System.out.println("\n\nshowOldBookList");
		current = this.head;
		while (current != null) {
			if (current.getElement().getNamXB() <= namHT - sonam) {
				System.out.println(current.getElement().toString());
			}
			current = current.getNext();
		}
	}
	
	public void showBooksAuthorList() {
		iNode<Book> current;

		String [] dstg = new String[this.size];
		int [] demsotp = new int[this.size];
		int sltg = 0;
		int i,vt;
		String tght;
		
		System.out.println("\n\nshowBooksAuthorList");
		current = this.head;
		while (current != null) {
			tght = current.getElement().getTenTG();
			vt = -1;
			i = 0;
			while (vt == -1 && i < sltg) {
				if (tght == dstg[i])
					vt = i;
				i++;
			}
			if (vt == -1)
			{
				dstg[sltg] = tght;
				demsotp[sltg] = 1;
				sltg++;
			} else {
				demsotp[vt]++;
			}
			current = current.getNext();
		}
		
		/// Xuat ket qua 
		for(i=0;i<sltg;i++) {
			System.out.println(dstg[i] + "  " + demsotp[i]);
		}
	}
	
	
}
