package guma;
import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class BankAccount{
	private static final int PreviousTraction = 0;
	int Balance;
	int PreviousTransactions;
	String CustomerName;
	String CustomerID;
	BankAccount(String CName,String CID){
		CustomerName=CName;
		CustomerID=CID;
	}
	void deposit(int amount) {
		if(amount!=0) {
			Balance=Balance+amount;
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			Balance=Balance-amount;
			PreviousTransactions=-amount;
		}
	}
	void getPreviousTraction() {
		if(PreviousTraction > 0) {
			System.out.println("Deposited"+PreviousTraction);
			
		}
		else if(PreviousTraction<0) {
			System.out.println("withdraw: "+Math.abs(PreviousTraction));
		}
		else {
			System.out.println("no Transactions occured");
		}
	}
	void Showmenu() {
		char Option='\0';
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("welcome "+CustomerName);
		System.out.println("your ID "+CustomerID);
		System.out.println("\n");
		System.out.println("A,Check Balance");
		System.out.println("S,Deposit");
		System.out.println("C,withdraw");
		System.out.println("O,PreviousTraction");
		System.out.println("E,Exit");
		do 
		{
			System.out.println("=====================================================");
			System.out.println("Enter an Option");
			System.out.println("======================================================");
			Option=scanner.next().charAt(0);
			System.out.println("\n");
			switch(Option) {
			
			case 'A':
				System.out.println("==========================");
				System.out.println("Balance= "+Balance);
				System.out.println("---------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-----------------------------------");
				System.out.println("Enter the amount of deposit");
				System.out.println("-------------------------------------");
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("-----------------------------");
				System.out.println("Enter amount to withdraw");
				System.out.println("-----------------------------------");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("-----------------------------------");
				getPreviousTraction();
				System.out.println("-------------------------------------");
				System.out.println("\n");
				break;
			default:
				System.out.println("invalid Option!!. please enter again");
				break;
				
			
			}while(Option!='E') {
				System.out.println("Thank you for using our service");
			}
		}
		
	}
}
