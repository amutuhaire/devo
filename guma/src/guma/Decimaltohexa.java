package guma;
import java.util.Scanner

public class Decimaltohexa {
	
	public DecimalToHexa() {
		Scanner user_input=new Scanner(System.in);
		int decimal,reminder;
		Char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexaValue="";
		System.out.println("enter any number:");
		decimal=user_input.nextInt();
		while(decimal>0) {
			reminder=decimal%16;
			hexaValue=hexa[reminder]+hexaValue;
			decimal=decimal/16;
		}
		System.out.println("Hexa value is :"+hexaValue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalToHexa obj=new DecimalToHexa();
		
		

	}
	

}
