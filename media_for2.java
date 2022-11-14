package Projects;
import java.util.Scanner;

public class media_for2 {
	public static void main(String[] args) {
		
		//Calcule a media dos valores digitados, ignorando os numeros negativo.
		
		double x, media = 0, soma = 0, aux = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero: ");
			x = input.nextDouble();
			
			if(x > 0) {
				soma += x;
				aux++;
			}
		}
		
		input.close();
		
		media = soma / aux;
		System.out.println("Media: " + media);
	}

}
