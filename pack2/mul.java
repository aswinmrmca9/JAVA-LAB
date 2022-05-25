package mathc;
import java.util.Scanner;
public class mul implements result2
{
	int l,b,a;
	Scanner sc=new Scanner(System.in);
	public void calc()
	{
		System.out.println("Enter Number 1");
		l=sc.nextInt();
		System.out.println("Enter Number 2");
		b=sc.nextInt();
		a=l*b;
		System.out.println("Mul="+a);
	}

}