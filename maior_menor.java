package Projects;
import java.util.Scanner;

public class maior_menor {
	public static void main(String[] args) {	
		
		//Digite 5 numeros e imprima o maior e menor numero digitado.
		
		Scanner input = new Scanner(System.in);
		
		int valor[] = new int[5];
		int maior = 0, menor = 999;
		
		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = input.nextInt();
			
			if(valor[i] > maior) {
				maior = valor[i];
			}
		}
		input.close();
		
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor) {
				menor = valor[j];
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
	}

}


