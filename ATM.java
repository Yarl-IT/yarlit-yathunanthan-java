import java.util.Scanner;
class ATM{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int balance=10000;
		char choice;
		
		do{
			System.out.println("\n---ATM---");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			
			System.out.print("Choose option: ");
			int option=sc.nextInt();
			
			switch(option){
				case 1:
				System.out.println("Balace :"+balance);
				break;
				case 2:
				System.out.print("Enter deposit amount: ");
				int dep=sc.nextInt();
				balance +=dep;
				System.out.println("Update balance :"+balance);
				break;
				case 3:
				System.out.print("Enter withdrawal amount :");
				int wd=sc.nextInt();
				balance-=wd;
				System.out.println("Update balance :"+balance);
				break;
				default:
				System.out.println("Invalid option");
			}
			System.out.print("Do you want another option?(y/n):");
			choice=sc.next().charAt(0);
		System.out.println("");
		}while(choice=='y'||choice=='Y');
		System.out.println("Thank you Have a nice day");
	}
}