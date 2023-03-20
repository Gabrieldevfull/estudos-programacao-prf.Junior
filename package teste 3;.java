package teste;
import java.util.Scanner;

public class soma{

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			
			System.out.println("Informe um valor:");
			int n1 = sc.nextInt();
			
			System.out.println("Informe um segundo valor:");
			int n2 = sc.nextInt();
			
			int soma = (n1 + n2);
					
			
			if (soma >=20 ) {
				System.out.println(soma+5);
			}else {
				System.out.println(soma*8);
			}
		}
		
	}
}