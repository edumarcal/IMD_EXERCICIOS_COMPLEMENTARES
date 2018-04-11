package exercicio.complementares.exercicio07;

import java.util.Random;

//Agradecimento: Obrigado DEUS por tudo

public class CartoesDeEstacionamento {

	public static void main(String[] args) {
		String[][] condominio = new String[9][4];
		String primeiroElemento = null, segundoElemento = null;
		Random random = new Random();

		// Armazena os numeros dos apartamentos
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				// System.out.print(i+1);
				// System.out.print(j+1);
				primeiroElemento = Integer.toString(i + 1);
				segundoElemento = Integer.toString(j + 1);
				condominio[i][j] = primeiroElemento + segundoElemento;
			}
			// System.out.println();
		}

		/*
		 * Imprime os apartamentos for (int i = 0; i < condominio.length; i++) {
		 * String[] strings = condominio[i]; for (int j = 0; j < strings.length;
		 * j++) {
		 * System.out.println(condominio[random.nextInt(8)][random.nextInt(3)]);
		 * } }
		 */

		// para gerar um numero 1-3 acresceta mais um, pois ele vai de 0-2
		int bloco = random.nextInt(3) + 1;
		System.out.println("Bloco: " + bloco);
		int andares = random.nextInt(9) + 1;
		System.out.println("Andar: " + andares);
		int apartamento = random.nextInt(4) + 1;
		// menos um devido ao indice do array
		System.out.println("Apartamento: "
				+ condominio[andares - 1][apartamento - 1]);
	}

}
