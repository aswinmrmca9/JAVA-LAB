package graphic;
import java.util.Scanner;
class circle1 implements result1
{
	Scanner sc=new Scanner(System.in);
	double r,a;
	public void area()
	{
		System.out.println("Enter Radius");
		r=sc.nextFloat();
		a=3.14*r*r;
		System.out.println("Area of Circle: "+a);
	}

}