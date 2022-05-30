public class Arex{
 	 public static void main(String[ ] args) {
 	try{

  		  int[] num = {1, 2, 3};
   		  System.out.println(num[2]);
     	     }
		catch(ArithmeticException e)	{
			System.out.println("Arithmetic Exception occur");
		}
		catch(Exception e)	{
			System.out.println("Exception thrown:"+e);
		}

}}
