package ccode;

import java.util.Scanner;

public class Ams {
	public static int count(int t) {
		
		int count=0;
		while(t!=0) {
			count++;
			t=t/10;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int n=num;
		int t=num;
		int res=0;
		
		while(n!=0) {
			int last=n%10;
			res=res+(int)Math.pow(last,count(t));
			n=n/10;
		}
		if(res==num) {
			System.out.println("amst");
		}
		else {
			System.out.println("not");
		}
		
	}
	

}
