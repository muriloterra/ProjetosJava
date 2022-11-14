package Projects;
import java.util.Scanner;

public class media_for {
	public static void main(String[] args) {
		
		//Leia 10 numeros inteiros e imprima a média
		
		double x, aux = 0, res;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digte um numero: ");
			x = input.nextDouble();
			aux += x;
			
		}
		input.close();
		
		res = aux / 10;
		System.out.println("Media: " +res);
		
	}

}
