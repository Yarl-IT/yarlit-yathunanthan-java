import java.util.Scanner;
public class LoginSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String username="admin";
		String password="1234";
		
		System.out.print("Enter user name: ");
		String u=sc.next();
		
		System.out.print("Enter password: ");
		String p=sc.next();
		
		if(u.equals(username)&&p.equals(password)){
			System.out.print("Login Successful");
		}else {
			System.out.print("Invalid Login");
		}
			
		
	}
}