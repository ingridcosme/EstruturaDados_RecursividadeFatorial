/* 
 *Crie uma função recursiva que exiba o resultado do fatorial de um número (pela limita_
 *ção da recursividade, o número de entrada deverá ser baixo para não dar estouro (limi_
 *te de entrada = 12)).
*/

package view;

import java.util.Scanner;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fat = new FatorialController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculo do fatorial de um número natural positivo\n");
		System.out.printf("Digite um número (0 <= n <= 12): ");
		int n = ler.nextInt();
		
		while(n < 0 || n > 12) {
			System.out.printf("\nDigite um número (0 <= n <= 12): ");
			n = ler.nextInt();
		}
		
		ler.close();
		
		int fatrec = fat.fatorial(n);
		System.out.printf("\nO fatorial de " +n+ " é igual a " +fatrec);
		
		
	}

}
