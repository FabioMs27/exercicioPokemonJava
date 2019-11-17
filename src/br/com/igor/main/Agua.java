package br.com.igor.main;


import br.com.igor.view.Utils;
/**
 * A classe Agua administra o tipo de Pokemon 
 * @author igor
 *
 */
public class Agua extends Pokemons{

	/**
	 * Construtor que recebe nome, tipo, nivel e experiencia do pokemon pela caixa de texto
	 * @param nome
	 * @param tipo
	 * @param nivel
	 * @param exp
	 */
	public Agua(String nome, int tipo, int nivel) {
		super(nome, tipo, nivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean chanceDeCapturar() {
		// TODO Auto-generated method stub
		
		double aux = 0.0;
		aux = Utils.random(0.0, 100.0);
		
		if(aux > 20.0) {
			return true;
		}else {
			return false;
		}
		
		
	}
	

}
