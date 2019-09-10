import javax.swing.JButton;
/**
 * Classe que representa as coordenadas X e Y no tabuleiro.
 *
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Posicao extends JButton
{

	private static final long serialVersionUID = 1L;

	/**
	 * Coordenada Y da pe�a no tabuleiro (A - G).
	 */
    private char posY; 
    
    /**
     * Coordenada X da pe�a no tabuleiro (1 - 7).
     */
    private int posX;
    
    /**
     * Indica se a posi��o est� ocupada ou n�o.
     */
    private boolean ocupada;
    
    /**
     * Indica a pe�a que est� na posi��o.
     */
    private Peca atual = null;
    
    /**
     * M�todo utilizado para modificar a pe�a da posi��o.
     * @param atual Nova pe�a para a posi��o.
     */
    public void setPecaAtual(Peca atual)
    {
    	this.atual = atual;
    }
    
    /**
     * M�todo utilizado para se obter a pe�a da posi��o.
     * @return Retorna a pe�a atual da posi��o.
     */
    public Peca getPecaAtual()
    {
    	return atual;
    }
    
    

    /**
     * Constr�i uma posi��o com suas as suas coordenadas X e Y.
     * 
     * @param posY Inicializa a Coordenada Y da pe�a no tabuleiro (A - G).
     * @param posX Inicializa a Coordenada X da pe�a no tabuleiro (1 - 7).
     * @param ocupada Indica se a posi��o est� ocupada ou n�o (Verdadeiro ou Falso).
     */
    public Posicao(char posY, int posX, boolean ocupada)
    {
        this.posX = posX;
        this.posY = posY;
        this.ocupada = ocupada;
        this.setVisible(false);
    }
    
    /**
     * M�todo utilizado para se obter o valor da Coordenada Y da posi��o.
     * 
     * @return Retorna a posi��o da Coordenada Y da pe�a no Tabuleiro (A - G).
     */
    public char getPosY()
    {
        return posY;
    }
    
    /**
     * M�todo utilizado para modificar o valor da Coordenada Y da posi��o.
     *
     * @param posY Indica a nova Coordenada Y da pe�a.
     */
    public void setPosY(char posY)
    {
        this.posY = posY;          
    }
    
    /**
     * M�todo utilizado para se obter o valor da Coordenada X da posi��o.
     * 
     * 
     * @return Retorna a posi��o da Coordenada X da pe�a no Tabuleiro (1 - 7).
     */
    public int getPosX()
    {
        return posX;
    }
    
    /**
     * M�todo utilizado para modificar o valor da Coordenada X da posi��o.
     *
     * @param posX Indica a nova Coordenada X da pe�a.
     */
    public void setPosX(int posX)
    {
        this.posX = posX;
    }
    
    /**
     * M�todo utilizado para saber se a posi��o est� ocupada ou n�o.
     * 
     * @return Retorna Verdadeiro se a posi��o estiver ocupada ou falso caso n�o esteja.
     */
    public boolean getOcupada()
    {
    	return ocupada;
    }
    
    /**
     * M�todo utilizado para modificar o atributo ocupada (Que indica se a posi��o est� ocupada
     * ou n�o).
     *
     * @param valor Indica o valor que o campo ocupada ir� receber (Verdadeiro ou Falso).
     */
    public void setOcupada(boolean valor)
    {
    	ocupada = valor;
    }
    
   
    
}
