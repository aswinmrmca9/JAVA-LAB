import java.util.Scanner;
class Form
{
	public static void main(String args[])
	{
		expt u=new expt();
		try
		{
			u.get();
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
class expt
{
	Scanner sc=new Scanner(System.in);
	String nuser,psd;
	void get() throws uerror
	{
		System.out.println("Username:");
		nuser=sc.next();
		System.out.println("Password:");
		psd=sc.next();
		if(nuser.equals("admin") && psd.equals("admin123"))
		{
			System.out.println("login success");
		}
		else
		{
			throw new uerror("\nInvalid username or password");
		}
	}
}

