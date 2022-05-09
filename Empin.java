import java.util.Scanner;
public class Empin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter  no of teachers");
		n=sc.nextInt();
		teacher t[]=new teacher[n];
		for(i=0;i<t.length;i++)
		{
			t[i]=new teacher();
			System.out.println("\n");
		}
		 System.out.println("Details of teachers");
		for(i=0;i<t.length;i++)
		{  
			t[i].dis();
		}
	}
}




class employee
{
	int salary;
	String empid,names,address;
	Scanner sc=new Scanner(System.in);
	employee()
	{
		    System.out.println("Enter the empid");
			empid=sc.next();
			System.out.println("Enter the name:");
			names=sc.next();
			System.out.println("Enter the address:");
			address=sc.next();
			System.out.println("Enter the salary:");
			salary=sc.nextInt();
	}
}




class teacher extends employee
{
	String department,subject;
	teacher()
	{
		super();
		System.out.println("Enter the department:");
		department=sc.next();
		System.out.println("Enter the subject:");
		subject=sc.next();

	}
	void dis()
	{
		System.out.println("Empid:"+empid);
		System.out.println("Employee Name:"+names);
		System.out.println("Employee Adress:"+address);
		System.out.println("Employee salary:"+salary);
		System.out.println("Department:"+department);
		System.out.println("Subject:"+subject);
		System.out.println("\n");
	}
}


