import java.util.Scanner;
class fib extends Thread
{
	public void run()
	{
	int n,f1=0,f2=1,f3=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit for fibonacci : ");
	n=sc.nextInt();
	System.out.println("0");
	System.out.println("1");
	for(int i=1;i<=n;i++)
	{
	f3=f1+f2;
	System.out.println(f3);
	f1=f2;
	f2=f3;
	}	
	}
}



class even extends Thread
{
	public void run()
	{
	int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit for even : ");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}	
    }
}
	


public class Fibthr
{
	public static void main(String args[])
	{
		fib s1 = new fib();
		Thread m1 = new Thread(s1);
         
		even d1 = new even();
		Thread m2 = new Thread(d1);

		Scanner sc=new Scanner(System.in);
		s1.start();
		d1.start();
	}
}
