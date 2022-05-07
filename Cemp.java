import java.util.Scanner;
class Empl
{
	int eno,esalary;
	String ename;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee no:");
		eno=sc.nextInt();
		System.out.println("Enter Employee Name");
		ename=sc.next();
		System.out.println("Enter Employee Salary");
		esalary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esalary);
		System.out.println("...............");
	}
}
public class Cemp{
	public static void main(String args[])
	{
			int n;
			System.out.println("Enter the Number of Employee:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			Empl emp[]=new Empl[n];
			for(int i=0;i<n;i++)
			{
				emp[i]=new Empl();
			}

			System.out.println("Enter details of Employee");
			for(int i=0;i<n;i++)
			{
				emp[i].getdata();
			}

			System.out.println(" Details of Employee");
			for(int i=0;i<n;i++)
			{
				emp[i].display();
			}
			System.out.println("Enter the Employee number you want search");
			int se=sc.nextInt();
			int flag=0,l=0;
			for(int i=0;i<n;i++)
			{
				if(emp[i].eno==se)
				{
					flag=1;
			
					break;
				}
				l++;
			
			}
				if(flag==1)
				{
					emp[l].display();
				
				}
				else
				{
					System.out.println("Employee not present");
				}			
	}
}