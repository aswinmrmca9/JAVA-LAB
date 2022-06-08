import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Filen{
public static void main(String args[])
{
	try{
	
    FileWriter f=new FileWriter("test.txt");
	f.write("Java \n");
	f.write("World");
	f.close();

	File ob=new File("test.txt");
	System.out.println("READ");
	Scanner sc=new Scanner(ob);
	while(sc.hasNextLine())
	{
		String data=sc.nextLine();
		System.out.println(data);
	}
}
catch(IOException e)
{
	System.out.println("Overwrite"+e);
}
}

}