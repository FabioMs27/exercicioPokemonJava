package br.com.igor.main;


import br.com.igor.view.Utils;
/**
 * A classe Fogo administra o tipo de Pokemon 
 * @author igor
 *
 */
public class Fogo extends Pokemons{
	
	
	/**
	 * Construtor que recebe nome, tipo, nivel e experiencia do pokemon pela caixa de texto
	 * @param nome
	 * @param tipo
	 * @param nivel
	 * @param exp
	 */
	public Fogo(String nome, int tipo, int nivel) {
		super(nome, tipo, nivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean chanceDeCapturar() {
		// TODO Auto-generated method stub
		
		double aux = 0.0;
		for(int i = 0; i < 2; i++) {
			aux = Utils.random(0, 100.0);
		}
		if(aux >= 50.0) {
			return true;
		}else {
			return false;
		}

	}
	
}
