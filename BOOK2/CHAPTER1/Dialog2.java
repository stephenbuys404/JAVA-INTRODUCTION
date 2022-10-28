import javax.swing.JOptionPane;

public class Dialog2
{
	public static void sayHello(String greet)
	{
		
		String in,out;
		in=JOptionPane.showInputDialog("Enter your name ");

		out=greet+in+" How Are You?"; 
		JOptionPane.showMessageDialog(null,out, "Greeter",JOptionPane.INFORMATION_MESSAGE);

 	}
}