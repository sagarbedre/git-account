import java.util.Scanner;
class Atm 
{
	static Account a=new Account();
	static Scanner sc=new Scanner(System.in);
	public void withdraw()
	{
      System.out.println("enter acctno");
	  long acctno=sc.nextLong();
	  if(a.getAcctNumber()==acctno)
	  {
        System.out.println("enter pswd");
		int pswd=sc.nextInt();
		if(a.getPswd()==pswd)
		{
			System.out.println("enter money");
			double mon=sc.nextDouble();//1000
			if(a.getBalance()>=mon)
			{
               double dc=a.getBalance()-mon;
			   a.setBalance(dc);
			}
			else
			{
				System.out.println("insufficient money");
			}
		}
		else
		{
			System.out.println("invalid pswd");
		}
	  }
	  else
	  {
		  System.out.println("account number is invalid");
	  }
	}
	public void deposit()
	{
        System.out.println("enter account no ");
        long a1 = sc.nextLong();

        if (a1==a.getAcctNumber())
        {
            System.out.println("enter passward ");
            int b = sc.nextInt();

            if (b==a.getPswd())
            {
                System.out.println(" enter deposit "); 
                
                double d = sc.nextInt();
                double e = a.getBalance()+ d;


                a.setBalance(e); 
            }
            else{

                System.out.println("plz enter valied passward ");  
            }
        }

        else 
        {
            System.out.println("plz enter valied account no ");  
        }

	}
	public void checkBalance()
	{
     System.out.println(a.getBalance());
	}
	public static void main(String[]args)
	{
		Atm a1=new Atm();
		for(;;)
		{
			System.out.println("1.withdraw 2.checkbal 3.exit 4.add deposit");
           switch(sc.nextInt())
		   {
			   case 1:
				   a1.withdraw();
			   break;
			   case 2:
                  a1.checkBalance();
			   break;
			   case 3:
				   System.exit(1);

                case 4 :
                a1.deposit();
                break;
		   }
		}
	}
}