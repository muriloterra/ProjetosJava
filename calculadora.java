package Projects;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		double x, y, res = 0;
		int escolha;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro valor da operação: ");
		x = input.nextDouble();
		System.out.print("Digite o operador: \n1- Soma \n2- Subatração  \n3- Multiplicação \n4- Divisão \n\nOperador: ");
		escolha = input.nextInt();
		System.out.print("Digite o segundo valor da operação: ");
		y = input.nextDouble();
		input.close();
		
		switch (escolha) {
		case 1:
				res = x + y;
				System.out.println("Resultado da soma: " + res);
			break;
			
		case 2:
				res = x - y;
				System.out.println("Resultado da subtração: " + res);
			break;
			
		case 3:
			res = x * y;
			System.out.println("Resultado da multiplicação: " + res);
		break;
		
		case 4:
			res = x / y;
			System.out.println("Resultado da divisão: " + res);
		break;

		
		}
	}

}
