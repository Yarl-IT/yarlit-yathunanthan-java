import java.util.Scanner;
class MultiplicationTable{
	public static void main(String aargs[]){
		Scanner scan = new Scanner(System.in);
		int num=0;
		System.out.print("Enter a number:");
		num=scan.nextInt();
		for(int x=1;x<=10;x++){
			System.out.println(num+"x"+x+"="+(x*num));
		}
	}

}