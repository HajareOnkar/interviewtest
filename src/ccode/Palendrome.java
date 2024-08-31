package ccode;
import java.util.*;


public class Palendrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		int n=num;
		int res=0;
		
		while(n!=0) {
			int last=n%10;
			res=(res*10)+last;
			
			n=n/10;
		}
		
		if(res==num) {
			System.out.println("palendrome");
		}
		else {
			System.out.println("not");
		}
	}

}
