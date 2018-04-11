package exercicio.complementares.exercicio10;

//Agradecimento: Obrigado DEUS por tudo

public class ArvoreNatal {
	public static void main(String[] args) {
		int tamanhoMatriz = 4, tamanhoEspaco = 8;
		String asterisco = "*";

		// primeiro
		for (int i = 1; i <= tamanhoMatriz; i++) {
			for (int j = 1; j <= (tamanhoEspaco - 1); j++) {
				System.out.print(" ");
			}
			System.out.print(asterisco + "\n");
			asterisco += "**";
			tamanhoEspaco -= 1;
		}

		// meio
		tamanhoEspaco = 6;
		tamanhoMatriz = 4;
		asterisco = "*****";
		for (int i = 1; i <= tamanhoMatriz; i++) {
			for (int j = 1; j <= (tamanhoEspaco - 1); j++) {
				System.out.print(" ");
			}
			System.out.print(asterisco + "\n");
			asterisco += "**";
			tamanhoEspaco -= 1;
		}

		// fim
		tamanhoEspaco = 4;
		tamanhoMatriz = 4;
		asterisco = "*********";
		for (int i = 1; i <= tamanhoMatriz; i++) {
			for (int j = 1; j <= (tamanhoEspaco - 1); j++) {
				System.out.print(" ");
			}
			System.out.print(asterisco + "\n");
			asterisco += "**";
			tamanhoEspaco -= 1;
		}
	}
}
