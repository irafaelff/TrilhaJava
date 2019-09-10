/**
 * Classe para validar regras do moinho.
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Moinho 
{
	/**
	 * Contrutor sem instruções.
	 */
	public Moinho(){}
	
	
	/**
	 * Cria um moinho ou não a partir de uma jogada. 
	 * 
	 * @param posDest Posição destino de uma peça.
	 * @param coord Todas as posições do Tabuleiro.
	 * @param jogador Jogador dono da peça.
	 * @return Retorna verdadeiro caso forme um moinho, caso contrário retorna falso.
	 */
	 public static boolean checaMoinho(Posicao posDest, Posicao coord[], Jogador jogador)
	   {
		   boolean valido = false;
		   if(posDest == coord[0])
		   {
			   if(coord[9].getOcupada() && coord[21].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[9], coord[21]))
				   {
					   ativaMoinho(coord[0], coord[9], coord[21]);
					   valido = true;
				   }
			   }
			   if(coord[1].getOcupada() && coord[2].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[1], coord[2]))
				   {
					   ativaMoinho(coord[0], coord[1], coord[2]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[1])
		   {
			   if(coord[0].getOcupada() && coord[2].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[0], coord[2]))
				   {
					   ativaMoinho(coord[0], coord[1], coord[2]);
					   valido = true;
				   }
			   }
			   if(coord[4].getOcupada() && coord[7].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[4], coord[7]))
				   {
					   ativaMoinho(coord[1], coord[4], coord[7]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[2])
		   {
			   if(coord[0].getOcupada() && coord[1].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[0], coord[1]))
				   {
					   ativaMoinho(coord[0], coord[1], coord[2]);
					   valido = true;
				   }
			   }
			   if(coord[14].getOcupada() && coord[23].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[14], coord[23]))
				   {
					   ativaMoinho(coord[2], coord[14], coord[23]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[3])
		   {
			   if(coord[4].getOcupada() && coord[5].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[4], coord[5]))
				   {
					   ativaMoinho(coord[3], coord[4], coord[5]);
					   valido = true;
				   }
			   }
			   if(coord[10].getOcupada() && coord[18].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[10], coord[18]))
				   {
					   ativaMoinho(coord[3], coord[10], coord[18]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[4])
		   {
			   if(coord[3].getOcupada() && coord[5].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[3], coord[5]))
				   {
					   ativaMoinho(coord[3], coord[4], coord[5]);
					   valido = true;
				   }
			   }
			   if(coord[1].getOcupada() && coord[7].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[1], coord[7]))
				   {
					   ativaMoinho(coord[1], coord[4], coord[7]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[5])
		   {
			   if(coord[3].getOcupada() && coord[4].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[3], coord[4]))
				   {
					   ativaMoinho(coord[5], coord[3], coord[4]);
					   valido = true;
				   }
			   }
			   if(coord[13].getOcupada() && coord[20].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[13], coord[20]))
				   {
					   ativaMoinho(coord[5], coord[13], coord[20]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[6])
		   {
			   if(coord[7].getOcupada() && coord[8].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[7], coord[8]))
				   {
					   ativaMoinho(coord[6], coord[7], coord[8]);
					   valido = true;
				   }
			   }
			   if(coord[11].getOcupada() && coord[15].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[11], coord[15]))
				   {
					   ativaMoinho(coord[6], coord[11], coord[15]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[7])
		   {
			   if(coord[6].getOcupada() && coord[8].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[6], coord[8]))
				   {
					   ativaMoinho(coord[6], coord[7], coord[8]);
					   valido = true;
				   }
			   }
			   if(coord[1].getOcupada() && coord[4].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[1], coord[4]))
				   {
					   ativaMoinho(coord[1], coord[4], coord[7]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[8])
		   {
			   if(coord[6].getOcupada() && coord[7].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[6], coord[7]))
				   {
					   ativaMoinho(coord[6], coord[7], coord[8]);
					   valido = true;
				   }
			   }
			   if(coord[12].getOcupada() && coord[17].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[12], coord[17]))
				   {
					   ativaMoinho(coord[8], coord[12], coord[17]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[9])
		   {
			   if(coord[10].getOcupada() && coord[11].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[10], coord[11]))
				   {
					   ativaMoinho(coord[9], coord[10], coord[11]);
					   valido = true;
				   }
			   }
			   if(coord[0].getOcupada() && coord[21].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[0], coord[21]))
				   {
					   ativaMoinho(coord[0], coord[9], coord[21]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[10])
		   {
			   if(coord[9].getOcupada() && coord[11].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[9], coord[11]))
				   {
					   ativaMoinho(coord[9], coord[10], coord[11]);
					   valido = true;
				   }
			   }
			   if(coord[3].getOcupada() && coord[18].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[3], coord[18]))
				   {
					   ativaMoinho(coord[3], coord[10], coord[18]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[11])
		   {
			   if(coord[9].getOcupada() && coord[10].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[9], coord[10]))
				   {
					   ativaMoinho(coord[9], coord[10], coord[11]);
					   valido = true;
				   }
			   }
			   if(coord[6].getOcupada() && coord[15].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[6], coord[15]))
				   {
					   ativaMoinho(coord[6], coord[11], coord[15]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[12])
		   {
			   if(coord[13].getOcupada() && coord[14].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[13], coord[14]))
				   {
					   ativaMoinho(coord[12], coord[13], coord[14]);
					   valido = true;
				   }
			   }
			   if(coord[8].getOcupada() && coord[17].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[8], coord[17]))
				   {
					   ativaMoinho(coord[8], coord[12], coord[17]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[13])
		   {
			   if(coord[12].getOcupada() && coord[14].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[12], coord[14]))
				   {
					   ativaMoinho(coord[12], coord[13], coord[14]);
					   valido = true;
				   }
			   }
			   if(coord[5].getOcupada() && coord[20].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[5], coord[20]))
				   {
					   ativaMoinho(coord[5], coord[13], coord[20]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[14])
		   {
			   if(coord[12].getOcupada() && coord[13].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[12], coord[13]))
				   {
					   ativaMoinho(coord[12], coord[13], coord[14]);
					   valido = true;
				   }
			   }
			   if(coord[2].getOcupada() && coord[23].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[2], coord[23]))
				   {
					   ativaMoinho(coord[2], coord[14], coord[23]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[15])
		   {
			   if(coord[16].getOcupada() && coord[17].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[16], coord[17]))
				   {
					   ativaMoinho(coord[15], coord[16], coord[17]);
					   valido = true;
				   }
			   }
			   if(coord[6].getOcupada() && coord[11].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[6], coord[11]))
				   {
					   ativaMoinho(coord[6], coord[11], coord[15]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[16])
		   {
			   if(coord[15].getOcupada() && coord[17].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[15], coord[17]))
				   {
					   ativaMoinho(coord[15], coord[16], coord[17]);
					   valido = true;
				   }
			   }
			   if(coord[19].getOcupada() && coord[22].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[19], coord[22]))
				   {
					   ativaMoinho(coord[16], coord[19], coord[22]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[17])
		   {
			   if(coord[15].getOcupada() && coord[16].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[15], coord[16]))
				   {
					   ativaMoinho(coord[15], coord[16], coord[17]);
					   valido = true;
				   }
			   }
			   if(coord[8].getOcupada() && coord[12].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[8], coord[12]))
				   {
					   ativaMoinho(coord[8], coord[12], coord[17]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[18])
		   {
			   if(coord[19].getOcupada() && coord[20].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[19], coord[20]))
				   {
					   ativaMoinho(coord[18], coord[19], coord[20]);
					   valido = true;
				   }
			   }
			   if(coord[3].getOcupada() && coord[10].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[3], coord[10]))
				   {
					   ativaMoinho(coord[3], coord[10], coord[18]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[19])
		   {
			   if(coord[18].getOcupada() && coord[20].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[18], coord[20]))
				   {
					   ativaMoinho(coord[18], coord[19], coord[20]);
					   valido = true;
				   }
			   }
			   if(coord[16].getOcupada() && coord[22].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[16], coord[22]))
				   {
					   ativaMoinho(coord[16], coord[19], coord[22]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[20])
		   {
			   if(coord[18].getOcupada() && coord[19].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[18], coord[19]))
				   {
					   ativaMoinho(coord[18], coord[19], coord[20]);
					   valido = true;
				   }
			   }
			   if(coord[5].getOcupada() && coord[13].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[5], coord[13]))
				   {
					   ativaMoinho(coord[5], coord[13], coord[20]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[21])
		   {
			   if(coord[22].getOcupada() && coord[23].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[22], coord[23]))
				   {
					   ativaMoinho(coord[21], coord[22], coord[23]);
					   valido = true;
				   }
			   }
			   if(coord[0].getOcupada() && coord[9].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[0], coord[9]))
				   {
					   ativaMoinho(coord[0], coord[9], coord[21]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[22])
		   {
			   if(coord[21].getOcupada() && coord[23].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[21], coord[23]))
				   {
					   ativaMoinho(coord[21], coord[22], coord[23]);
					   valido = true;
				   }
			   }
			   if(coord[16].getOcupada() && coord[19].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[16], coord[19]))
				   {
					   ativaMoinho(coord[16], coord[19], coord[22]);
					   valido = true;
				   }
			   }   
		   }
		   else if(posDest == coord[23])
		   {
			   if(coord[21].getOcupada() && coord[22].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[21], coord[22]))
				   {
					   ativaMoinho(coord[21], coord[22], coord[23]);
					   valido = true;
				   }
			   }
			   if(coord[2].getOcupada() && coord[14].getOcupada())
			   {
				   if(mesmoJogador(posDest, coord[2], coord[14]))
				   {
					   ativaMoinho(coord[2], coord[14], coord[23]);
					   valido = true;
				   }
			   }   
		   }
		   
		   return valido;
		   
	   }
	   
	 
	 
	  /**
	   * Desfaz um moinho ou não a partir de uma jogada.
	   * 
	   * @param posAtual Posicão de partida de uma peça.
	   * @param coord Todas as posições do tabuleiro.
	   * @param jogador Jogador dono da peça.
	   */
	   public static void retiraMoinho(Posicao posAtual, Posicao coord[], Jogador jogador)
	   {
		   if(posAtual == coord[0] && coord[0].getPecaAtual().getMoinho())
		   {
			  if(coord[9].getOcupada() && coord[21].getOcupada())
			  {
			 	 if(mesmoJogador(posAtual, coord[9], coord[21]))
				  {
		        	   desativaMoinho(coord, coord[10], coord[11], posAtual, coord[9]);
		        	   desativaMoinho(coord, coord[22], coord[23], posAtual, coord[21]);
			      }  
			 }
			 if(coord[1].getOcupada() && coord[2].getOcupada())
			 {
			 	if(mesmoJogador(posAtual, coord[1], coord[2]))
		        {
			 		desativaMoinho(coord, coord[4], coord[7], posAtual, coord[1]);
			 		desativaMoinho(coord, coord[14], coord[23], posAtual, coord[2]);
			    }
			 }
		   } 
		   else if(posAtual == coord[1] && coord[1].getPecaAtual().getMoinho())
		   {
			   if(coord[0].getOcupada() && coord[2].getOcupada())
		  	   {
			   	  if(mesmoJogador(posAtual, coord[0], coord[2]))
				  {
			   		desativaMoinho(coord, coord[9], coord[21], posAtual, coord[0]);
			   		desativaMoinho(coord, coord[14], coord[23], posAtual, coord[2]);
				  }
			   }  
			    if(coord[4].getOcupada() && coord[7].getOcupada())
			  	 {
					 if(mesmoJogador(posAtual, coord[4], coord[7]))
			        {
						 desativaMoinho(coord, coord[3], coord[5], posAtual, coord[4]);
						 desativaMoinho(coord, coord[6], coord[8], posAtual, coord[7]);
				    }
				}
		   } 
		   else if(posAtual == coord[2] && coord[2].getPecaAtual().getMoinho())
		   {
			   if(coord[0].getOcupada() && coord[1].getOcupada())
		  	   {
				  if(mesmoJogador(posAtual, coord[0], coord[1]))
				  {
					  desativaMoinho(coord, coord[9], coord[21], posAtual, coord[0]);
					  desativaMoinho(coord, coord[4], coord[7], posAtual, coord[1]);
				  }
			   }  
			   if(coord[14].getOcupada() && coord[23].getOcupada())
			   {
					 if(mesmoJogador(posAtual, coord[14], coord[23]))
			         {
						 desativaMoinho(coord, coord[12], coord[13], posAtual, coord[14]);
						 desativaMoinho(coord, coord[21], coord[22], posAtual, coord[23]);
			         }
		       }
		   }
		   else if(posAtual == coord[3] && coord[3].getPecaAtual().getMoinho())
		   {
			   if(coord[4].getOcupada() && coord[5].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[4], coord[5]))
				  {
					  desativaMoinho(coord, coord[1], coord[7], posAtual, coord[4]);
					  desativaMoinho(coord, coord[13], coord[20], posAtual, coord[5]);
					 
				  }		
			  }  
			 if(coord[10].getOcupada() && coord[18].getOcupada())
			  {	 
					 if(mesmoJogador(posAtual, coord[10], coord[18]))
					 {
						 desativaMoinho(coord, coord[9], coord[11], posAtual, coord[10]);
						 desativaMoinho(coord, coord[19], coord[20], posAtual, coord[18]);
					 }
				  }
			   }
		   else if(posAtual == coord[4] && coord[4].getPecaAtual().getMoinho())
		   {
			   if(coord[1].getOcupada() && coord[7].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[1], coord[7]))
				  {
					  desativaMoinho(coord, coord[0], coord[2], posAtual, coord[1]);
					  desativaMoinho(coord, coord[6], coord[8], posAtual, coord[7]);		 
				  }
		       }  
			   if(coord[3].getOcupada() && coord[5].getOcupada())
			  {
					 if(mesmoJogador(posAtual, coord[3], coord[5]))
					 { 
						 desativaMoinho(coord, coord[10], coord[18], posAtual, coord[3]);
						 desativaMoinho(coord, coord[13], coord[20], posAtual, coord[5]);
					 }
				  }
			  }
		   else if(posAtual == coord[5] && coord[5].getPecaAtual().getMoinho())
		   {
			   if(coord[3].getOcupada() && coord[4].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[3], coord[4]))
				  {
					  desativaMoinho(coord, coord[10], coord[18], posAtual, coord[3]);
					  desativaMoinho(coord, coord[1], coord[7], posAtual, coord[4]);
					 
				  }
			 }  
			 if(coord[13].getOcupada() && coord[20].getOcupada())
			 {
				 	if(mesmoJogador(posAtual, coord[13], coord[20]))
				 	{
				 		desativaMoinho(coord, coord[12], coord[14], posAtual, coord[13]);
				 		desativaMoinho(coord, coord[18], coord[19], posAtual, coord[20]);
					 }
				  }
			   }
		   else if(posAtual == coord[6] && coord[6].getPecaAtual().getMoinho())
		   {
			   if(coord[11].getOcupada() && coord[15].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[11], coord[15]))
				  {
					  desativaMoinho(coord, coord[9], coord[10], posAtual, coord[11]);
					  desativaMoinho(coord, coord[16], coord[17], posAtual, coord[15]);
				  }
			   }  
			   if(coord[7].getOcupada() && coord[8].getOcupada())
			   {
					 if(mesmoJogador(posAtual, coord[7], coord[8]))
					 {
						 desativaMoinho(coord, coord[1], coord[4], posAtual, coord[7]);
						 desativaMoinho(coord, coord[12], coord[17], posAtual, coord[8]);
						
					 }
			  }
		   }
		   else if(posAtual == coord[7] && coord[7].getPecaAtual().getMoinho())
		   {
			   if(coord[1].getOcupada() && coord[4].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[1], coord[4]))
				  {
					  desativaMoinho(coord, coord[0], coord[2], posAtual, coord[1]);
					  desativaMoinho(coord, coord[3], coord[5], posAtual, coord[4]);
					 
				  }
			   }  
			  if(coord[6].getOcupada() && coord[8].getOcupada())
			  { 
					 if(mesmoJogador(posAtual, coord[6], coord[8]))
					 {
						 desativaMoinho(coord, coord[11], coord[15], posAtual, coord[6]);
						 desativaMoinho(coord, coord[12], coord[17], posAtual, coord[8]);
					 }
				  }
			   }
		   else if(posAtual == coord[8] && coord[8].getPecaAtual().getMoinho())
		   {
			   if(coord[6].getOcupada() && coord[7].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[6], coord[7]))
				  {
					  desativaMoinho(coord, coord[11], coord[15], posAtual, coord[6]);
					  desativaMoinho(coord, coord[1], coord[4], posAtual, coord[7]);
				  	}
				  }  
				  if(coord[12].getOcupada() && coord[17].getOcupada())
				  {
					  if(mesmoJogador(posAtual, coord[12], coord[17]))
					  {
						  desativaMoinho(coord, coord[13], coord[14], posAtual, coord[12]);
						  desativaMoinho(coord, coord[15], coord[16], posAtual, coord[17]);
					  }
				  }
			   }
		   else if(posAtual == coord[9] && coord[9].getPecaAtual().getMoinho())
		   {
			   if(coord[0].getOcupada() && coord[21].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[0], coord[21]))
				  {
					  desativaMoinho(coord, coord[1], coord[2], posAtual, coord[0]);
					  desativaMoinho(coord, coord[22], coord[23], posAtual, coord[21]);
				   }
			  }  
			      if(coord[10].getOcupada() && coord[11].getOcupada())
				  {
					 	if(mesmoJogador(posAtual, coord[10], coord[11]))
					 	{
					 		desativaMoinho(coord, coord[3], coord[18], posAtual, coord[10]);
					 		desativaMoinho(coord, coord[6], coord[15], posAtual, coord[11]);					 		
					 	}
				  }
		   }
		   else if(posAtual == coord[10] && coord[10].getPecaAtual().getMoinho())
		   {
			   if(coord[9].getOcupada() && coord[11].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[9], coord[11]))
				  {
					  desativaMoinho(coord, coord[0], coord[21], posAtual, coord[9]);
					  desativaMoinho(coord, coord[6], coord[15], posAtual, coord[11]);
				  }
			  }  
			    if(coord[3].getOcupada() && coord[18].getOcupada())
				 {
					 if(mesmoJogador(posAtual, coord[3], coord[18]))
					 {
						 desativaMoinho(coord, coord[4], coord[15], posAtual, coord[3]);
						 desativaMoinho(coord, coord[19], coord[20], posAtual, coord[18]);
					 }
				  }
		   }
		   else if(posAtual == coord[11] && coord[11].getPecaAtual().getMoinho())
		   {
			   if(coord[6].getOcupada() && coord[15].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[6], coord[15]))
				  {
					  desativaMoinho(coord, coord[7], coord[8], posAtual, coord[6]);
					  desativaMoinho(coord, coord[16], coord[17], posAtual, coord[15]);
				  }
			   }  
			    if(coord[9].getOcupada() && coord[10].getOcupada())
				 {
					 if(mesmoJogador(posAtual, coord[9], coord[10]))
			    	 {
						 desativaMoinho(coord, coord[0], coord[21], posAtual, coord[9]);
						 desativaMoinho(coord, coord[5], coord[18], posAtual, coord[10]);
			    	}
				 }
		   }
		   else if(posAtual == coord[12] && coord[12].getPecaAtual().getMoinho())
		   {
			   if(coord[8].getOcupada() && coord[17].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[8], coord[17]))
				  {
					  desativaMoinho(coord, coord[6], coord[7], posAtual, coord[8]);
					  desativaMoinho(coord, coord[15], coord[16], posAtual, coord[17]);
					  
				  }
			  }  
			 if(coord[13].getOcupada() && coord[14].getOcupada())
			 {
					 if(mesmoJogador(posAtual, coord[13], coord[14]))
					 {
						 desativaMoinho(coord, coord[5], coord[20], posAtual, coord[13]);
						 desativaMoinho(coord, coord[15], coord[16], posAtual, coord[14]);
					 }
			 }
		   }
		   else if(posAtual == coord[13] && coord[13].getPecaAtual().getMoinho())
		   {
			   if(coord[5].getOcupada() && coord[20].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[5], coord[20]))
				  {
					  desativaMoinho(coord, coord[3], coord[4], posAtual, coord[5]);
					  desativaMoinho(coord, coord[18], coord[19], posAtual, coord[20]);
				  }
			  }  
			 if(coord[12].getOcupada() && coord[14].getOcupada())
			 {
					 if(mesmoJogador(posAtual, coord[12], coord[14]))
					 {
						 desativaMoinho(coord, coord[8], coord[17], posAtual, coord[12]);
						 desativaMoinho(coord, coord[2], coord[23], posAtual, coord[14]);
					 }
			 }
		  }
		   else if(posAtual == coord[14] && coord[14].getPecaAtual().getMoinho())
		   {
			   if(coord[2].getOcupada() && coord[23].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[2], coord[23]))
				  {
					  desativaMoinho(coord, coord[0], coord[1], posAtual, coord[2]);
					  desativaMoinho(coord, coord[21], coord[22], posAtual, coord[23]);
				  }
			   }  
			   if(coord[12].getOcupada() && coord[13].getOcupada())
				{ 
					 	if(mesmoJogador(posAtual, coord[12], coord[13]))
					 	{
					 		desativaMoinho(coord, coord[8], coord[17], posAtual, coord[12]);
					 		desativaMoinho(coord, coord[5], coord[20], posAtual, coord[13]);
					 	}
				  }
		   }
		   else if(posAtual == coord[15] && coord[15].getPecaAtual().getMoinho())
		   {
			   if(coord[6].getOcupada() && coord[11].getOcupada())
				{
				  if(mesmoJogador(posAtual, coord[6], coord[11]))
				  {
					  desativaMoinho(coord, coord[7], coord[8], posAtual, coord[6]);
					  desativaMoinho(coord, coord[9], coord[10], posAtual, coord[11]);
				   }
				 }  
				 if(coord[16].getOcupada() && coord[17].getOcupada())
				 {
					 if(mesmoJogador(posAtual, coord[16], coord[17]))
					 {
						 desativaMoinho(coord, coord[19], coord[22], posAtual, coord[16]);
						 desativaMoinho(coord, coord[8], coord[12], posAtual, coord[17]);
					 }
				  }
			   }
		   else if(posAtual == coord[16] && coord[16].getPecaAtual().getMoinho())
		   {
			   if(coord[19].getOcupada() && coord[22].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[19], coord[22]))
				  {
					  desativaMoinho(coord, coord[17], coord[20], posAtual, coord[19]);
					  desativaMoinho(coord, coord[21], coord[23], posAtual, coord[22]);
				   }
			   }  
				 if(coord[15].getOcupada() && coord[17].getOcupada())
				  {
					 if(mesmoJogador(posAtual, coord[15], coord[17]))
					 {
						 desativaMoinho(coord, coord[6], coord[11], posAtual, coord[15]);
						 desativaMoinho(coord, coord[8], coord[12], posAtual, coord[17]);
					 }
				  }
			   }
		   else if(posAtual == coord[17] && coord[17].getPecaAtual().getMoinho())
		   {
			   if(coord[15].getOcupada() && coord[16].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[15], coord[16]))
				  {
					  desativaMoinho(coord, coord[6], coord[11], posAtual, coord[15]);
					  desativaMoinho(coord, coord[19], coord[22], posAtual, coord[16]);
				  }
			  }  
			 if(coord[8].getOcupada() && coord[12].getOcupada())
			 {
					 if(mesmoJogador(posAtual, coord[8], coord[12]))
					 {
						 desativaMoinho(coord, coord[7], coord[6], posAtual, coord[8]);
						 desativaMoinho(coord, coord[13], coord[14], posAtual, coord[12]);
					 }
			 }
		  }
		   else if(posAtual == coord[18] && coord[18].getPecaAtual().getMoinho())
		   {
			   if(coord[19].getOcupada() && coord[20].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[19], coord[20]))
				   {
					  desativaMoinho(coord, coord[16], coord[22], posAtual, coord[19]);
					  desativaMoinho(coord, coord[5], coord[13], posAtual, coord[20]);
				   }
			   }  
			  if(coord[3].getOcupada() && coord[10].getOcupada())
			  {
					 if(mesmoJogador(posAtual, coord[3], coord[10]))
			         {
						 desativaMoinho(coord, coord[4], coord[5], posAtual, coord[3]);
						 desativaMoinho(coord, coord[9], coord[11], posAtual, coord[10]);
			         }
			 }
		  }
		   else if(posAtual == coord[19] && coord[19].getPecaAtual().getMoinho())
		   {
			   if(coord[16].getOcupada() && coord[22].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[16], coord[22]))
				  {
					  desativaMoinho(coord, coord[15], coord[17], posAtual, coord[16]);
					  desativaMoinho(coord, coord[21], coord[23], posAtual, coord[22]);
				  }
			   }  
			   if(coord[18].getOcupada() && coord[20].getOcupada())
			   {
					 if(mesmoJogador(posAtual, coord[18], coord[20]))
					 {
						 desativaMoinho(coord, coord[3], coord[10], posAtual, coord[18]);
						 desativaMoinho(coord, coord[5], coord[13], posAtual, coord[20]);
					 }
			  }
		   }
		   else if(posAtual == coord[20] && coord[20].getPecaAtual().getMoinho())
		   {
			   if(coord[18].getOcupada() && coord[19].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[18], coord[19]))
				  {
					  desativaMoinho(coord, coord[3], coord[10], posAtual, coord[18]);
					  desativaMoinho(coord, coord[16], coord[22], posAtual, coord[19]);
				  }
			   }  
			    if(coord[5].getOcupada() && coord[13].getOcupada())
			   {
					 if(mesmoJogador(posAtual, coord[5], coord[13]))
					 {
						 desativaMoinho(coord, coord[3], coord[4], posAtual, coord[5]);
						 desativaMoinho(coord, coord[12], coord[14], posAtual, coord[13]);
					 }
				}
		   }
		   else if(posAtual == coord[21] && coord[21].getPecaAtual().getMoinho())
		   {
			   if(coord[0].getOcupada() && coord[9].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[0], coord[9]))
				  {
					  desativaMoinho(coord, coord[12], coord[14], posAtual, coord[0]);
					  desativaMoinho(coord, coord[10], coord[11], posAtual, coord[9]);
				  }		
	     	   }  
			   if(coord[22].getOcupada() && coord[23].getOcupada())
			   {
					 if(mesmoJogador(posAtual, coord[22], coord[23]))
					 {
						 desativaMoinho(coord, coord[16], coord[19], posAtual, coord[22]);
						 desativaMoinho(coord, coord[2], coord[14], posAtual, coord[23]);
					 }
			   }
		   }
		   else if(posAtual == coord[22] && coord[22].getPecaAtual().getMoinho())
		   {
			   if(coord[21].getOcupada() && coord[23].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[21], coord[23]))
				  {
					  desativaMoinho(coord, coord[0], coord[9], posAtual, coord[21]);
					  desativaMoinho(coord, coord[2], coord[14], posAtual, coord[23]);
				  }
			   }  
			   if(coord[16].getOcupada() && coord[19].getOcupada())
			   {
					 if(mesmoJogador(posAtual, coord[16], coord[19]))
					 {
						 desativaMoinho(coord, coord[15], coord[17], posAtual, coord[16]);
						 desativaMoinho(coord, coord[18], coord[20], posAtual, coord[19]);
					 }
			   }
			}
		   else if(posAtual == coord[23] && coord[23].getPecaAtual().getMoinho())
		   {
			   if(coord[21].getOcupada() && coord[22].getOcupada())
			   {
				  if(mesmoJogador(posAtual, coord[21], coord[22]))
				  {
					  desativaMoinho(coord, coord[0], coord[9], posAtual, coord[21]);
					  desativaMoinho(coord, coord[16], coord[19], posAtual, coord[22]);
				  }
			  }  
			 if(coord[2].getOcupada() && coord[14].getOcupada())
			 {
					 if(mesmoJogador(posAtual, coord[2], coord[14]))
			        {
						 desativaMoinho(coord, coord[0], coord[1], posAtual, coord[2]);
						 desativaMoinho(coord, coord[12], coord[13], posAtual, coord[14]);
			        }
			}
		 }
	  }
	   
	   
	   /**
	    * Modifica as peças que estão nas posições recebidas, dizendo que ela não fazem
	    * mais parte de um moinho.
	    * 
	    * @param coord Conjunto de posições do tabuleiro.
	    * @param pos1 Posição 1.
	    * @param pos2 Posição 2.
	    * @param pos3 Posição 3.
	    * @param pos4 Posição 4.
	    */
	   private static void desativaMoinho(Posicao coord[], Posicao pos1, Posicao pos2, Posicao pos3, Posicao pos4)
	   {		 
			 if(pos1.getOcupada() && pos2.getOcupada())
		  	 {
				   if(mesmoJogador(pos3, pos1, pos2))
				   {
					   pos3.getPecaAtual().setMoinho(false);
				   }
				   else
			       {
			    	   pos3.getPecaAtual().setMoinho(false);
			    	   pos4.getPecaAtual().setMoinho(false);
			       }
			  }
			  else
			  {
			    	   pos3.getPecaAtual().setMoinho(false);
			    	   pos4.getPecaAtual().setMoinho(false);
			  }		 
 	 }
	   
	   /**
	    * Verifica se as posições pertencem ao mesmo jogador.
	    * @param posAtual Posição atual.
	    * @param pos1 Posicão 1.
	    * @param pos2 Posição 2.
	    * @return Retorna verdadeiro se forem do mesmo jogador, caso contrário retorna falso.
	    */
	   private static boolean mesmoJogador(Posicao posAtual, Posicao pos1, Posicao pos2)
	   {
		   boolean valido = false;
		   if(pos1.getPecaAtual().getJogador() == pos2.getPecaAtual().getJogador() && 
				   posAtual.getPecaAtual().getJogador() == pos1.getPecaAtual().getJogador())
		   {
			   valido = true;
		   }
		   
		   return valido;
	   }
	   
	   /**
	    * Modifica as peças que estão nas posições recebidas, dizendo que elas fazem
	    * parte de um moinho.
	    * @param pos1 Posição 1.	
	    * @param pos2 Posição 2.
	    * @param pos3 Posição 3.
	    */
	   private static void ativaMoinho(Posicao pos1, Posicao pos2, Posicao pos3)
	   {
		   pos1.getPecaAtual().setMoinho(true);
		   pos2.getPecaAtual().setMoinho(true);
		   pos3.getPecaAtual().setMoinho(true);
	   }

}
