/* 
 *Crie uma fun��o recursiva que exiba o resultado do fatorial de um n�mero (pela limita_
 *��o da recursividade, o n�mero de entrada dever� ser baixo para n�o dar estouro (limi_
 *te de entrada = 12)).
*/

package view;

import java.util.Scanner;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fat = new FatorialController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculo do fatorial de um n�mero natural positivo\n");
		System.out.printf("Digite um n�mero (0 <= n <= 12): ");
		int n = ler.nextInt();
		
		while(n < 0 || n > 12) {
			System.out.printf("\nDigite um n�mero (0 <= n <= 12): ");
			n = ler.nextInt();
		}
		
		ler.close();
		
		int fatrec = fat.fatorial(n);
		System.out.printf("\nO fatorial de " +n+ " � igual a " +fatrec);
		
		
	}

}
