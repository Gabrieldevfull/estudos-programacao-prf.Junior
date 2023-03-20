package teste;
import java.util.Scanner;

public class dif {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			
			System.out.println("Informe um valor");
			int n1 = sc.nextInt();
			
			if (n1 % 2 == 0) {
				System.out.println(n1 + " é par ");
			} else {
				System.out.println(n1 + "é impar");
			}
		}
	}
}