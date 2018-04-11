package exercicio.complementares.exercicio11;

//Agradecimento: Obrigado DEUS por tudo

public class ContaUns {

	public static void main(String[] args) {
		double numero = Math.random();
		System.out.println(numero);
		String s = "" + numero;
		int reposta = 0;
		char[] sCaracter = s.toCharArray();
		for (int i = 0; i < sCaracter.length; i++) {
			if (sCaracter[i]=='1') {
				reposta+=1;
			}
		}
		System.out.println(reposta);

	}

}
