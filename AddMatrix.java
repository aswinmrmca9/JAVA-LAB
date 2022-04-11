import java.util.Scanner;
public class AddMatrix{
	public static void main(String args[])
	{

	int m,n;

	System.out.println("Enter no. of rows:");
	Scanner sc=new Scanner(System.in);
	m=sc.nextInt();
	System.out.println("Enter no. of columns:");
	n=sc.nextInt();

	int a[][]=new int[m][n];
	int b[][]=new int[m][n];
	int c[][]=new int[m][n];


	System.out.println("Enter first matrix:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}

	System.out.println("Enter second matrix:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}


	System.out.println("First Matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

	System.out.println("Second Matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}


	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}


	System.out.println("After Addition:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}

	}
}