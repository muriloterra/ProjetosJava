package Projects;
import java.util.Scanner;

public class classificacao_peso {
	public static void main(String[] args) {
		double h, peso;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		h = input.nextDouble();
		System.out.print("Informe seu peso: ");
		peso = input.nextDouble();
		input.close();
		
		if(h < 1.20) {
			if(peso <= 60) {
				System.out.println("Classificação: A");
			}
			else if(peso > 60 && peso < 90) {
				System.out.println("Classificação: D");
			}
			else {
				System.out.println("Classificação: G");
			}
		
		}
		
		else if(h >= 1.20 && h < 1.70) {
			if(peso <= 60) {
				System.out.println("Classificação: B");
			}
			else if(peso > 60 && peso < 90) {
				System.out.println("Classificação: E");
			}
			else {
				System.out.println("Classificação: H");
			}
		}
		
		else {
			if(peso <= 60) {
				System.out.println("Classificação: C");
			}
			else if(peso > 60 && peso < 90) {
				System.out.println("Classificação: F");
			}
			else {
				System.out.println("Classificação: I");
			}
		}
	}

}
