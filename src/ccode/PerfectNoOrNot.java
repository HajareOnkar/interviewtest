package ccode;
import java.util.*;


public class PerfectNoOrNot {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		
		int n=num;
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("perfect no");
		}
		else {
			System.out.println("not perfect no");

		}
	}

}
