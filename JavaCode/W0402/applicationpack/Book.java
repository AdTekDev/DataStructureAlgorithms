package applicationpack;

public class Book {
	private String ID;
	private String ISBN;
	private String TenSach;
	private String cacTacGia;
	private String NXB;
	private int NamXB;
	private int Gia;
	private String Loai;
	
	public Book(String id, String tensach, String tg, int gia) {
		ID = id;
		TenSach = tensach;
		cacTacGia = tg;
		Gia = gia;
		ISBN="-";
		NXB = "-";
		NamXB = -1;
		Loai = "-";
	}
	
	public Book(String id, String tensach, String tg, int gia, int namxb) {
		ID = id;
		TenSach = tensach;
		cacTacGia = tg;
		Gia = gia;
		ISBN="-";
		NXB = "-";
		NamXB = namxb;
		Loai = "-";
	}
	
	public String getTenSach() {
		return TenSach;
	}
	
	public String getTenTG() {
		return cacTacGia;
	}
	
	public int getGia() {
		return Gia;
	}
	
	public void setGia(int newGia) {
		Gia = newGia;
	}
	
	public int getNamXB() {
		return NamXB;
	}
	
	public void setNamXB(int newNam) {
		NamXB = newNam;
	}
	
	@Override
	public String toString() {
		return  ID + ". " + TenSach + ". " + cacTacGia  + ". "  + NamXB + ". " + Gia;
	}
	
	public boolean hasTacGia(String tg) {
		return cacTacGia.contains(tg);
	}
	
	public boolean hasTieuDe(String td) {
		return TenSach.contains(td);
	}
}
