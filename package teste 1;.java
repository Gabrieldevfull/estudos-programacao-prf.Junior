package teste;
import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			
			System.out.print("Qual o seu nome?");
			String nome = sc.nextLine();
			
			System.out.println("Informe sua primeira nota?");
			double n1 = sc.nextDouble();
			
			System.out.println("Informe sua segunda nota?");
			double n2 = sc.nextDouble();
			
			double soma = (n1+n2)/2;
			
			if (soma>=7) {
				System.out.println(nome + "Aprovado!!");
				} else {
				System.out.println(nome + "Reprovado!!");
			}
		}

	}

}
