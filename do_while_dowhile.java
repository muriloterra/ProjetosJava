package Projects;

public class do_while_dowhile {
	public static void main(String[] args) {
	
		//Escreva numeros de 1 até 100 usando for, while e do while
		
		int x = 0, y = 0;
		
		
		 for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}
		 System.out.println("");
		
		while(x <= 99) {
			
			x += 1;
					
			System.out.print(x + " ");
		}
		System.out.println("");
		
		do {
			y += 1;
			System.out.print(y + " ");
		}while(y < 100);
		
	}

}

