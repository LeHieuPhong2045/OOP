package chuong3.bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		BenhNhan[] arr = new BenhNhan[n];
		for(int i=0; i<n; i++) {
            BenhVien bv=new BenhVien();
            bv.input();
			arr[i] = new BenhNhan(bv,"","","",0,"");
			arr[i].input();
		}
		for(BenhNhan b:arr) {
			System.out.println(b.toString());
		}
	}
}
