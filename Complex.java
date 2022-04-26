import java.util.Scanner;
class Cal{

	int a,b;
	void data()
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("real part:");
		a=sc.nextInt();
		System.out.println("Imaginary part:");
		b=sc.nextInt();
	}		
	
}


public class Complex{
	public static void main(String args[])
	{
		int x,z;
		Scanner sc=new Scanner(System.in);
		Cal s1=new Cal();
		Cal s2=new Cal();
		System.out.println("Enter 1st complex number:");
		s1.data();
		System.out.println("1st Complex:"+s1.a+"+"+s1.b+"i");
		System.out.println("..........................................");
		System.out.println("Enter 2nd complex number:");
		s2.data();
		System.out.println("2nd Complex:"+s2.a+"+"+s2.b+"i");
		System.out.println("..........................................");

		x=s1.a+s2.a;
		z=s1.b+s2.b;

		System.out.println("Addition of Complex \n"+x+"+"+z+"i");
		}
	}