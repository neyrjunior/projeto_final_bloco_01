package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		
		while(true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                LOJA DO SEUZÈ                		");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                         ");
			System.out.println("            2 - Listar Produtos              		 ");
			System.out.println("            3 - Atualizar produto			          ");
			System.out.println("            4 - Apagar produto             			  ");
			System.out.println("            0 - Sair		                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
				option = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros");
				sc.nextLine();
				option = 0;		
		}
			if(option == 0) {
				System.exit(0);
			}
			switch (option){
			
			case 1 :{
				System.out.println("Criar produto");
				
				break;
			}
			case 2: {
				System.out.println("Listar produtos");
				
				break;
			}
			case 3: {
				System.out.println("Atualizar produto");
				
				break;
			}
			case 4: {
				System.out.println("Apagar produto");
				
				break;
			}
			
			}

	}

}
}
