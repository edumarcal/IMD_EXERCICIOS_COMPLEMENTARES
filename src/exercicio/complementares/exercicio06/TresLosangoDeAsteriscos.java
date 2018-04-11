package exercicio.complementares.exercicio06;

//Agradecimento: Obrigado DEUS por tudo

public class TresLosangoDeAsteriscos {

	public static void main(String[] args) {
		String asteriscos = "**********";
		String espaco = " ";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(asteriscos);
				asteriscos = espaco+asteriscos;
			}
			asteriscos = "**********";
		}

	}

}
