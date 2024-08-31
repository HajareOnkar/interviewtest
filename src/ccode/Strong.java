package ccode;

import java.util.Scanner;

public class Strong {
	
	public static int fact(int last) {
		int fact=1;
		while(last!=0) {
			fact=fact*last;
			last--;
		}
		
		return fact;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int n=num;
		int res=0;
		
		
		while(num!=0) {
			int last=num%10;
			res=res+fact(last);
			num=num/10;
			
		}
		if(res==n) {
			System.out.println("strong");
		}
		else {
			System.out.println("no");
		}
	}

}
