import java.util.Scanner;
public class SearchArry{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int[] arr={10,20,30,40,50};
		
		System.out.print("Enter the number to search:");
		int target=sc.nextInt();
		
		boolean found=false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				System.out.print("Element found at index:"+i);
				found=true;
				break;
			}
		}
		if(!found){
			System.out.print("Element not found in the array");
		}
	}
}