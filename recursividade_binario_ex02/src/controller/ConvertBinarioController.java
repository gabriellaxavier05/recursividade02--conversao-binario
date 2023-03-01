package controller;

public class ConvertBinarioController {

	//criando a função recursiva
	public String binario(int n) {
		if (n < 2) { //condição de parada; caso base.
			return Integer.toString(n); //transforma n em binário 
			
		}
		else { //início da recursividade
			return binario(n/2) + Integer.toString(n%2); //divide n por 2, depois soma o resto de n%2 e converte o resto de n%2 pra binário 
		}
	}
}
