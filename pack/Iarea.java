
import graphic.result1;
import graphic.circle1;
import graphic.rectangle1;
import graphic.square1;
import graphic.triangle1;
import java.util.Scanner;
public class Iarea
{
public static void main(String[] args) {
	int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nMenu\n1.Circle\n2.Rectangle\n3.Triangle\n4.Square");
		System.out.println("Choose an option:");
		n=sc.nextInt();
		switch(n)
		{
			case 1:circle1 ce=new circle1();
			ce.area();
			break;
			case 2:rectangle1 re=new rectangle1();
			re.area();
			break;
			case 3:triangle1 te=new triangle1();
			te.area();
			break;
			case 4:square1 se=new square1();
			se.area();
			break;
			default:System.out.println("Invalid Option");
			}
		}
	}




