	import java.util.Scanner;
	public class Srch
	{
		public static void main(String args[])
		{
			int n,flag=0,sh,i;

			System.out.println("Enter the array limit:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int arr[]=new int[n];


			System.out.println("Enter  array:");
			for(i=0;i<n;i++)
				arr[i]=sc.nextInt();



			System.out.println("Array");
			for(i=0;i<n;i++)

				System.out.println(arr[i]);



			System.out.println("Enter the element to be search:");
			sh=sc.nextInt();



			for(i=0;i<n;i++)
			{
				if(arr[i]==sh)
				{
					flag=1;
					break;
				}
			}


			if(flag==1)
				System.out.println("Element found");
			else
				System.out.println("Element not found");

		}

	}