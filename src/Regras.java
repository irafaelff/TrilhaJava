import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Classe que contém ajuda sobre as regras do jogo.
 * 
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */
public class Regras implements ActionListener 
{
	/**
	 * Construtor sem instruções.
	 */
	public Regras(){}
	/**
	 * Logomarca da equipe.
	 */
	Icon logo = new ImageIcon("Arquivos/logo.gif");
	
	/**
	 * Método chamado quando se clica no Botão "Regras" que está no menu.
	 * Exibe uma janela contendo as regras do jogo.
	 */
	public void actionPerformed(ActionEvent e)
	{
		String texto;
		texto = "Regras do jogo :\n" +
				"1- Cada jogador inicia com 9 peças e as distribui no tabuleiro.\n" +
				"2- O jogador movimenta 1 peça pela trilha a cada turno.\n" +
				"3- Se o jogador fizer uma sequência de 3 peças em uma trilha ele\n" +
				"cria um moinho podendo assim remover uma peça do oponente.\n" +
				"4- Quando restarem apenas 3 peças de um jogador ele tem o direito de\n" +
				"pular entre as trilhas podendo ir a qualquer localização livre do\n" +
				"tabuleiro.\n" +
				"5- O objetivo do jogo é remover as peças do jogador adversário até que\n" +
				"sobrem somente 2 peças.";
		JOptionPane.showMessageDialog(null, texto, "Regras", 1, logo);	
		
	}

}
