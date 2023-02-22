package applicationpack;

public class Student {
	private String  HoTen;
	private char  GioiTinh;
	private double DTB;
	
	public Student() {
		HoTen = null;
		GioiTinh = 0;
		DTB = -1;
	}
	
	public Student(String hoten) {
		HoTen = hoten;
		GioiTinh = 0;
		DTB = -1;
	}
	
	public Student(String hoten, char gioitinh, double dtb) {
		HoTen = hoten;
		GioiTinh = gioitinh;
		DTB = dtb;
	}
	
	public double getDTB() {
		return DTB;
	}
	
	public String getHoTen() {
		return HoTen;
	}
	
	@Override
	public String toString() {
		return  HoTen + " " + GioiTinh + " " + DTB;
	}
	
	public char getGioiTinh()
	{
		return GioiTinh;
	}
}
