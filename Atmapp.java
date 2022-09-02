import java.util.Scanner;
public class Atmapp 
{
    public static void main(String[]args)
    {
	     long amount = 500;
    	
    	Scanner scanner =  new Scanner(System.in);
	    System.out.println("Enter the name : ");
	    String Name =  scanner.nextLine();
	    System.out.println("Enter the password : ");
	    int Password =  scanner.nextInt();
	    
	    System.out.println("************Welcome to our bank***************");
	    System.out.println();
	    System.out.println("Press 1 --> Check the balance");
	    System.out.println("Press 2 --> Cash Withdraw");
	    System.out.println("Press 3 --> Cash Deposit");
	    System.out.println("Press 4 --> Exit");
	    System.out.println();
	    
	    
	    while(true)
	    {
	    	System.out.println("Enter the number = ");
	    	int number =  scanner.nextInt();
	    	
	    	if(number == 1)
	    	{
	    		System.out.println();
	    		System.out.println("Your balance is : "+ amount);
	    		System.out.println();    		
	    	}
	    	else if(number ==2)
	    	{
	    		System.out.println("Enter the amount you want to withdraw : ");
	    	    int cash_withdraw = scanner.nextInt();
	    	    if(cash_withdraw<=amount)
	    	    {
	    	    	amount =  amount-cash_withdraw;
	    	    	System.out.println("************************************");
	    	    	System.out.println("Cash withdraw successfully..........");
	    	        System.out.println("************************************");
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Balance is insufficient in your account");
	    	    	System.out.println();
	    	    }
	    	
	    	}
	    	else if(number ==3)
	    	{
	    		System.out.println("Enter the amout you want to deposit in bank : ");
	    		System.out.println();
	    		int cash_deposit = scanner.nextInt();
	    		amount =  amount +  cash_deposit;
	    		System.out.println("*****cash successfully deposited*****");
	    		System.out.println();
	    	}		
	    	else if(number ==4)
	    	{
	    		System.out.println("Thank You For Visiting in Our bank");
	    	    break;
	    	
	    	
	    	
	    	}
	    	
	    	
	    	
	    }
    
    
    
    
    
    
    }
}
