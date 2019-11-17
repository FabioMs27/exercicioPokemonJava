package br.com.igor.view;

import javax.swing.JOptionPane;
/**
 *  A classe View serve para mostrar mensagens e gerencia-las no sistema criado
 * @author igor
 *
 */
public abstract class View {
	
	/**
	 * Exibir uma mensagem para o usuario adicionar um valor de entrada 
	 * @param titulo Trás o titulo para ser adicionado na caixa de texto
	 * @param msg Trás a mensagem que será exibida na caixa de texto
	 * @return Retorna o valor que o usuário digitou 
	 */
	public static String getString(String msg) {
		String aux = JOptionPane.showInputDialog(null, msg);
		return aux;
	}
	/**
	 * Exibir uma mensagem para o usuario adicionar um valor de entrada 
	 * @param titulo Trás o titulo para ser adicionado na caixa de texto
	 * @param msg Trás a mensagem que será exibida na caixa de texto
	 * @return Retorna o valor inteiro que o usuário digitou 
	 */
	public static int getInt(String msg) {
		int aux = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
		return aux;
	}
	/**
	 * Exibi uma mensagem para o usuario 
	 * @param titulo Trás o titulo para ser adicionado na caixa de texto
	 * @param msg Trás a mensagem que será exibida na caixa de texto
	 * @return Não há retorno 
	 */
	public static void getMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg); 
	}
	/**
	 * Exibir uma mensagem de erro para o usuario
	 * @param titulo Trás o titulo para ser adicionado na caixa de texto
	 * @param msg Trás a mensagem que será exibida na caixa de texto
	 * @return Não há retorno 
	 */
	public static void getMsgError(String msg) {
		JOptionPane.showMessageDialog(null, msg, null, JOptionPane.INFORMATION_MESSAGE);
	}
}
