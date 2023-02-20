package w0201;

import arraylistpack.ArrayList;
import applicationpack.Student;

import nodepack.Node;
import linkedpack.Stack;
import linkedpack.Queue;
import linkedpack.SinglyLinkedList;
import applicationpack.StudentLinkedList;



import applicationpack.Book;
import applicationpack.BookLinkedList;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo - Linear Data ADT");
		
		BookLinkedList listbook = new BookLinkedList();
		
		
		listbook.addFirst(new Book("1", "Ai biet", "Vo Danh", 2000));
		listbook.addFirst(new Book("2", "Who biet", "Vo Tuong", 300));
		listbook.addFirst(new Book("3", "Ta biet", "Ko Danh", 500));
		listbook.addFirst(new Book("4", "Mi biet", "Ko Tuong", 2700));
		listbook.addFirst(new Book("5", "Tau biet", "Vo Vo", 8000));
		
		
		listbook.showObjectInSinglyList();
		
		listbook.showBookListWithAuthor("Tuong");
		
		
		
		
	}
	
	
	public void oldCode() {
		StudentLinkedList  xlist = new StudentLinkedList();
		
		xlist.addStudentOrderedByName(new Student("A Tu", 'M', 6.9));
		xlist.addStudentOrderedByName(new Student("A Ka", 'M', 3));
		xlist.addStudentOrderedByName(new Student("A Ma", 'F', 5));
		xlist.addStudentOrderedByName(new Student("A Pa", 'M', 6));
		xlist.addStudentOrderedByName(new Student("A Ty", 'F', 9));
		
		xlist.showObjectInSinglyList();
		
		System.out.println("... in ds sv > 5");
		xlist.showStudentListHighGPA(5);
		
		xlist.showStudentNuHocGioi();
	}

} 
