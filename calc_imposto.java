package Projects;
import java.util.Scanner;

public class calc_imposto {
	public static void main(String[] args) {
		
		/*Uma empresa vende o mesmo produto em estados diferentes, porem cada estado possui sua taxa de imposto.
		  Calcule o valor final dos produtos no estado escolhido*/
		
		int escolha;
		double val, res;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		val = input.nextFloat();
		System.out.print("\nSelecione o estado \n1- MG \n2- SP \n3- RJ \n4- MS \nEscolha: ");
		escolha = input.nextInt();
		input.close();
		
		switch (escolha) {
		case 1:
			
			res = val * 0.07;
			val += res;
			System.out.println("Valor total: " + val);
			break;
			
		case 2:
			res = val * 0.12;
			val += res;
			System.out.println("Valor total: " + val);
			break;
			
		case 3:
			res = val * 0.15;
			val += res;
			System.out.println("Valor total: " + val);
			break;
			
		case 4:
			res = val * 0.08;
			val += res;
			System.out.println("Valor total: " + val);
			break;

		default:
			System.out.println("Estado não encontrado.");
			break;
		}
	}

}
