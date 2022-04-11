import java.util.Scanner;
class Cal{
	int r;
	float area,per;
	void area()
	{
		area=(float)(3.14*r*r);
	}
	void peri()
	{
		 per=(float)(2*3.14*r);
	}
	void display()
	{
		System.out.println("Area="+area+"\n Perimeter="+per);
	}
}
public class Acls{
	public static void main(String args[])
	{
 		Cal s1=new Cal();
 		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		s1.r=sc.nextInt( );
 		s1.area();
 		s1.peri();
 		s1.display();

	}
}