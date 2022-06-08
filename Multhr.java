import java.util.Scanner;
class mult extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int i;
			for(i=1;i<=10;i++)
			{
			  System.out.println(i+"*5="+(i*5));	
			}
	}
}



class prime extends Thread
{
	public void run()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for prime :");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int f=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					f++;				}
			    }
			if(f==2)
			{
				System.out.println(" "+i);
			}
		   
	    }
    }
}
	


public class Multhr
{
	public static void main(String args[])
	{
		mult s1 = new mult();
		Thread m1 = new Thread(s1);
         
		prime d1 = new prime();
		Thread m2 = new Thread(d1);

		Scanner sc=new Scanner(System.in);
		s1.start();
		d1.start();
	}
}
