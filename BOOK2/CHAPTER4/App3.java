public class App3
{
	private boolean isWeekend_no(String weekDay) {

    		weekDay = weekDay.toUpperCase();

    		if (weekDay.equals("SATURDAY"))
        		return true;
    		if (weekDay.equals("SUNDAY"))
        		return true;
    		if (weekDay.equals("MONDAY"))
        		return false;
    		if (weekDay.equals("TUESDAY"))
        		return false;
    		if (weekDay.equals("WEDNESDAY"))
        		return false;
    		if (weekDay.equals("THURSDAY"))
        		return false;
    		if (weekDay.equals("FRIDAY"))
        		return false;

    		return false;
	}

	public static void main(String[] args)
 	{
 		int i = 5;
 		int j = 10;
 		int k = 15;

 		double x = 5.0;
 		double y = 7.5;
 		double z = 12.3;

 		if(i==5){System.out.println("true");}

 		if(i==10){System.out.println("true");}

 		if(i==j){System.out.println("true");}

 		if(i==j-5){System.out.println("true");}

 		if(i>1){System.out.println("true");}

 		if(j==i*2){System.out.println("true");}

 		if(k<z){System.out.println("true");}

 		if(i*2<y){System.out.println("true");}
 	}
}