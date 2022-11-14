package Projects;

import java.util.Scanner;

public class soma_divisores {
	public static void main(String[] args) {
		
		//Digite um numero e calcule a soma dos seus divisores
		
		Scanner input = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Informe um numero inteiro: ");
		x = input.nextInt();
		
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
				soma += i;
			}
		}
		input.close();
		
		System.out.println("Resultado da soma: " + soma);
		
	}

}
