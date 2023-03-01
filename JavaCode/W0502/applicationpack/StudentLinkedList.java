package applicationpack;

import linkedpack.SinglyLinkedList;


public class StudentLinkedList extends SinglyLinkedList<Student> {
	public void showStudentListHighGPA(double minGPA) {
		iNode<Student> currentnode;
		currentnode = head;
		while (currentnode != null) {
			if (currentnode.getElement().getDTB() > minGPA) {
				System.out.println(currentnode.getElement().toString());
			}
			currentnode = currentnode.getNext();
		}
	}
	
	public void showStudentNuHocGioi() {
		iNode<Student> currentnode;
		currentnode = head;
		while (currentnode != null) {
			if (currentnode.getElement().getDTB() >= 8
					&& currentnode.getElement().getGioiTinh() == 'F' ) {
				System.out.println(currentnode.getElement().toString());
			}
			currentnode = currentnode.getNext();
		}
	}
	
	
	public void addStudentOrderedByName(Student std) {
		iNode<Student> newnode = new iNode<Student>(std);
		
		if (this.size <= 0) {
			this.head = newnode;
		} else {
			String tensv = newnode.getElement().getHoTen();
			if ( tensv.compareTo(this.head.getElement().getHoTen()) < 0 ) {
				newnode.setNext(this.head);
				this.head = newnode;
			} else {
				iNode<Student> currentnode;
				currentnode = this.head;
				while (currentnode.getNext() != null 
						&& 
						tensv.compareTo(currentnode.getNext().getElement().getHoTen()) > 0 ) {
					currentnode = currentnode.getNext();
				}
				newnode.setNext(currentnode.getNext());
				currentnode.setNext(newnode);
			}
		}
		this.size++;	
		
	}
	
	
	
}
