package exercicio.complementares.exercicio09;

//Agradecimento: Obrigado DEUS por tudo

public class Piramide {

	public static void main(String[] args) {

		for (int coluna = 1; coluna <= 4; coluna++) {
			for (int linha = 1; linha <= 7; linha++) {
				if ((coluna == 4) || (linha == 4)
						|| (coluna == 2 && linha == 3)
						|| (coluna == 2 && linha == 5)
						|| (coluna == 3 && linha == 2)
						|| (coluna == 3 && linha == 3)
						|| (coluna == 3 && linha == 5)
						|| (coluna == 3 && linha == 6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Exemplo de coluna e depois linha
		for (int i = 0; i < 5; i++) {
			System.out.print("C");
			for (int j = 0; j < 5; j++) {
				System.out.print("L");
			}
			System.out.println();
		}
		/*
		 * int tamanhoMatriz = 4, tamanhoEspaco = 4;
		 * String asterisco = "*";
		 * 
		 * for (int i = 1; i <= tamanhoMatriz; i++) { 
		 * for (int j = 1; j <= (tamanhoEspaco - 1); j++) {
		 * System.out.print(" "); 
		 * }
		 * System.out.print(asterisco + "\n");
		 * asterisco += "**"; tamanhoEspaco-=1;
		 * }
		 */
	}

}
