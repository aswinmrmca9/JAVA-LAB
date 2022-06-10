import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

class Fileo
{
	public static void main(String args[])
	{
		try
		{
			File ob=new File("oddeven.txt");
			FileWriter ev=new FileWriter("even.txt");
			FileWriter od=new FileWriter("odd.txt");
			
			
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine())
			{
				int x=sc.nextInt();
				if(x%2==0)
				{
					ev.write(" ");
					ev.write(String.valueOf(x));
					
				}
				else
				{
					od.write(" ");
					od.write(String.valueOf(x));
					
				}
			}
			ev.close();
            od.close();
		}
		catch(Exception e)
		{

		}
	}
}