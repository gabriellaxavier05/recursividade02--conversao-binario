package view;

import controller.ConvertBinarioController;

public class PrincipalBinario {

	public static void main(String[] args) {

		//instanciando a classe controller e criando um objeto
		ConvertBinarioController b = new ConvertBinarioController();
		
		
		//atribuindo
		int n = 36;
		
		//chamando a fun��o recursiva
		String res = b.binario(n);
		System.out.println("O n�mero " + n + " convertido em bin�rios � " + res);
	}

}
