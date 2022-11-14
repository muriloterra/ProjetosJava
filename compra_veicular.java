package Projects;
import java.util.Scanner;

public class compra_veicular {
	public static void main(String[] args) {
		
		//Leia o custo de fabrica de um veiculo e escreva o custo final contando com comissao e impostos
		
		double val, res, tax = 0, total = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro: ");
		val = input.nextDouble();
		input.close();
		
		if(val <= 12000) {
			res = val * 0.05;
			System.out.println("\nComissão vendedor: " + res);
			
			System.out.println("Impostos: 0");
			
			total = val + res;
			System.out.println("Valor final: " + total);
			
		}
		else if(val > 12000 && val <=25000) {
			res = val * 0.10;
			System.out.println("\nComissão vendedor: " + res);
			
			tax = val * 0.15;
			System.out.println("Impostos: " + tax);
			
			total = val + res + tax;
			System.out.println("Valor final: " + total);
			
		}
		
		else {
			res = val * 0.15;
			System.out.println("\nComissão vendedor: " + res);
			
			tax = val * 0.20;
			System.out.println("Impostos: " + tax);
			
			total = val + res + tax;
			System.out.println("Valor final: " + total);
		}
	}

}
