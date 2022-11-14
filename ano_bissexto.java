package Projects;
import java.util.Scanner;

public class ano_bissexto {
	public static void main(String[] args) {
		//Digite um ano para saber se é bissexto.
		int ano;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		ano = input.nextInt();
		input.close();
		
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
			
		}
		
		else {
			System.out.println(ano + " não é bissexto.");
		}
	}

}
