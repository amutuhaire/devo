package guma;
import java.util.Scanner;
public class Exampleovme {
	static Scanner console=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String secondName;
		int Age;
		double weight;
		System.out.println("enter the firstName"+"Age', and weight seperated"+"by space");
		firstName=console.next();
		secondName=console.next();
		Age=console.nextInt();
		weight=console.nextDouble();
		System.out.println("Name:"+ firstName + " " +secondName);
		System.out.println("Age:"+Age);
		System.out.println("weight:"+ weight);

	}

}
