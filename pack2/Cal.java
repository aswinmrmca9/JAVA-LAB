
import mathc.result2;
import mathc.add;
import mathc.sub;
import mathc.div;
import mathc.mul;
import java.util.Scanner;
public class Cal
{
public static void main(String[] args) {
	int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nMenu\n1.Add\n2.Subtract\n3.Multiple\n4.Division");
		System.out.println("Choose an option:");
		n=sc.nextInt();
		switch(n)
		{
			case 1:add ce=new add();
			ce.calc();
			break;
			case 2:sub re=new sub();
			re.calc();
			break;
			case 3:mul te=new mul();
			te.calc();
			break;
			case 4:div se=new div();
			se.calc();
			break;
			default:System.out.println("Invalid Option");
			}
		}
	}