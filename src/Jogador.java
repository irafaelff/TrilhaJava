/**
 * Classe que representará os Jogadores, haverão apenas 2 jogadores.
 * @author Equipe Java
 * @version Final 2008/6/7
 * @since Abril/2008.
 */
public class Jogador
{    

    
    /**
     * Atributo aonde será armazenada todas as Peças de um determinado jogador.
     */
    public Peca[] pecas;
    
    /**
     * Atributo que indica quantas peças o jogador já colocou no tabuleiro (Max = 9).
     */
    public int contPecas = 0;
    
    /**
     * Constrói um jogador instanciando suas Peças.
     * 
     */
    public Jogador()
    {
        pecas = new Peca[9];
    }
    
    /**
     * Atributo que mostra o número de peças que o jogador possui no Tabuleiro.
     */
    public int pecasNoTab = 9;
    
    /**
     * Atributo que indica se é a vez ou não de jogar.
     */
    private boolean vez = true;
    
    /**
     * Método utilizado para modificar a vez do jogador.
     * @param vez Valor boolean.
     */
    public void setVez(boolean vez)
    {
    	this.vez = vez;
    }
    
    /**
     * Método utilizado para se obter a vez do jogador.
     * @return Retorna true se for a vez do Jogador ou false caso não seja.
     */
    public boolean getVez()
    {
    	return vez;
    }

   
    
   
}