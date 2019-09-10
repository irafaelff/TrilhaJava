import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Classe que cont�m ajuda sobre as regras do jogo.
 * 
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */
public class Regras implements ActionListener 
{
	/**
	 * Construtor sem instru��es.
	 */
	public Regras(){}
	/**
	 * Logomarca da equipe.
	 */
	Icon logo = new ImageIcon("Arquivos/logo.gif");
	
	/**
	 * M�todo chamado quando se clica no Bot�o "Regras" que est� no menu.
	 * Exibe uma janela contendo as regras do jogo.
	 */
	public void actionPerformed(ActionEvent e)
	{
		String texto;
		texto = "Regras do jogo :\n" +
				"1- Cada jogador inicia com 9 pe�as e as distribui no tabuleiro.\n" +
				"2- O jogador movimenta 1 pe�a pela trilha a cada turno.\n" +
				"3- Se o jogador fizer uma sequ�ncia de 3 pe�as em uma trilha ele\n" +
				"cria um moinho podendo assim remover uma pe�a do oponente.\n" +
				"4- Quando restarem apenas 3 pe�as de um jogador ele tem o direito de\n" +
				"pular entre as trilhas podendo ir a qualquer localiza��o livre do\n" +
				"tabuleiro.\n" +
				"5- O objetivo do jogo � remover as pe�as do jogador advers�rio at� que\n" +
				"sobrem somente 2 pe�as.";
		JOptionPane.showMessageDialog(null, texto, "Regras", 1, logo);	
		
	}

}
