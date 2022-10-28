import javax.swing.JOptionPane;

public class Dialog
{
	public static void sayHello(String greet)
	{
		JOptionPane.showMessageDialog(null,
 		"Hello, World!", "Greeter",
 		JOptionPane.INFORMATION_MESSAGE);
	}
}