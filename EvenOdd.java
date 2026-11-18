import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num=0;
		System.out.print("Enter a number:");
		num=scan.nextInt();
		if((num%2)==0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Odd");
		}
	}
}