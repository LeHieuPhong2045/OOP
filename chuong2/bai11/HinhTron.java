package chuong2.bai11;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh");
		double r = sc.nextDouble();
		double p = 2*Math.PI*r;
		double s = Math.PI*r*r;
		System.out.println("chu vi htron: " + p + "\ndien tich htron: " + s);
	}

}
