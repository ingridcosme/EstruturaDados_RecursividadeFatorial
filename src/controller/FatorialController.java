/* 
 *Crie uma fun��o recursiva que exiba o resultado do fatorial de um n�mero (pela limita_
 *��o da recursividade, o n�mero de entrada dever� ser baixo para n�o dar estouro (limi_
 *te de entrada = 12)).
*/

package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	/*Sabendo que para n natual positivo, Fat(n) = { 1, se n = 0, 1;                     
	 * 					                           { n*(n-1)! = n*(n-1)*...*1, se n > 1.
	 *Portanto, a fun��o que calcula o valor do fatorial de um n�mero deve multiplicar
	 *o n�mero n por seus antecessores n-1, n-2, n-3, ... at� chegar em 1.
	 **/
	public int fatorial(int n) {
		//Condicao de parada
		if(n <= 1) {
			return 1;  //Caso trivial, quando n=0 ou n=1 F(n)=1
		} else {
			int antecessor = n - 1;
			return n * fatorial(antecessor);  //Chamada recursiva
			//Multiplica o n�mero n pelo resultado da chamada da fun��o com o n�mero reduzido de 1
		}
	}

}
