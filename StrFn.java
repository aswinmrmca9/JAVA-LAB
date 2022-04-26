import java.util.Scanner;
public class StrFn{
	public static void main(String Args[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		s1=sc.next();
		System.out.println("Enter string 2:");
		s2=sc.next();
		System.out.println("Length of "+s1+" is "+s1.length());
		System.out.println("Length of "+s2+" is "+s2.length());
		System.out.println("Upper case:"+s1.toUpperCase());
		System.out.println("Lower case:"+s2.toLowerCase());
		System.out.println("Equal:"+s1.equals(s2));
		System.out.println("Concat "+s1+" and "+s2+" is "+s1.concat(s2));
		System.out.println("Character at position 3 in "+s1+" is "+s1.charAt(3));
		System.out.println("Index  of e in "+s1+" is "+s1.indexOf('e'));
		

	}
}