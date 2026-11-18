import java.util.Scanner;
class ElectricityBill{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter electricity units: ");
		int unit=scan.nextInt();
		
		
		int amount;
		
		if(unit>=90){
			amount=(60*30)+(30*35)+(unit-90)*50;
			System.out.println("Electricity Bill Amount is :RS."+amount);
		}else if((unit>=61)&&(unit<90)){
			amount=(60*30)+(unit-60)*35;
			System.out.println("Electricity Bill Amount is :RS."+amount);
		}else if((unit<=60)&&(unit>=00)){
			amount=unit*30;
			System.out.println("Electricity Bill Amount is :RS."+amount);
		}else{
			System.out.println("Invalid unit");
		}
		
	}
}