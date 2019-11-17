package br.com.igor.main;
import br.com.igor.view.*;
public class Executora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void subMenu(Jogador player, Jogo jogo) {
		Boolean voltar = false;
		do {
			switch (View.getInt("1 - Caçar Pokemon\n2 - Acessar Ginásio\n3 - voltar\nEscolha: ")) {
			case 1:
				player.capturar(jogo.getPokemon((int)(Utils.random(0,jogo.getPokemonCount()))));
				break;
			case 2:
				jogo.getGinasio(View.getInt(jogo.getGinasio() + " Escolha: "));
				break;
			case 3:
				voltar = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		} while (!voltar);
	}
}
