package chuong2.bai24;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so sv n: "); int n = sc.nextInt();
		System.out.println("nhap diem sv (0-100): "); 
		int []a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "]=");
			a[i]=sc.nextInt();
		}
		System.out.println("diem sv: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n nhap diem can tim:");
		int diem = sc.nextInt();
        boolean found=false;
		for(int i = 0; i<n; i++) {
			if(a[i] == diem) {
				System.out.println("sinh vien thu: "+ (i+1));
                found=true;
			}
		}
        if(!found ){
            System.out.println("khong tim thay diem can tim");
        }
	}

}
