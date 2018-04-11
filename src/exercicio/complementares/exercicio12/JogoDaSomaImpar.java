package exercicio.complementares.exercicio12;

import java.util.Random;

//Agradecimento: Obrigado DEUS por tudo

public class JogoDaSomaImpar {

	public static void main(String[] args) {
		int[] numerosSorteados = new int[10];
		Random randomGeraNumero = new Random();
		int soma = 0, contaSeis = 0;

		// salva os valores escolhidos aleatoriamente
		for (int i = 0; i < numerosSorteados.length; i++) {
			numerosSorteados[i] = randomGeraNumero.nextInt(6) + 1;
		}

		// soma os valores escolhidos
		for (int i = 0; i < numerosSorteados.length; i++) {
			if (numerosSorteados[i] != 1) {
				soma += numerosSorteados[i];
			}
			if (numerosSorteados[i] == 6) {
				contaSeis += 1;
			}
		}
		if (contaSeis >= 2) {
			System.out.println("Voce perdeu! saiu duas vezes o numero 6");
		} else if (soma % 2 == 1) {
			System.out.println("Voce ganhou!");
		} else {
			System.out.println("Voce perdeu!");
		}
	}

}
