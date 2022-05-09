import java.util.Scanner;

public class Interarea
{
public static void main(String[] args) {
	int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nMenu\n1.Circle\n2.Rectangle");
		System.out.println("Choose an option:");
		n=sc.nextInt();
		switch(n)
		{
			case 1:circle ce=new circle();
			ce.area();
			ce.perimeter();
			break;
			case 2:rectangle re=new rectangle();
			re.area();
			re.perimeter();
			break;
			default:System.out.println("Invalid Option");
			}
		}
	}



interface result
{
	public void area();
	public void perimeter();
}
class circle implements result
{
	Scanner sc=new Scanner(System.in);
	double r,a,p;
	public void area()
	{
		System.out.println("Enter Radius");
		r=sc.nextFloat();
		a=3.14*r*r;
		System.out.println("Area of Circle: "+a);
	}

	public void perimeter()
	{
		p=2*3.14*r;
		System.out.println("Perimeter of Circle:"+p);
	}
}
class rectangle implements result
{
	int l,b,a,p;
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

	public void perimeter()
	{
		p=2*(l+b);
		System.out.println("Perimeter of Rectangle: "+p);
	}

}


