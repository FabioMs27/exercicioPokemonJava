package br.com.igor.main;
import br.com.igor.view.View;;
/**
 * Classe Ginasio onde ocorrem as batalhas e tem um lider.
 * @author fabioms
 *
 */
public class Ginasio implements Batalhavel{
	//Atributos
	private String nome;
	private Jogador lider;
	private Pokemons campeao;
	//Construtor
	/**
	 * Construtor da classe. Ela começa sem lider.
	 * @param nome nome do ginasio
	 */
	public Ginasio(String nome){
		setNome(nome);
		this.lider = null;
		this.campeao = null;
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
	
	@Override
	public void batalhar(Jogador player1) {
		// TODO Auto-generated method stub
		//get pokemon
		Pokemons poke = player1.getPokemon(View.getInt(player1.getPokemons() + "Escolha: "));
		
		if(poke.getNivel() >= this.campeao.getNivel() + 3 || this.lider == null || poke.getTipo() == campeao.getFraqueza()) {
			this.campeao = poke;
			this.lider = player1;
			//Você é o novo líder!
			View.getMsg("Você é o líder!");
		
		}else{
			//Perdeu a batalha!
			View.getMsgError("Perdeu a batalha!");
		}
	}
	
}
