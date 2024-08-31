package ccode;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no grater than 1");
		int num=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				//break;
			}
		}
		if(flag==1) {
			System.out.println("Not prime no");
		}
		else {
			System.out.println("prime no");
		}
	}
	
	

}
