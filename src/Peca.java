import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Clase que representar� a pe�a do jogo, h� apenas um tipo de pe�a, todas as pe�as do jogo
 * ser�o instanciadas a partir desta classe.
 *
 * @author Equipe Java
 * @version Final 2008/6/7
 * @since Abril/2008.
 */
public class Peca extends JLabel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Indica a Posi��o da Pe�a.
	 * 
	 */
    private Posicao pos; 
    /**
     * Indica o jogador a qual a pe�a pertence.
     */
    private Jogador jog;
    /**
     * Indica o jogador oponente.
     */
    private Jogador oponente;
   
    /**
     * Atributo que indica se a pe�a faz parte ou n�o de um Moinho.
     */
    private boolean moinho;
    
    /**
     * Constr�i uma pe�a com suas coordenadas e sua imagem.
     * @param posY Coordenada Y da pe�a no Tabuleiro.
     * @param posX Coordenada X da pe�a no Tabuleiro.
     * @param imagem Imagem que ir� representar a pe�a no tabuleiro.
     */
    public Peca(char posY, int posX, String imagem)
    {
    	pos = new Posicao(posY, posX, false);
    	super.setIcon(new ImageIcon(imagem));
    }   
    
    /**
     * M�todo utilizado para modificar o jogador da pe�a.
     * @param jog Jogador.
     */
    public void setJogador(Jogador jog)
    {
    	this.jog = jog;
    }
    
    /**
     * M�todo utilizado para se obter o jogador da pe�a.
     * @return Retorna um Jogador.
     */
    public Jogador getJogador()
    {
    	return jog;
    }
    
    /**
     * M�todo utilizado para modificar o jogador oponente da pe�a.
     * @param oponente Jogador oponente.
     */
    public void setOponente(Jogador oponente)
    {
    	this.oponente = oponente;
    }
    
    /**
     * M�todo utilizado para se obter o jogador oponente da pe�a. 
     * @return Retorna o Jogador oponente.
     */
    public Jogador getOponente()
    {
    	return oponente;
    }
   

   
   /**
    * M�todo utilizado para se obter a posi��o atual da pe�a.
    * 
    * @return Retorna a posi��o da Pe�a.
    */
   public Posicao getPos()
   {
	   return pos;
   }
   
   /**
    * M�todo utilizado para modificar a posi��o atual da pe�a.
    * @param pos Nova posi��o da pe�a.
    */
   public void setPos(Posicao pos)
   {
	   this.pos = pos;
   }
   
   /**
    * M�todo utilizado modificar o atributo que indica se a pe�a faz parte ou n�o de um
    * moinho.
    * 
    * @param valor Novo valor que o atributo moinho ir� receber.
    */
   public void setMoinho(boolean valor)
   {
	   moinho = valor;
   }
   
   /**
    * M�todo utilizado para saber se a pe�a faz parte ou n�o de um moinho.
    * 
    * @return Retorna verdadeiro se a pe�a faz parte de um moinho, ou falso se n�o faz parte.
    */
   public boolean getMoinho()
   {
	   return moinho;
   }
    
    
}