/**
 * Classe que representará as possíveis validações do Jogo.
 * @author Equipe Java
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Validar 
{
	
	 /**
	  * Construtor sem instruções.
	  */
	
      public Validar()
      {}
     
      
      /**
	    * Método responsável pela validação do movimento normal de uma Peça.
	    *  
	    * @param posAtual Indica a posição atual aonde a peça se encontra.
	    * @param posDestino Indica a posição destino para qual a peça será movimentada.
	    * 
	    * @return Retorna verdadeiro se o movimento for aceito, senão retorna falso.
	    * 
	    */
	   public static boolean movimento(Posicao posAtual, Posicao posDestino)
	   {
	        boolean valido = false;
	        
	    	if((posAtual.getPosY() == 'A' && posAtual.getPosX() == 1) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 1) ||
	                (posDestino.getPosY() == 'A' && posDestino.getPosX() == 4)))
	        {
	            valido = true;
	        } 
	        else
	        if((posAtual.getPosY() == 'A' && posAtual.getPosX() == 4) && ((posDestino.getPosY() == 'A' && posDestino.getPosX() == 7) ||
	                (posDestino.getPosY() == 'B' && posDestino.getPosX() == 4)))
	        {
	            valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'A' && posAtual.getPosX() == 7) && ((posDestino.getPosY() == 'A' && posDestino.getPosX() == 4) ||
	                        (posDestino.getPosY() == 'D' && posDestino.getPosX() == 7)))
	        {
	            valido = true;   
	        }
	        else
	        if((posAtual.getPosY() == 'B' && posAtual.getPosX() == 2) && ((posDestino.getPosY() == 'B' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 2)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'B' && posAtual.getPosX() == 4) && ((posDestino.getPosY() == 'A' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'B' && posDestino.getPosX() == 2) ||
	                 (posDestino.getPosY() == 'B' && posDestino.getPosX() == 6) ||
	                 (posDestino.getPosY() == 'C' && posDestino.getPosX() == 4)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'B' && posAtual.getPosX() == 6) && ((posDestino.getPosY() == 'B' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 6)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'C' && posAtual.getPosX() == 3) && ((posDestino.getPosY() == 'C' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 3)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'C' && posAtual.getPosX() == 4) && ((posDestino.getPosY() == 'C' && posDestino.getPosX() == 3) ||
	                 (posDestino.getPosY() == 'C' && posDestino.getPosX() == 5) ||
	                 (posDestino.getPosY() == 'B' && posDestino.getPosX() == 4)))
	        {
	          valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'C' && posAtual.getPosX() == 5) && ((posDestino.getPosY() == 'C' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 5)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'D' && posAtual.getPosX() == 1) && ((posDestino.getPosY() == 'A' && posDestino.getPosX() == 1) ||
	                 (posDestino.getPosY() == 'G' && posDestino.getPosX() == 1) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 2)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'D' && posAtual.getPosX() == 2) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 1) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 3) ||
	                 (posDestino.getPosY() == 'B' && posDestino.getPosX() == 2) ||
	                 (posDestino.getPosY() == 'F' && posDestino.getPosX() == 2)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'D' && posAtual.getPosX() == 3) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 2) ||
	              (posDestino.getPosY() == 'C' && posDestino.getPosX() == 3) || 
	              (posDestino.getPosY() == 'E' && posDestino.getPosX() == 3)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'D' && posAtual.getPosX() == 5) && ((posDestino.getPosY() == 'C' && posDestino.getPosX() == 5) ||
	                 (posDestino.getPosY() == 'E' && posDestino.getPosX() == 5) || 
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 6)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'D' && posAtual.getPosX() == 6) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 5) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 7) ||
	                 (posDestino.getPosY() == 'B' && posDestino.getPosX() == 6) ||
	                 (posDestino.getPosY() == 'F' && posDestino.getPosX() == 6)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'D' && posAtual.getPosX() == 7) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 6) ||
	                 (posDestino.getPosY() == 'A' && posDestino.getPosX() == 7) ||
	                 (posDestino.getPosY() == 'G' && posDestino.getPosX() == 7)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'E' && posAtual.getPosX() == 3) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 3) ||
	                 (posDestino.getPosY() == 'E' && posDestino.getPosX() == 4)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'E' && posAtual.getPosX() == 4) && ((posDestino.getPosY() == 'E' && posDestino.getPosX() == 3) ||
	                 (posDestino.getPosY() == 'E' && posDestino.getPosX() == 5) || 
	                 (posDestino.getPosY() == 'F' && posDestino.getPosX() == 4)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'E' && posAtual.getPosX() == 5) && ((posDestino.getPosY() == 'E' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 5)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'F' && posAtual.getPosX() == 2) && ((posDestino.getPosY() == 'D' && posDestino.getPosX() == 2) ||
	                 (posDestino.getPosY() == 'F' && posDestino.getPosX() == 4)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'F' && posAtual.getPosX() == 4) && ((posDestino.getPosY() == 'F' && posDestino.getPosX() == 2) ||
	                 (posDestino.getPosY() == 'F' && posDestino.getPosX() == 6) ||
	                 (posDestino.getPosY() == 'E' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'G' && posDestino.getPosX() == 4)))
	        {
	           valido = true;
	        }
	        else
	        if((posAtual.getPosY() == 'F' && posAtual.getPosX() == 6) && ((posDestino.getPosY() == 'F' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 6)))
	        {
	           valido = true;
	        }
	    	if((posAtual.getPosY() == 'G' && posAtual.getPosX() == 1) && ((posDestino.getPosY() == 'G' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 1)))
	        {
	           valido = true;
	        }
	    	if((posAtual.getPosY() == 'G' && posAtual.getPosX() == 4) && ((posDestino.getPosY() == 'G' && posDestino.getPosX() == 1) ||
	                 (posDestino.getPosY() == 'G' && posDestino.getPosX() == 7) ||
	                 (posDestino.getPosY() == 'F' && posDestino.getPosX() == 4)))
	        {
	           valido = true;
	        }   
	    	if((posAtual.getPosY() == 'G' && posAtual.getPosX() == 7) && ((posDestino.getPosY() == 'G' && posDestino.getPosX() == 4) ||
	                 (posDestino.getPosY() == 'D' && posDestino.getPosX() == 7)))
	        {
	           valido = true;
	        }        
	        
	        return valido;
	   }
	   
	   /**
	    * Método responsável por dizer se a peça pode ou não se movimentar em relação a
	    * sua posição no tabuleiro.
	    * 
	    * @param pos Posição da peça que quer ser movida.
	    * @param coord Todas as Posições válidas do tabuleiro.
	    * @return Retorna true caso seja aprovado o movimento, caso contrário retorna false.
	    */
	   public static boolean podeMover(Posicao pos, Posicao coord[])
	   {
		   boolean valido = true;
		   
		   if(pos == coord[0])
		   {
			   if(coord[1].getOcupada() && coord[9].getOcupada())
			   {
				   valido = false;
			   }
		   }
		   else
		   if(pos == coord[1])
		   {
			   if(coord[0].getOcupada() && coord[2].getOcupada() && coord[4].getOcupada())
			   {
				   valido = false;
			   }
		  }
		  else
		  if(pos == coord[2])
		  {
			   if(coord[1].getOcupada() && coord[14].getOcupada())
			   {
				   valido = false;
			   }
		   }
		  else
		  if(pos == coord[3])
		  {
		      if(coord[10].getOcupada() && coord[4].getOcupada())
		      {
			       valido = false;
		      }
		  }
		  else
		  if(pos == coord[4])
		  {
		      if(coord[1].getOcupada() && coord[3].getOcupada() &&
		    		  coord[5].getOcupada() && coord[7].getOcupada())
		      {
			       valido = false;
		      }
		  }
		  else
		  if(pos == coord[5])
		  {
			    if(coord[4].getOcupada() && coord[13].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[6])
		  {
			    if(coord[11].getOcupada() && coord[7].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[7])
		  {
			    if(coord[4].getOcupada() && coord[6].getOcupada() && coord[8].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[8])
		  {
			    if(coord[7].getOcupada() && coord[12].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[9])
		  {
			    if(coord[0].getOcupada() && coord[10].getOcupada() && coord[21].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[10])
		  {
			    if(coord[3].getOcupada() && coord[9].getOcupada() &&
			    		coord[11].getOcupada() && coord[18].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[11])
		  {
			    if(coord[6].getOcupada() && coord[10].getOcupada() && coord[15].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[12])
		  {
			    if(coord[8].getOcupada() && coord[13].getOcupada() && coord[17].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[13])
		  {
			    if(coord[5].getOcupada() && coord[12].getOcupada() 
			    		&& coord[14].getOcupada() && coord[20].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[14])
		  {
			    if(coord[2].getOcupada() && coord[13].getOcupada() && coord[23].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[15])
		  {
			    if(coord[11].getOcupada() && coord[16].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[16])
		  {
			    if(coord[15].getOcupada() && coord[17].getOcupada() && coord[19].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[17])
		  {
			    if(coord[12].getOcupada() && coord[16].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[18])
		  {
			    if(coord[10].getOcupada() && coord[19].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[19])
		  {
			    if(coord[16].getOcupada() && coord[18].getOcupada() 
			    		&& coord[20].getOcupada() && coord[22].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[20])
		  {
			    if(coord[13].getOcupada() && coord[19].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[21])
		  {
			    if(coord[9].getOcupada() && coord[22].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[22])
		  {
			    if(coord[19].getOcupada() && coord[21].getOcupada() && coord[23].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  else
		  if(pos == coord[23])
		  {
			    if(coord[14].getOcupada() && coord[22].getOcupada())
			    {
		            valido = false;
			    }
		  }
		  
		  return valido;	  

	   }
	  
	   
	   /**
	    * Método utilizado para validar o movimento livre. 
	    * Apenas quando houverem 3 peças de um jogador no tabuleiro. A diferença do movimento livre é que
        * o jogador pode movimentar sua peça para qualquer posição livre do tabuleiro. 
	    * 
	    * @param posDestino Posição para qual a peça será movimentada.
	    * 
	    * @return Retorna Verdeiro caso o movimento tenha sido aprovado, ou falso caso não tenha sido aprovado.
	    */
	   public static boolean movimentoLivre(Posicao posDestino)
	   {
		    boolean valido = false;
	        
		    if(!posDestino.getOcupada()) // Se a posição destino não estiver ocupada.
		    {
		    	valido = true;
		    }
	        
	        return valido;
		   
	   }
	   
}
