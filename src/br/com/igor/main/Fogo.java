package br.com.igor.main;

import java.util.Random;
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
	Fogo(String nome, int tipo, int nivel, int exp) {
		super(nome, tipo, nivel, exp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean chanceDeCapturar() {
		// TODO Auto-generated method stub
		
		double aux = 0.0;
		for(int i = 0; i < 2; i++) {
			aux = random(0, 100.0);
		}
		if(aux >= 50.0) {
			return true;
		}else {
			return false;
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
}
