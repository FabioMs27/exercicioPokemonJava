package br.com.igor.main;
/**
 * Classe Ginasio onde ocorrem as batalhas e tem um lider.
 * @author fabioms
 *
 */
public class Ginasio {
	//Atributos
	private String nome;
	private Jogador lider;
	//Construtor
	/**
	 * Construtor da classe. Ela começa sem lider.
	 * @param nome nome do ginasio
	 */
	Ginasio(String nome){
		this.lider = null;
	}
	/**
	 * retorna o nome do ginasio.
	 * @return retorna o nome.
	 */
	//Métodos
	public String getNome() {
		return nome;
	}
	/**
	 * Altera o nome do ginsasio somente se não for vazio
	 * @param nome novo valor para o nome.
	 */
	public void setNome(String nome) {
		if(nome.isEmpty())
			throw new IllegalAccessError("Nome invalido!");
		this.nome = nome;
	}
	/**
	 * retorna o lider do ginasio.
	 * @return retorna o lider.
	 */
	public Jogador getLider() {
		return lider;
	}
	/**
	 * Altera o lider do ginasio.
	 * @param lider novo valor para o lider do ginasio.
	 */
	public void setLider(Jogador lider) {
		this.lider = lider;
	}
	
}
