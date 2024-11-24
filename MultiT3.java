import java.util.Scanner;

class Account
{
	int bal;
	Account(int b)
	{
		bal=b;
	}

	public boolean isSufficientBal(int wb)
	{
		if(bal > wb)
			return true;
		else
			return false;
	}

	public void withdraw(int wb)
	{
		bal=bal-wb;
		System.out.println("Withdraw Successful");
		System.out.println("Current Bal is:"+ bal);
	}

}

class Customer implements Runnable
{
	Account h1;
	String name;
	Customer(Account g1,String s1)
	{
		h1=g1;
		name=s1;
	}

	public void run()
	{
		synchronized(h1)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println(name+",  Enter amount:");
			int amt=s1.nextInt();
			if(h1.isSufficientBal(amt))
			{
				System.out.println(name+" ");
				h1.withdraw(amt);
			}
			else
			{
				System.out.println(name+", Insufficint Balance.");
			}
		}

	}

}

class MultiT3
{
	public static void main(String []args)
	{
		Account a1=new Account(1000);
		Customer c1=new Customer(a1,"Mukesh");
		Customer c2=new Customer(a1,"Kittu");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();

	}
}