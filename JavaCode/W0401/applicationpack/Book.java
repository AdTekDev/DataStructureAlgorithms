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
	
	public String getTenSach() {
		return TenSach;
	}
	
	public int getGia() {
		return Gia;
	}
	
	public void setGia(int newGia) {
		Gia = newGia;
	}
	
	@Override
	public String toString() {
		return  ID + ". " + TenSach + ". " + cacTacGia + ". " + Gia;
	}
}
