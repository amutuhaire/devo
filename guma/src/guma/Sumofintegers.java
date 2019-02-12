package guma;
import java.util.Scanner;

public class Sumofintegers {
	private static Scanner in =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =in.nextInt();
		int sum = 0;
		while(input>0) {
			int add=input%10;
			sum=sum+add;
			input=input/10;
			 
		}
		System.out.println(sum);
		

	}

}
