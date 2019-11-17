package br.com.igor.main;

import java.util.ArrayList;

/**
 * Essa classe tera toda estrutura do jogo.
 * @author fabioms
 *
 */
public class Jogo {
	//Atributos
	private ArrayList<Jogador>jogadores = new ArrayList<Jogador>();
	private ArrayList<Pokemons>pokemons = new ArrayList<Pokemons>();
	private ArrayList<Ginasio>ginasios = new ArrayList<Ginasio>();
	
	//Métodos
	/**
	 * adicionar jogadores para o ArrayList.
	 * @param valor um jogador a ser adicionado no sistema.
	 */
	public void addJogadores(Jogador valor) {
		if(jogadores.size() < 3)
			jogadores.add(valor);
	}
	
	/**
	 * adicionar pokemons para o ArrayList.
	 * @param valor um pokemons a ser adicionado no sistema.
	 */
	public void addPokemons(Pokemons valor) {
		pokemons.add(valor);
	}
	
	/**
	 * adicionar ginasios para o ArrayList.
	 * @param valor um ginasio a ser adicionado no sistema.
	 */
	public void addGinasio(Ginasio valor) {
		ginasios.add(valor);
	}
	
	/**
	 * lista de nomes de jogadores.
	 * @return uma string com o nome de todos os jogadores.
	 */
	public String getJogadores() {
		String msg = "";
		for (int i = 0; i < jogadores.size(); i++) {
			msg += (i+1) + " " + jogadores.get(i).getNome() + "\n";
		}
		return msg;
	}
	
	/**
	 * metodo em que o usuario manda um valor e recebe o jogador que corresponde ao mesmo.
	 * @param index a posição do jogador.
	 * @return um jogador escolhido pelo usuário.
	 */
	public Jogador getJogador(int index) {
		if(jogadores.get(index) == null)
			throw new IllegalArgumentException("numero invalido");
		return jogadores.get(index);
	}
	
	/**
	 * lista de nomes de pokemons.
	 * @return uma string com o nome de todos os pokemons.
	 */
	public String getPokemons() {
		String msg = "";
		for (int i = 0; i < pokemons.size(); i++) {
			msg += (i+1) + " " + pokemons.get(i) + "\n";
		}
		return msg;
	}
	
	/**
	 * metodo em que o usuario manda um valor e recebe o pokemon que corresponde ao mesmo.
	 * @param index a posição do pokemon.
	 * @return um pokemon escolhido pelo usuário.
	 */
	public Pokemons getPokemon(int index) {
		if(pokemons.get(index) == null)
			throw new IllegalArgumentException("numero invalido");
		return pokemons.get(index);
	}
	
	/**
	 * lista de nomes de ginasio.
	 * @return uma string com o nome de todos os jogadores.
	 */
	public String getGinasio() {
		String msg = "";
		for (int i = 0; i < ginasios.size(); i++) {
			msg += (i+1) + " " + ginasios.get(i).getNome() + "\n";
		}
		return msg;
	}
	
	/**
	 * metodo em que o usuario manda um valor e recebe o Ginasio que corresponde ao mesmo.
	 * @param index a posição do ginasio.
	 * @return um ginasio escolhido pelo usuário.
	 */
	public Ginasio getGinasio(int index) {
		if(ginasios.get(index) == null)
			throw new IllegalArgumentException("numero invalido");
		return ginasios.get(index);
	}
	
	/**
	 * Quantidade de Pokemons.
	 * @return a quantidade de Pokemons.
	 */
	public int getPokemonCount() {
		return this.pokemons.size();
	}
}
