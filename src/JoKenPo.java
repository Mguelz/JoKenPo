import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int jogador, computador;

		System.out.println("_________JoKenPô_________");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = scanner.nextInt();
		// jogador
		switch (jogador) {
		case 1:
			System.out.println("\nJogador escolheu Pedra");
			break;

		case 2:
			System.out.println("\nJogador escolheu Papel");
			break;

		case 3:
			System.out.println("\nJogador escolheu Tesoura");
			break;
		default:
			System.out.println("\nOpção Inválida");
		}

		// computador
		computador = random.nextInt(2) + 1;
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;

		case 2:
			System.out.println("Computador escolheu Papel");
			break;

		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}		
		
		// processamento
		if(jogador == computador) {
			System.out.println("\n         EMPATE");
		}else if((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
			System.out.println("\n      Você Venceu!");
		}else {
			System.out.println("\n    O computador Venceu");
		}
		
		System.out.println("\n_________JoKenPô_________");
		
		scanner.close();
	}
}
