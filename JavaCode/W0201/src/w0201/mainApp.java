package w0201;

import arraylistpack.ArrayList;
import nodepack.Node;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo - Linear Data ADT");
		
		// Khởi tạo ArrayList, lúc này 0 có phần tử nào
		ArrayList<String> xlist = new ArrayList<String>();
		xlist.add("Sea Tinh");
		xlist.add("Quang Trung");
		xlist.add("Nguyen Hue");
		xlist.ShowList();
		xlist.add("Sea Tinh 2");
		xlist.add("Quang Trung 2");
		xlist.add("Nguyen Hue 2");
		xlist.ShowList();
	}

} 
