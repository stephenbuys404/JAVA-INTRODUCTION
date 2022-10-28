public class testApp
{
	public static void main(String[] args)
 	{
 		int i,sum;
 		i=50;
		
		sum=i+32;
 		System.out.println("The sum of two int variables is "+sum);

		int[] arr = {1,2,3,4,5,6,7,8};
		for (int Item:arr){
			System.out.println("Display :"+Item);
		}

		long a = 2147483649L;
		a+=a;
		System.out.println(a);
 	}
}