package principal;

import java.util.Scanner;

public class Problema{
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
			int N = leitor.nextInt();
			leitor.nextLine(); 
			
      
			for (int i = 0; i < N; i++) {
			    String jogador1 = leitor.nextLine().toLowerCase();
			    String jogador2 = leitor.nextLine().toLowerCase();

			    if (jogador1.equals("ataque") && jogador2.equals("ataque")) {
			        System.out.println("Aniquilacao mutua");
			    } else if (jogador1.equals("papel") && jogador2.equals("papel")) {
			        System.out.println("Ambos venceram");
			    } else if (jogador1.equals("pedra") && jogador2.equals("pedra")) {
			        System.out.println("Sem ganhador");
			    } else if (jogador1.equals("ataque")) {
			        System.out.println("Jogador 1 venceu");
			    } else if (jogador2.equals("ataque")) {
			        System.out.println("Jogador 2 venceu");
			    } else if (jogador1.equals("pedra") && jogador2.equals("papel")) {
			        System.out.println("Jogador 1 venceu");
			    } else if (jogador2.equals("pedra") && jogador1.equals("papel")) {
			        System.out.println("Jogador 2 venceu");
			    }
			   
			}
		}
        
    }
}