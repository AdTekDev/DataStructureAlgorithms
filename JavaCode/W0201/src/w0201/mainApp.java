package w0201;

import arraylistpack.ArrayList;
import nodepack.Node;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo - Linear Data ADT");
		
		// Khởi tạo ArrayList, lúc này 0 có phần tử nào
		ArrayList<String> xlist = new ArrayList<String>();
		
		// Thêm vào 3 phần tử
		xlist.add("Sea Tinh");
		xlist.add("Quang Trung");
		xlist.add("Nguyen Hue");
		xlist.ShowList();
		
		// Thêm vào 3 phần tử nữa
		xlist.add("Sea Tinh 2");
		xlist.add("Quang Trung 2");
		xlist.add("Nguyen Hue 2");
		xlist.ShowList();
		
		// dùng Method get
		System.out.println("\n\n Element[8] = ");
		System.out.println(xlist.get(8));
		
		// dùng Method set
		String oldx = xlist.set(0, "Sea Tui");
		xlist.ShowList();
	}

} 
