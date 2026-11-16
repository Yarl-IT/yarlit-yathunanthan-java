import java.util.Scanner;
class ElectricityBill{
	public static void main(String aegs[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter electricity Bill:");
		double unit=scan.nextDouble();
		double x=0;
		double y=0;
		
		double total=0;
		
		if(unit>=90){
			total=(60*30.00)+(30*35)+(unit-90)*50;
			System.out.println("Your Bill :"+total);
		}else if((unit>=61)&&(unit<90)){
			y=(unit-60);
			total=y*35.00+(60*30);
			System.out.println("Your Bill :"+total);
		}else if((unit<60)&&(unit>=00)){
			total=x*30.00;
			System.out.println("Your Bill :"+total);
		}else{
			System.out.println("Invalid unit");
		}
		
		
		
		
	}
}