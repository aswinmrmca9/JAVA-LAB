import java.util.Scanner;
class Prnin
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of teachers");
		n=sc.nextInt();
		teacher t[]=new teacher[n];
		for(i=0;i<t.length;i++)
		{
			t[i]=new teacher();
			System.out.println("\n");
		}
        System.out.println("Details of teachers");
		for(i=0;i<t.length;i++)
			t[i].disp();
	}
}



class person
{
	String name,gender,address;
	int age;
	Scanner sc=new Scanner(System.in);
	person()
	{
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the gender:");
		gender=sc.next();
		System.out.println("Enter the address:");
		address=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
	}
}



class employee extends person
{
	String empid,companyname,qualif;
	int salary;
	employee()
	{
		super();
		System.out.println("Enter the employee id:");
		empid=sc.next();
		System.out.println("Enter the company name:");
		companyname=sc.next();
		System.out.println("Enter the qualification:");
		qualif=sc.next();
		System.out.println("Enter the salary:");
		salary=sc.nextInt();
	}
}



class teacher extends employee
{
	String subject,dept,tchid;
	teacher()
	{
		super();
		System.out.println("Enter the subject");
		subject=sc.next();
		System.out.println("Enter the department");
		dept=sc.next();
		System.out.println("Enter the teacher id");
		tchid=sc.next();
		System.out.println("\n");
	}
	void disp()
	{
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Empid:"+empid);
		System.out.println("Company name:"+companyname);
		System.out.println("Qualification:"+qualif);
		System.out.println("Salary:"+salary);
		System.out.println("Subject:"+subject);
		System.out.println("Department:"+dept);
		System.out.println("Teacher id:"+tchid);
		System.out.println("\n");
	}
}

