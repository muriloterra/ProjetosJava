package Projects;

public class soma_numeros_pares {
	public static void main(String[] args) {
		
		//Mostre a soma dos primeiros 50 numeros pares
		
		int aux = 0, soma = 0;
		
		for (int i = 0; i <= 100; i++) {
			if(aux <= 50) {
				if(i % 2 == 0) {
					System.out.print(i + " ");
					soma += i;
					aux++;
				}			
			}
		}
		
		System.out.println("\nSoma: " + soma);
	}

}
