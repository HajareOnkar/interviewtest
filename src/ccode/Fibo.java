package ccode;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<=num;i++) {
			c=a+b;
			
			if(c<num) {
				a=b;
				b=c;
				System.out.println(c);
				
			}
		}
	}

}
