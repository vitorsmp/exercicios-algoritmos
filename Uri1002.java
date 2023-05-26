import java.util.Scanner;

public class Uri1002 { 

	public static void main(String[] args) {
		
		// area	= n . raio²
		// n = 3.14159
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, n = 3.14159;
		
		raio = sc.nextDouble();
		
		area = n * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}