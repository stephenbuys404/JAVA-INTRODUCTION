public class Main
{
	static int sum(int a, int b)   
    	{  
    		return a + b;  
    	}
 
	static double sum(double a, double b)   
    	{  
    		return a + b;  
    	}  
    
  	public static void main(String[] args)   
    	{         
    		int x = sum(10, 20);  
    		double y = sum(10.20,20.10);  
    
    		System.out.println("Summation of integer values = " +x);  
    		System.out.println("Summation of double values = " +y);  
    	}  
}  