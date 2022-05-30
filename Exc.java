
 public class Exc {  
    public static void main(String[] args) {  
    	int a=0;
      try  
        { 
		a=20/0;
        }     
      catch(ArithmeticException e)  
        	{  
           		 System.out.println(e);  
        	}  
      System.out.println("Division="+a); 
    }  
      
}  
