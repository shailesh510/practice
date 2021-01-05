package stringProgram;

import java.util.Scanner;

public class PrimeNumFromUser {

	public static void main(String[] args) {
		int i,j;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		j=sc.nextInt();
		for(i=2;i<1/2;i++)
		{
			if(j%i==0) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		if(!flag) {
			System.out.println(j+" is Not prime Number");
		}else {
			System.out.println(j+"is prime Number");
		}
	}

}
