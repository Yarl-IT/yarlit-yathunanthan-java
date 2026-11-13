import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double x=0;
		double y=0;
		int opition=0;
		double result=0;
		System.out.print("Enter first number:");
		x=sc.nextDouble();
		
		System.out.print("Enter Second number:");
		y=sc.nextDouble();
		System.out.println(" ");
		System.out.println("Choise Operation:");
		System.out.println("1: Addition(+)");
		System.out.println("2: Subtraction(-)");
		System.out.println("3: Multiplication(*)");
		System.out.println("4: Division(/)");
		
		System.out.print("Enter Your choise:");
		opition=sc.nextInt();
		
		switch(opition){
			case 1:
			System.out.println("Result ="+(x+y));
			break;
			case 2:
			System.out.println("Result ="+(x-y));
			break;
			case 3:
			System.out.println("Result ="+(x*y));
			break;
			case 4:
			System.out.println("Result ="+(x/y));
			break;
			default:
			System.out.println("Invalid operation");
		}
		
		
		
		

	}
	
}