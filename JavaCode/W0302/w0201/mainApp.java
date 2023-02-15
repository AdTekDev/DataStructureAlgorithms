package w0201;

import arraylistpack.ArrayList;
import applicationpack.Student;

import nodepack.Node;
import linkedpack.Stack;
import linkedpack.Queue;
import linkedpack.SinglyLinkedList;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo - Linear Data ADT");
		
		SinglyLinkedList<Student>  xlist = new SinglyLinkedList<Student>();
		
		xlist.addFirst(new Student("A Tu", 'M', 6.9));
		xlist.addFirst(new Student("A Ka", 'M', 3));
		xlist.addFirst(new Student("A Ma", 'F', 5));
		xlist.addFirst(new Student("A Pa", 'M', 6));
		xlist.addFirst(new Student("A Ty", 'F', 9));
		
		xlist.showObjectInSinglyList();
		
		
		
	}
	
	public void oldCode() {
		Stack<String> xStack;
		
		xStack = new Stack<String>();
		
		xStack.push("Toi");
		xStack.push("la");
		xStack.push("Toi 1");
		xStack.push("ai");
		xStack.push("la");
		xStack.push("Toi 2");
		
		xStack.showStack();
		
		// - Queue
		Queue<String> xQueue;
		
		xQueue = new Queue<String>();
		xQueue.offer("Sea Tinh");
		xQueue.offer("Sea Tinh 2");
		xQueue.offer("Sea Tinh 3");
		xQueue.offer("Sea Tinh 4");
		xQueue.offer("Sea Tinh 5");
		
		xQueue.showQueue();
		
		System.out.println("Thong tin cua Queue: ");
		System.out.println("Size= " + xQueue.size() );
		System.out.println("peek - head = " + xQueue.peek());
	}


} 
