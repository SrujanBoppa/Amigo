import java.io.IOException;
import java.util.Scanner;

public class SrujanATM {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		int balance =500000;
		int withdraw;
		int deposit;
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for withdraw");
			System.out.println("Choose 2 for deposit ");
			System.out.println("Choose 3 for Check Balance ");
			System.out.println("choose 4 customer helpline");
			System.out.println("Choose 5 for EXIT ");
			System.out.println("Choose the operation you want to perform ");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter money to be withdrawn : ");
			    withdraw =sc.nextInt();
			    
			    if(balance>=withdraw)
			    {
				  balance =balance-withdraw;
				  System.out.println("Please collect your money:"+balance);
				  Thread.sleep(5000);
				  System.out.println("Thank You");
			    }
			    else 
			    {
				    System.out.println("insufficient Balance");
			    }
			    System.out.println(" ");
			    break;
			case 2:
				System.out.println("Enter money to be deposited: ");
				deposit =sc.nextInt();
				balance =balance+deposit;
				System.out.println("Your Money has been successfully deposited :"+balance);
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Balance :"+balance);
				System.out.println(" ");
				break;
			case 4:
				String url_open ="https://sbi.co.in/web/customer-care/customer-care";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
				System.out.println("");
				break;
			case 5:
				System.out.println("THANK YOU");
				System.exit(0);
				
			}
		}
	}

}
