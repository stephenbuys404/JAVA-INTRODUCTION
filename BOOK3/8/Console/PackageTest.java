import console.Console;

public class PackageTest {

    	public static void main(String[] args) {

        	while (Console.askYorN("Keep going?")) {
            		System.out.println("D'oh!");
        	}

	}
}
