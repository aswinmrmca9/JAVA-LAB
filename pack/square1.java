package graphic;
import java.util.Scanner;
public class square1 implements result1
{
	Scanner sc=new Scanner(System.in);
	double r,a;
	public void area()
	{
		System.out.println("Enter side");
		r=sc.nextFloat();
		a=r*r;
		System.out.println("Area of square: "+a);
	}

}