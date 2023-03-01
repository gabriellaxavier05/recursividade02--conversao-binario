package controller;

public class ConvertBinarioController {

	//criando a fun��o recursiva
	public String binario(int n) {
		if (n < 2) { //condi��o de parada; caso base.
			return Integer.toString(n); //transforma n em bin�rio 
			
		}
		else { //in�cio da recursividade
			return binario(n/2) + Integer.toString(n%2); //divide n por 2, depois soma o resto de n%2 e converte o resto de n%2 pra bin�rio 
		}
	}
}
