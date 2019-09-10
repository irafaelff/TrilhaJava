import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Clase que representará a peça do jogo, há apenas um tipo de peça, todas as peças do jogo
 * serão instanciadas a partir desta classe.
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
	 * Indica a Posição da Peça.
	 * 
	 */
    private Posicao pos; 
    /**
     * Indica o jogador a qual a peça pertence.
     */
    private Jogador jog;
    /**
     * Indica o jogador oponente.
     */
    private Jogador oponente;
   
    /**
     * Atributo que indica se a peça faz parte ou não de um Moinho.
     */
    private boolean moinho;
    
    /**
     * Constrói uma peça com suas coordenadas e sua imagem.
     * @param posY Coordenada Y da peça no Tabuleiro.
     * @param posX Coordenada X da peça no Tabuleiro.
     * @param imagem Imagem que irá representar a peça no tabuleiro.
     */
    public Peca(char posY, int posX, String imagem)
    {
    	pos = new Posicao(posY, posX, false);
    	super.setIcon(new ImageIcon(imagem));
    }   
    
    /**
     * Método utilizado para modificar o jogador da peça.
     * @param jog Jogador.
     */
    public void setJogador(Jogador jog)
    {
    	this.jog = jog;
    }
    
    /**
     * Método utilizado para se obter o jogador da peça.
     * @return Retorna um Jogador.
     */
    public Jogador getJogador()
    {
    	return jog;
    }
    
    /**
     * Método utilizado para modificar o jogador oponente da peça.
     * @param oponente Jogador oponente.
     */
    public void setOponente(Jogador oponente)
    {
    	this.oponente = oponente;
    }
    
    /**
     * Método utilizado para se obter o jogador oponente da peça. 
     * @return Retorna o Jogador oponente.
     */
    public Jogador getOponente()
    {
    	return oponente;
    }
   

   
   /**
    * Método utilizado para se obter a posição atual da peça.
    * 
    * @return Retorna a posição da Peça.
    */
   public Posicao getPos()
   {
	   return pos;
   }
   
   /**
    * Método utilizado para modificar a posição atual da peça.
    * @param pos Nova posição da peça.
    */
   public void setPos(Posicao pos)
   {
	   this.pos = pos;
   }
   
   /**
    * Método utilizado modificar o atributo que indica se a peça faz parte ou não de um
    * moinho.
    * 
    * @param valor Novo valor que o atributo moinho irá receber.
    */
   public void setMoinho(boolean valor)
   {
	   moinho = valor;
   }
   
   /**
    * Método utilizado para saber se a peça faz parte ou não de um moinho.
    * 
    * @return Retorna verdadeiro se a peça faz parte de um moinho, ou falso se não faz parte.
    */
   public boolean getMoinho()
   {
	   return moinho;
   }
    
    
}