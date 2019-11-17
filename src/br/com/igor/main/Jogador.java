package br.com.igor.main;
import java.util.Arrays;
import br.com.igor.view.View;
/**
 * A Classe Jogador administra jogadores do sistema
 * @author igor
 *
 */
public class Jogador {
	
	private String nome;
	private String senha;
	protected int contPokemon;
	Pokemons pokemons[] = {};
	
	/**
	 * Esse Construtor recebe uma string do nome do jogador, a senha do jogador e o pokemon primario do jogador
	 * @param nome
	 * @param senha
	 * @param pokemon
	 */
	public Jogador(String nome, String senha, Pokemons pokemon){
		setNome(nome);
		setSenha(senha);
		setPokemons(pokemon);
		setContPokemon(1);
	}
	
	/**
	 * Escolhe um pokemon que o usuario queria usar na batalha
	 * @param index a posição do pokemon escolhido
	 * @return retorna o pokemon.
	 */
	public Pokemons getPokemon(int index) {
		if(index >= 3)
			throw new IllegalArgumentException("Pokemon invalido!");
		return this.pokemons[index];
	}
	/**
	 * um menu de opção referentes aos pokemons do usuário.
	 * @return as opções em forma de string.
	 */
	public String getPokemons() {
		String msg = "";
		for (int i = 0; i < pokemons.length; i++) {
			msg += i + " " + pokemons[i] + "\n";
		}
		return msg;
	}
	
	/**
	 * Esse método retorna o nome do jogador
	 * @return nome do jogador
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Esse método adiciona um nome digitado na caixa de texto e atribui a nome
	 * @param Recebe o nome do valor digitado
	 */
	public void setNome(String nome) {
		if(nome.isBlank()) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}else {
			this.nome = nome;
		}
	}
	/**
	 * Esse método retorna a senha do Jogador
	 * @return senha do jogador
	 */
	public String getSenha() {
		return senha;
	}
	
	
	/**
	 * Esse método adiciona uma senha ao jogador
	 * @param senha
	 */
	public void setSenha(String senha) {
		
		if(senha.isBlank()) {
			throw new IllegalArgumentException("Senha não pode ser vazia!");
		}else {
			this.senha = senha;
		}
	}
	/**
	 * Esse método permite ao jogador capturar pokemons e adicionar em seu perfil
	 * @param pokemon Pokemon que deseja capturar
	 */
	public void capturar(Pokemons pokemon) {
		boolean aux;
		
		aux = pokemon.chanceDeCapturar();
		
		if(aux == true) {
			if(contPokemon < 3) {
				setPokemons(pokemon);
			}else {
				throw new IllegalArgumentException("Limite de pokemons excedido para capturar!");
			}
		}else {
			View.getMsg("Pokemon selvagem escapou!");
		}

	}
	/**
	 * Esse método permite adicionar uma contagem de pokemon
	 * @param contPokemon Valor atribuido a contagem do pokemon
	 */
	public void setContPokemon(int contPokemon) {
		this.contPokemon += contPokemon;
	}
	/**
	 * Esse método adiciona pokemons ao jogador
	 * @param pokemons 
	 */
	public void setPokemons(Pokemons pokemons) {
		
		if(contPokemon < 3) {
			this.pokemons[contPokemon] = pokemons;
			setContPokemon(contPokemon);
		}else {
			throw new IllegalArgumentException("Limite de Pokemons excedido!");
		}
		
		
	}
	/**
	 * Esse método retorna a contagem de Pokemons do Jogador
	 * @return contagem de Pokemons
	 */
	public int getContPokemon() {
		return contPokemon;
	}
	/**
	 * Esse método mostra as informações do Jogador
	 * @return uma String com as informações do Jogador
	 */
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", senha=" + senha + ", contPokemon=" + contPokemon + ", pokemons="
				+ Arrays.toString(pokemons) + "]";
	}
	
	
	
}
