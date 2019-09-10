import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Classe responsável pelos créditos do jogo.
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Sobre implements ActionListener
{
	/**
	 * Construtor sem instruções.
	 */
	public Sobre(){}
	
	/**
	 * Logomarca da equipe.
	 */
	Icon logo = new ImageIcon("Arquivos/logo.gif");

	/**
	 * Método chamado quando se clica no Botão "Sobre" que está no menu.
	 * Exibe os créditos do jogo.
	 */
	public void actionPerformed (ActionEvent args)
	{
		String saida = "Trilha Java - Final\n" +
				"Equipe Java\n" +
				"Componentes :\n" +
				"      André Sousa\n" +
				"      Diogo Oliveira\n" +
				"      Igor Rafael\n" +
				"      Guilherme Junior\n" +
				"      Guilherme Remédio";
		JOptionPane.showMessageDialog(null, saida, "Sobre", 1, logo);
	}

	

}
