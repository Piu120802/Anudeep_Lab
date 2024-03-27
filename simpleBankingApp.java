package Anudipp;
	import java.util.Scanner;
	class BankAccount 
	{
	    private double balance;
	    public BankAccount(double initialBalance) 
	{
	       		 this.balance = initialBalance;
	   	 }
	    public void deposit(double amount) 
	{
	       		 if (amount > 0) 
	{
	      	   	   	balance += amount;
	        			 System.out.println("Deposit successful. Current balance: " + balance);
	   		} 
	else 
	{
	           			 System.out.println("Invalid deposit amount.");
	       		 }
	 	   }
	    public void withdraw(double amount)
	 {
	        		if (amount <= 0) 
	{
	           			 System.out.println("Invalid withdrawal amount.");
	            			  return;
	        		}
	        		if (balance >= amount) 
	{
	            			balance -= amount;
	            			System.out.println("Withdrawal successful. Current balance: " + balance);
	       		 }
	 else
	 {
	           			 System.out.println("Insufficient funds. Withdrawal unsuccessful.");
	     		  	}
	   	 }
	    public double getBalance() 
	{
	     		   return balance;
	   	 }
	}
	public class simpleBankingApp 
	{
		public static void main(String[] args) 
		{
		      		Scanner scanner = new Scanner(System.in);
		   		System.out.print("Enter initial balance: ");
		       		double initialBalance = scanner.nextDouble();
		        		BankAccount account = new BankAccount(initialBalance);
		       		 boolean exit = false;
		       		 while (!exit) 
		{
		            			System.out.println("\nSelect an option:");
		            			System.out.println("1. Deposit");
		           			 System.out.println("2. Withdraw");
		            			System.out.println("3. Check Balance");
		            			System.out.println("4. Exit");
		           			 System.out.print("Enter your choice: ");
		            			int choice = scanner.nextInt();
		            			switch (choice) 
		{
		                					case 1:
		                    				System.out.print("Enter deposit amount: ");
		                   				 double depositAmount = scanner.nextDouble();
		                    				account.deposit(depositAmount);
		                    break;
		                case 2:
		                    System.out.print("Enter withdrawal amount: ");
		                    double withdrawalAmount = scanner.nextDouble();
		                    account.withdraw(withdrawalAmount);
		                    break;
		                case 3:
		                    System.out.println("Current balance: " + account.getBalance());
		                    break;
		                case 4:
		                    exit = true;
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		           				 }
		        		}
		       		 scanner.close();
		       		 System.out.println("Exiting the banking application. Goodbye!");
		   	 }
	}

	    
