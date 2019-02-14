package guma;

import java.util.Scanner;

public class Binarymultipy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st binary number: ");
		String x=sc.next();
		System.out.println("enter the 2nd binary number: ");
		String y=sc.next();
		
		int n1=Integer.parseInt(x,2);
		int n2=Integer.parseInt(y,2);
		int n3=n1 * n2;
		System.out.println("n1 :" +Integer.toBinaryString(n1));
		System.out.println("n2: " +Integer.toBinaryString(n2));
		System.out.println("n3=n1*n2:"+Integer.toBinaryString(n3));

	}

}
