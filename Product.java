import java.util.Scanner;
class Pce{
	
	int pcode,price;
	String pname;
	Scanner sc=new Scanner(System.in);


	void data()
	{
		System.out.println("Enter pcode:");
		pcode=sc.nextInt();
		System.out.println("Enter pname:");
		pname=sc.next();
		System.out.println("Enterprice:");
		price=sc.nextInt();

	}


	void display()
	{
		System.out.println("pcode="+pcode);
		System.out.println("Pname="+pname);
		System.out.println("Price="+price);
	}

}


public class Product{
	public static void main(String args[])
	{


		int l;
		Scanner sc=new Scanner(System.in);
		Pce a=new Pce();
		Pce b=new Pce();
		Pce c=new Pce();

		System.out.println("Enter first product");
		a.data();
		System.out.println("Enter Second product");
		b.data();
		System.out.println("Enter third product");
		c.data();



		System.out.println("Product having lowest price:");
		
		l=a.price;
		if(b.price<l)
		{
			b.display();
		}
		else if(c.price<l)
		{
			c.display();
		}
		else
		{
			a.display();
		}


	}
}