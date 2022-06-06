import java.util.Scanner;
class Avgex
{
	public static void main(String args[])
	{

		try
		{
			Scanner sc=new Scanner(System.in);
			float avg=0;
			int sum=0;
			int i,a,n;
			System.out.println("Enter the limit");
			n=sc.nextInt();
			System.out.println("Enter the Number");
			for(i=0;i<n;i++)
			{
             a=sc.nextInt();
             if(a<0)
             {
             	throw new uerror("\nNegative number");
             }
             else
             {
             	sum=sum+a;
             	avg=sum/n;
             }
			}
			System.out.println("Sum="+sum);
			System.out.println("Average="+avg);
				
		}
		catch(uerror e)
		{
			System.out.println("Exception\n"+e);	
		}
	}
}

class  uerror extends Exception
{
public uerror(String str)
{
	super(str);
}
} 
