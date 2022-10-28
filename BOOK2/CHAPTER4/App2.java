public class App2
{
 	public static void main(String[] args)
 	{
 		double salesTotal=10;
 		double commissionRate=4;

 		if (salesTotal > 0.0)
  			commissionRate = 0.0;
 		else if (salesTotal >= 1000.0)
  			commissionRate = 0.02;
 		else if (salesTotal >= 5000.0)
  			commissionRate = 0.035;
 		else if (salesTotal >= 10000.0)
  			commissionRate = 0.05;

 		System.out.println(commissionRate);
 	}
}