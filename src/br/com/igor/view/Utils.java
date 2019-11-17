package br.com.igor.view;
import java.util.Random;
import javax.swing.JOptionPane;

import br.com.igor.main.*;
/**
 * A classe Utils serve para gerenciar os inputs do Usuário
 * @author igor
 *
 */
public abstract class Utils {
	
	/**
	 * adiciona um jogador no sistema atravez de inputs do Usuário.
	 * @param jogo o jogo onde está a estrutura do projeto.
	 * @return o jogador novo apartir de inputs do usuário
	 */
	static public Jogador criarJogador(Jogo jogo) {
		Jogador jogador = null;
		
		try {
			jogador = new Jogador(
					View.getString("Digite seu nome: "),
					View.getString("Digite a senha: "),
					jogo.getPokemon(View.getInt(jogo.getPokemons() + "Escolha o pokemon: ")));
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.getMsgError(e.getMessage());
		}
		return jogador;
	}
	
	/**
	 * O método Cria um pokemon a partir de inputs do Usuário
	 * @return o pokemon criado pelo personagem
	 */
	static public Pokemons criarPokemon() {
		Pokemons pokemon = null;
		
		
		try {
			switch (Integer.parseInt(JOptionPane.showInputDialog("1 - Agua\n2 - Fogo\n3 - vento\n escolha: "))) {
			case 1:
				pokemon = new Agua(
						View.getString("Digite o nome do Pokemon: "),
						1,
						0);
				break;
			case 2:
				pokemon = new Fogo(
						View.getString("Digite o nome do Pokemon: "),
						2,
						0);
				break;
			case 3:
				pokemon = new Vento(
						View.getString("Digite o nome do Pokemon: "),
						3,
						0);
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			View.getMsgError(e.getMessage());
		}
		
		return pokemon;
	}
	/**
	 * O método acessa as informações do jogador escolhido pelo Usuario
	 * @param jogo onde está a estrutura do projeto
	 */
	static public void acessarJogador(Jogo jogo) {
		try {
			Jogador player = jogo.getJogador(View.getInt(jogo.getJogadores() + "escolha o jogador: "));
			//submenu
			
			Executora.subMenu(player, jogo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	/**
	 * O método random randomiza um numero recenbendo dois numero como parametro
	 * @param min
	 * @param max
	 * @return o numero escolhido no metodo randomico
	 */
	public static double random(double min, double max) {
		Random random = new Random();
		
		double aux = max - min;
		double scaled = random.nextDouble() * aux;
		double shifted = scaled + min;
		double finalValue = Math.round(shifted * 100.0) / 100.00;
		
		return finalValue;		
		
	}

	/**
	 * O método cria ginásio no sistema por inputs do Usuário
	 * @return o ginásio criado pelo usuário
	 */
	public static Ginasio criarGinasio() {
		Ginasio ginasio = null;
		try {
			String nome = View.getString("Digite o nome do Ginasio:");
			ginasio = new Ginasio(nome);
		} catch (Exception e) {
			// TODO: handle exception
			View.getMsgError(e.getMessage());
		}
		return ginasio;
	}
	
}
