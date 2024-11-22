package chuong2.bai17;

public class TimSo {
    public static void main(String[] args) {
        System.out.println("cac so ba chu so thoa man la:");
        for(int i = 100; i<=999; i++) {
        	//tach so
        	int a = i / 100;       
            int b = (i / 10) % 10; 
            int c = i % 10; 
        	if((a*a*a + b*b*b + c*c*c) == i) {
        		System.out.println(i);
        	}
        }
    }
}
