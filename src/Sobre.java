import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Classe respons�vel pelos cr�ditos do jogo.
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Sobre implements ActionListener
{
	/**
	 * Construtor sem instru��es.
	 */
	public Sobre(){}
	
	/**
	 * Logomarca da equipe.
	 */
	Icon logo = new ImageIcon("Arquivos/logo.gif");

	/**
	 * M�todo chamado quando se clica no Bot�o "Sobre" que est� no menu.
	 * Exibe os cr�ditos do jogo.
	 */
	public void actionPerformed (ActionEvent args)
	{
		String saida = "Trilha Java - Final\n" +
				"Equipe Java\n" +
				"Componentes :\n" +
				"      Andr� Sousa\n" +
				"      Diogo Oliveira\n" +
				"      Igor Rafael\n" +
				"      Guilherme Junior\n" +
				"      Guilherme Rem�dio";
		JOptionPane.showMessageDialog(null, saida, "Sobre", 1, logo);
	}

	

}
