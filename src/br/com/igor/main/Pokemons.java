package br.com.igor.main;
/**
 * A classe Pokemons serve para administrar pokemons no sistema
 * @author igor
 *
 */
abstract public class Pokemons {
	
	protected String nome;
	protected int tipo;
	protected int fraqueza;
	protected int nivel;
	protected int exp;
	
	/**
	 * Esse Construtor recebe um nome para o pokemon, o tipo dele, o  nível e a experiencia
	 * @param nome
	 * @param tipo
	 * @param nivel
	 * @param exp
	 */
	Pokemons(String nome, int tipo, int nivel, int exp) {
		setNome(nome);
		setTipo(tipo);
		setNivel(nivel);
		setExp(exp);
	}
	/**
	 *  Esse método abstrato tem a funcao de dar uma chance de capturar um pokemon
	 * @return um valor se capturou um pokemon
	 */
	public abstract boolean chanceDeCapturar();
	
	/**
	 * Esse método retorna o nome do pokemon
	 * @return nome 
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
	 * Esse método retorna o tipo do pokemon
	 * @return retorna o tipo
	 */
	public int getTipo() {
		return tipo;
	}
	
	/**
	 * Esse método retorna o nivel do pokemon
	 * @return retorna o nível do pokemon
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Esse método privado que adiciona um nivel determinado para o pokemon
	 * @param nivel Valor do nível que o usuário digitou
	 */
	private void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * Esse método retorna a experiencia do pokemon
	 * @return experiencia do pokemon
	 */
	public int getExp() {
		return exp;
	}
	
	/**
	 * Esse método adiciona uma experiencia ao pokemon
	 * @param exp Valor da experiencia do pokemon
	 */
	public void setExp(int exp) {
		
		this.exp += exp;
		if(this.exp > 100) {
			this.exp -= 100;
			this.nivel++;
		}
	}
	/**
	 * retorna a fraqueza do POKEMON
	 * @return retorna o valor que representa a fraqueza do POKEMON.
	 */
	public int getFraqueza() {
		return this.fraqueza;
	}
	
	/**
	 * Esse método adiciona um tipo de pokemon que foi digitado na caixa de texto
	 * @param tipo Valor do tipo digitado
	 */
	public void setTipo(int tipo) {
		
		if(tipo > 3 || tipo <= 0) {
			throw new IllegalArgumentException("Tipo não existente no sistema!");
		}else {
			this.tipo = tipo;
			switch (tipo) {
			case 1: // tipo agua
				this.fraqueza = 3;
				break;
			case 2: // fogo
				this.fraqueza = 1;
				break;
			case 3: // vento
				this.fraqueza = 2;
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo);
			}
		}

	}
	/**
	 * Esse método mostra as informações do Pokemon
	 * @return Uma String com essas informações 
	 */
	@Override
	public String toString() {
		return "Pokemon\nNome:" + nome + "\nTipo:" + tipo + "\nNivel:" + nivel + "Exp:" + exp + "\n";
	}
	
	
}
