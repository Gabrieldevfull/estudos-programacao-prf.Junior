package teste;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questão8 {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			
			System.out.print("Digite o valor total da conta: R$ ");
			double valorTotal = input.nextDouble();
			
			// Calcular o valor que cada um deve pagar		
			double valorCadaUm = valorTotal / 3.0;      
			
			double valorJoaoECarlos = Math.floor(valorCadaUm);	
			
			// arredonda para baixo, eliminando os centavos     
			double valorPaulo = valorTotal - 2.0 * valorJoaoECarlos;
			
			// Formatando os valores para imprimir com duas casas decimais
			DecimalFormat df = new DecimalFormat("##.00");
			

			// Imprimir o resultado
			
			System.out.print("João e Carlos devem pagar: R$ " + df.format(valorJoaoECarlos));
			
			System.out.print("Paulo deve pagar: R$ " + df.format(valorPaulo));
		}
	     

	}
	
}