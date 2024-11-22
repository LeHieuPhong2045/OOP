package chuong2.bai18;

import java.util.Scanner;

public class SoNguyenTo {
    public static boolean snt(int n) {
		if(n==1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		if(snt(n)) {
			System.out.println(n + " là số nguyên tố.");
        } 
		else {
            System.out.println(n + " không phải là số nguyên tố.");
		}
	}
}
