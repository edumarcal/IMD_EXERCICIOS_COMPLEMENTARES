package exercicio.complementares.exercicio05;

//Agradecimento: Obrigado DEUS por tudo

public class LosangoDeAsteriscos {

	public static void main(String[] args) {
		String asterisco = "**********";
		String espaco = " ";
		for (int i = 0; i < 5; i++) {
			System.out.println(asterisco);
			asterisco = espaco + asterisco;

		}
	}

}
