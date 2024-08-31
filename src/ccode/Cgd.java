package ccode;

import java.util.Scanner;

public class Cgd {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		while(a!=b) {
			if(a==0) {
				System.out.println(b);
				break;
			}
			if(b==0) {
				System.out.println(a);
				break;
				
			}
			if(a<b) {
				b=b-a;
			}
			if(a>b) {
				a=a-b;
				
			}
		}
		if(a==b) {
			System.out.println(a);
		}
		
		
	}

}
