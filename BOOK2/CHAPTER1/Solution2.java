import java.io.*;
import java.util.*;

public class Solution2 {

	public static void main(String[] args) {

        	Scanner scanner = new Scanner(System.in);
        	int N = scanner.nextInt();
        
        	for (int i = 1; i <= 10; ++i) {
            		System.out.printf("%d x %d = %d\n", N, i, N * i);
        	}
    	}
}