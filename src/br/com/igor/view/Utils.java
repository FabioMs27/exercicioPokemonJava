package br.com.igor.view;
import javax.swing.JOptionPane;

import br.com.igor.main.*;


import javax.swing.JOptionPane;

import br.com.igor.main.*;

<<<<<<< Updated upstream
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
	
	static public void acessarJogador(Jogo jogo) {
		try {
			jogo.getJogador(View.getInt(jogo.getJogadores() + "escolha o jogador: "));
			//submenu
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
=======
public abstract class Utils {
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	
>>>>>>> Stashed changes
}
