package exercicio.complementares.exercicio04;

//Agradecimento: Obrigado DEUS por tudo

public class TresTrianguloDeAsteriscos {

	public static void main(String[] args) {
		String asterico = "*";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println(asterico);
				asterico += "*";
			}
			asterico = "*";
		}
	}

}
