import java.util.Scanner;
class ShoppingBill{
	public static void main(String args []){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter item price :");
		double price=scan.nextDouble();
		
		System.out.print("Enter quantity:");
		int x=scan.nextInt();
		
		double  total=x*price;
		if(total>5000){
			total=total-(total*0.10);
			System.out.println("Discount applied(10%)");			
		}
		System.out.println("Total Bill Amount is :"+total);
	}
}