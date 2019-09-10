/**
 * Classe que representar� os Jogadores, haver�o apenas 2 jogadores.
 * @author Equipe Java
 * @version Final 2008/6/7
 * @since Abril/2008.
 */
public class Jogador
{    

    
    /**
     * Atributo aonde ser� armazenada todas as Pe�as de um determinado jogador.
     */
    public Peca[] pecas;
    
    /**
     * Atributo que indica quantas pe�as o jogador j� colocou no tabuleiro (Max = 9).
     */
    public int contPecas = 0;
    
    /**
     * Constr�i um jogador instanciando suas Pe�as.
     * 
     */
    public Jogador()
    {
        pecas = new Peca[9];
    }
    
    /**
     * Atributo que mostra o n�mero de pe�as que o jogador possui no Tabuleiro.
     */
    public int pecasNoTab = 9;
    
    /**
     * Atributo que indica se � a vez ou n�o de jogar.
     */
    private boolean vez = true;
    
    /**
     * M�todo utilizado para modificar a vez do jogador.
     * @param vez Valor boolean.
     */
    public void setVez(boolean vez)
    {
    	this.vez = vez;
    }
    
    /**
     * M�todo utilizado para se obter a vez do jogador.
     * @return Retorna true se for a vez do Jogador ou false caso n�o seja.
     */
    public boolean getVez()
    {
    	return vez;
    }

   
    
   
}