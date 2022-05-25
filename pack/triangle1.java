package graphic;
import java.util.Scanner;
public class triangle1 implements result1
{
	int l,h,a;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter Length");
		l=sc.nextInt();
		System.out.println("Enter Height");
		h=sc.nextInt();
		a=(l*h)/2;
		System.out.println("Area of Triangle: "+a);
	}

}