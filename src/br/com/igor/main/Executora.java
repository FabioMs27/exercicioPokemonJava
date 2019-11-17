package br.com.igor.main;
import br.com.igor.view.*;
public class Executora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0;
		Jogo jogo = new Jogo();
		Jogador jogador = null;
		Ginasio ginasio = null;
		Pokemons pokemon = null;
		
		
		do {
			try {
				opcao = View.getInt("1 - Cadastrar Jogador\n"+ "2 - Cadastrar Ginásio\n"
						+"3 - Cadastrar Pokemon\n" + "4 - Acessar Pokemon\n"
						+"5 - Sair");
			} catch (Exception e) {
				// TODO: handle exception
				View.getMsgError(e.getMessage());
			}
			switch (opcao) {
			case 1:
				//jogador = Utils.criarJogador();
				//jogo.addJogadores(jogador);
				break;
			case 2:
				ginasio = Utils.criarGinasio();
				jogo.addGinasio(ginasio);
				break;
			case 3:
				//pokemon = Utils.criarPokemon();
				//jogo.addPokemons(pokemon);
				break;
			case 4:
				
				
				break;
			case 5:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
			
			
			
			
			
		}while(opcao != 5);
		
		
		
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
