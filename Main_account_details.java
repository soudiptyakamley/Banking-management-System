package object_class_example;
import java.util.*;
class Bank
{
	Scanner sc=new Scanner(System.in);
	String name;
	String acc_no;
	double balance;
	Bank( String n,String a,double b)
	{
		name=n;
		acc_no=a;
		balance=b;
	}
	void deposit()
	{
		System.out.println("Enter amount to deposit");
		double d1=sc.nextDouble();
		if(d1<0)
		{
			System.out.println("------------------");
			System.out.println("\ndeposit is not possible\n");
			System.out.println("------------------");
		}
		else
		{
			balance=balance+d1;
			System.out.println("------------------");
			System.out.println("Amount deposited successfully");
			System.out.println("\nAcc no = " +acc_no);
			System.out.println("balance= "+balance+"\n");
			System.out.println("------------------");
		}
	}
	void withdraw()
	{
		System.out.println("Enter amount to withddraw ::");
		double w=sc.nextDouble();
		if(w<0)
		{
			System.out.println("------------------");
			System.out.println("\nwithdraw is not possible\n");
			System.out.println("------------------");
		}
		else if(w>balance)
		{
			System.out.println("------------------");
			System.out.println("Insufficient balance");
			System.out.println("------------------");
		}
		else
		{
			balance=balance-w;
			System.out.println("------------------");
			System.out.println("Withdrawl successful");			
			System.out.println("\nAcc no = " +acc_no);
			System.out.println("Available balance= "+balance+"\n");
			System.out.println("------------------");			
		}
	}
	void display()
	{
		System.out.println("------------------");
		System.out.println("\nName= " +name);
		System.out.println("Acc no = " +acc_no);
		System.out.println("balance= "+balance+"\n");
		System.out.println("------------------");
		
	}
	
}

public class Main_account_details 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the coustomer");
		String s=sc.nextLine();
		System.out.println("Enter account number :: ");
		String ac=sc.nextLine();
		System.out.println("Enter Initital balance :: ");
		double b=sc.nextDouble();
		
		Bank ob=new Bank(s, ac, b);
		while(true)
		{
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to display");
			System.out.println("Press 4 to exit");
			System.out.println("Enter key ");
			int ch=sc.nextInt();
			switch(ch)
			{
			    case 1:
			    	ob.deposit();
			    	break;
			    case 2:
			    	ob.withdraw();
			    	break;
			    case 3:
			    	ob.display();
			    	break;
			    case 4:
			    	System.out.println("\n\nApplication closed!!\n\n");
			    	System.exit(0);
			    	
			    default:
			    	System.out.println("Wrong choice!!");
			    	
			    	
				}
		    }
	}

}
