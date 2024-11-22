package chuong3.bai5;

public class Test {
    public static void main(String[] args){
		Truong tr = new Truong("Nam Kim 2", "Nam Kim", "Viet");
		SinhVien sv = new SinhVien();
		sv.setTen("Nguyen The Vinh");
		sv.setTuoi(18);
		sv.setGioiTinh('N');
		sv.setLop("12C1");
		sv.setNganh("khoi a");
		sv.setTruong(tr);
		System.out.println(sv);
}
}
