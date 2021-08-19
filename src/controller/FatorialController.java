/* 
 *Crie uma função recursiva que exiba o resultado do fatorial de um número (pela limita_
 *ção da recursividade, o número de entrada deverá ser baixo para não dar estouro (limi_
 *te de entrada = 12)).
*/

package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	/*Sabendo que para n natual positivo, Fat(n) = { 1, se n = 0, 1;                     
	 * 					                           { n*(n-1)! = n*(n-1)*...*1, se n > 1.
	 *Portanto, a função que calcula o valor do fatorial de um número deve multiplicar
	 *o número n por seus antecessores n-1, n-2, n-3, ... até chegar em 1.
	 **/
	public int fatorial(int n) {
		//Condicao de parada
		if(n <= 1) {
			return 1;  //Caso trivial, quando n=0 ou n=1 F(n)=1
		} else {
			int antecessor = n - 1;
			return n * fatorial(antecessor);  //Chamada recursiva
			//Multiplica o número n pelo resultado da chamada da função com o número reduzido de 1
		}
	}

}
