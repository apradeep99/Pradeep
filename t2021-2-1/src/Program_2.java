import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of values to be print"); 
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.print(((i + 1) + i) + ",");
		}

	}

}