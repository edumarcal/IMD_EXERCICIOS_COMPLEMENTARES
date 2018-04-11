package exercicio.complementares.exercicio01;

// Agradecimento: Obrigado DEUS por tudo

public class ComparaValores {

	public static void main(String[] args) {
		double primeiro = Math.random();
		double segundo = Math.random();
		System.out.println("Primeiro: " + primeiro);
		System.out.println("Sgundo: " + segundo);
		if (primeiro > segundo) {
			System.out.println("Primeiro>Segundo \n" + primeiro + " maior que "
					+ segundo);
		} else if (primeiro == segundo) {
			System.out.println("Primeiro=Segundo \n" + primeiro + " igual a "
					+ segundo);
		} else {
			System.out.println("Primeiro<Segundo \n" + primeiro + " menor que "
					+ segundo);
		}

	}

}
