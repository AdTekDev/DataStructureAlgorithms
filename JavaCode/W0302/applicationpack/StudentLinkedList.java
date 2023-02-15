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
}
