package chuong3.bai3;

public class Test {
    public static void main(String[] agrs) {
		DiaChi dc = new DiaChi("Nha Huou", "Nam Kim", "Nam Dan", "Nghe An");
		System.out.println(dc);
		NhanVien nv = new NhanVien("Thanh Tin", dc, "10/4/2005", 'M');
		System.out.println(nv);	
}
}
