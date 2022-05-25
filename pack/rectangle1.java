package graphic;
import java.util.Scanner;
public class rectangle1 implements result1
{
	int l,b,a;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Breadth");
		b=sc.nextInt();
		a=l*b;
		System.out.println("Area of Rectangle: "+a);
	}

}