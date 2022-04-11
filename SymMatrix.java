import java.util.Scanner;

public class SymMatrix{

	public static void main(String args[]){
		
		int m,n,flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		m=sc.nextInt();

		System.out.println("Enter columns:");
		n=sc.nextInt();
if(m==n)
	   {
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];


		System.out.println("Enter matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}



		System.out.println("Matrix ");
			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}



			System.out.println("Matrix transpose");
			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
            



			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					flag++;
					break;
				}
			}
		}



		if(flag==1)
		{
			System.out.println("symmetric matrix ");
		}
		else
			{
			System.out.println("Not symmetric matrix ");
		}

       }
       else
       {
       	System.out.println("Row and coloumn not equal");
       }
	}
}