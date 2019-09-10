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
	 * Coordenada Y da peça no tabuleiro (A - G).
	 */
    private char posY; 
    
    /**
     * Coordenada X da peça no tabuleiro (1 - 7).
     */
    private int posX;
    
    /**
     * Indica se a posição está ocupada ou não.
     */
    private boolean ocupada;
    
    /**
     * Indica a peça que está na posição.
     */
    private Peca atual = null;
    
    /**
     * Método utilizado para modificar a peça da posição.
     * @param atual Nova peça para a posição.
     */
    public void setPecaAtual(Peca atual)
    {
    	this.atual = atual;
    }
    
    /**
     * Método utilizado para se obter a peça da posição.
     * @return Retorna a peça atual da posição.
     */
    public Peca getPecaAtual()
    {
    	return atual;
    }
    
    

    /**
     * Constrói uma posição com suas as suas coordenadas X e Y.
     * 
     * @param posY Inicializa a Coordenada Y da peça no tabuleiro (A - G).
     * @param posX Inicializa a Coordenada X da peça no tabuleiro (1 - 7).
     * @param ocupada Indica se a posição está ocupada ou não (Verdadeiro ou Falso).
     */
    public Posicao(char posY, int posX, boolean ocupada)
    {
        this.posX = posX;
        this.posY = posY;
        this.ocupada = ocupada;
        this.setVisible(false);
    }
    
    /**
     * Método utilizado para se obter o valor da Coordenada Y da posição.
     * 
     * @return Retorna a posição da Coordenada Y da peça no Tabuleiro (A - G).
     */
    public char getPosY()
    {
        return posY;
    }
    
    /**
     * Método utilizado para modificar o valor da Coordenada Y da posição.
     *
     * @param posY Indica a nova Coordenada Y da peça.
     */
    public void setPosY(char posY)
    {
        this.posY = posY;          
    }
    
    /**
     * Método utilizado para se obter o valor da Coordenada X da posição.
     * 
     * 
     * @return Retorna a posição da Coordenada X da peça no Tabuleiro (1 - 7).
     */
    public int getPosX()
    {
        return posX;
    }
    
    /**
     * Método utilizado para modificar o valor da Coordenada X da posição.
     *
     * @param posX Indica a nova Coordenada X da peça.
     */
    public void setPosX(int posX)
    {
        this.posX = posX;
    }
    
    /**
     * Método utilizado para saber se a posição está ocupada ou não.
     * 
     * @return Retorna Verdadeiro se a posição estiver ocupada ou falso caso não esteja.
     */
    public boolean getOcupada()
    {
    	return ocupada;
    }
    
    /**
     * Método utilizado para modificar o atributo ocupada (Que indica se a posição está ocupada
     * ou não).
     *
     * @param valor Indica o valor que o campo ocupada irá receber (Verdadeiro ou Falso).
     */
    public void setOcupada(boolean valor)
    {
    	ocupada = valor;
    }
    
   
    
}
