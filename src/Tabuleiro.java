import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 * Classe que representar� o Tabuleiro. 
 * 
 * @author Equipe Java
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

/*
 *    (A, 1) -------------- --------- (A, 4) ------------------------ (A, 7)
 *      |                               |                               |
 *      |                               |                               |
 *      |                               |                               |
 *      |      (B, 2) -------------- (B, 4) -------------- (B, 6)       |
 *      |         |                     |                     |         |
 *      |         |                     |                     |         |
 *      |         |                     |                     |         |
 *      |         |      (C, 3) ---- (C, 4) ---- (C, 5)       |         |
 *      |         |         |                       |         |         |
 *      |         |         |                       |         |         |
 *      |         |         |                       |         |         |
 *   (D, 1) -- (D, 2) -- (D, 3)                  (D, 5) -- (D, 6) -- (D, 7)
 *      |         |         |                       |         |         |
 *      |         |         |                       |         |         |
 *      |         |         |                       |         |         |
 *      |         |      (E, 3) ---- (E, 4) ---- (E, 5)       |         |
 *      |         |                     |                     |         |
 *      |         |                     |                     |         |
 *      |         |                     |                     |         |
 *      |      (F, 2) -------------- (F, 4) -------------- (F, 6)       |
 *      |                               |                               |
 *      |                               |                               |
 *      |                               |                               |
 *   (G, 1) ------------------------ (G, 4) ------------------------ (G, 7)
 */

public class Tabuleiro extends JFrame implements MouseListener, MouseMotionListener
{

	private static final long serialVersionUID = 1L;

	/**
	 * Atributo que representa as Coordenadas v�lidas do Tabuleiro.
	 */
	private Posicao[] coord;
	
	/**
	 * Atributo que indica os Jogadores (2 Jogadores).
	 */
	private Jogador[] jogadores;
	
	/**
	 * Menu.
	 */
	private JMenu menu;
	
	/**
	 * Menu.
	 */
	private JMenuBar menuBar;
	
	/**
	 * Item do Menu.
	 */
	private JMenuItem sobre;
	
	/**
	 * Item do Menu.
	 */
	private JMenuItem sair;
	
	/**
	 * Item do Menu.
	 */
	private JMenuItem regras;
	
	/**
	 * Bot�o utilizado para parar a m�sica.
	 */
	private JButton parar;
	/**
	 * Bot�o utlizado para tocar a m�sica.
	 */
	private JButton ligar;
	
	/**
	 * Constr�i as posi��es do tabuleiro.
	 * 
	 */
	public Tabuleiro()
	{
		super("Trilha - Equipe Java �");
		
		
		coord = new Posicao[24];
		
		coord[0] = new Posicao('A', 1, false);
		coord[0].setBounds(90, 100, 30, 30);		
		coord[1] = new Posicao('A', 4, false);
		coord[1].setBounds(275, 100, 30, 30);
		coord[2] = new Posicao('A', 7, false);
		coord[2].setBounds(460, 100, 30, 30);
		
		coord[3] = new Posicao('B', 2, false);
		coord[3].setBounds(160, 167, 30, 30);
		coord[4] = new Posicao('B', 4, false);
		coord[4].setBounds(275, 167, 30, 30);
		coord[5] = new Posicao('B', 6, false);
		coord[5].setBounds(390, 167, 30, 30);
		
		coord[6] = new Posicao('C', 3, false);
		coord[6].setBounds(230, 235, 30, 30);
		coord[7] = new Posicao('C', 4, false);
		coord[7].setBounds(275, 235, 30, 30);
		coord[8] = new Posicao('C', 5, false);
		coord[8].setBounds(320, 235, 30, 30);
		
	    coord[9] =  new Posicao('D', 1, false);
		coord[9].setBounds(90, 283, 30, 30);
		coord[10] = new Posicao('D', 2, false);
		coord[10].setBounds(160, 283, 30, 30);
		coord[11] = new Posicao('D', 3, false);
		coord[11].setBounds(230, 283, 30, 30);
		coord[12] = new Posicao('D', 5, false);
		coord[12].setBounds(320, 283, 30, 30);
		coord[13] = new Posicao('D', 6, false);
		coord[13].setBounds(390, 283, 30, 30);
		coord[14] = new Posicao('D', 7, false);
		coord[14].setBounds(460, 283, 30, 30);
		
		coord[15] = new Posicao('E', 3, false);
		coord[15].setBounds(230, 325, 30, 30);
		coord[16] = new Posicao('E', 4, false);
		coord[16].setBounds(275, 325, 30, 30);
		coord[17] = new Posicao('E', 5, false);
		coord[17].setBounds(320, 325, 30, 30);
		
		coord[18] = new Posicao('F', 2, false);
		coord[18].setBounds(160, 398, 30, 30);
		coord[19] = new Posicao('F', 4, false);
		coord[19].setBounds(275, 398, 30, 30);
		coord[20] = new Posicao('F', 6, false);
		coord[20].setBounds(390, 398, 30, 30);
		
		coord[21] = new Posicao('G', 1, false);
		coord[21].setBounds(90, 468, 30, 30);
		coord[22] = new Posicao('G', 4, false);
		coord[22].setBounds(275, 468, 30, 30);
		coord[23] = new Posicao('G', 7, false);
		coord[23].setBounds(460, 468, 30, 30);
		
		jogadores = new Jogador[2];
		jogadores[0] = new Jogador();
		jogadores[1] = new Jogador();
		
		this.setSize(830, 610);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		iniciarComponentes();
		this.setVisible(true);
	}
	
	/**
	 * M�sica que ser� executada com o jogo (Thread).
	 */
	Musica m = new Musica();
	
	/**
	 * M�todo utilizado para iniciar os componentes da classe.
	 */
	private void iniciarComponentes()
	{
		parar = new JButton(new ImageIcon("Arquivos/stop.gif"));
		ligar = new JButton(new ImageIcon("Arquivos/play.gif"));
		menuBar = new JMenuBar();
		menu = new JMenu("Menu");
		sobre = new JMenuItem("Sobre");
		sair = new JMenuItem("Sair");
		regras = new JMenuItem("Regras");
		menuBar.add(menu);
		menu.setMnemonic(KeyEvent.VK_M);
		menu.add(regras);
		menu.add(sobre);
		menu.add(sair);
		sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		
		m.start();

		ligar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				m.interrupt();
				m.run();
				
			}
		});
		parar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				m.interrupt();
			}
		});
		
		ligar.setBounds(720, 20, 20, 20);
		parar.setBounds(750, 20, 20, 20);

		sobre.addActionListener(new Sobre());
		regras.addActionListener(new Regras());
		this.setJMenuBar(menuBar);

			
		int num = 0;
		Container c;
		c = this.getContentPane();
		c.setLayout(null);		
		
		for(int i=0; i<9; i++)
		{
			jogadores[0].pecas[i] = new Peca('H', 0, "Arquivos/preta.gif");
			jogadores[0].pecas[i].setJogador(jogadores[0]);
			jogadores[0].pecas[i].setOponente(jogadores[1]);
			jogadores[0].pecas[i].setBounds(650, 100+(num), 30, 30);	
			c.add(jogadores[0].pecas[i]);
			
			jogadores[1].pecas[i] = new Peca('H', 0, "Arquivos/amarela.gif");
			jogadores[1].pecas[i].setJogador(jogadores[1]);
			jogadores[1].pecas[i].setOponente(jogadores[0]);
			jogadores[1].pecas[i].setBounds(700, 100+(num), 30, 30);
			c.add(jogadores[1].pecas[i]);
			
			num = num + 40;
		}	
		
		for(int i=0; i<coord.length; i++)
		{
		    c.add(coord[i]);		    
		}
		
		c.add(ligar);
		c.add(parar);	
		JPanel tabuleiro = new JPanel();
		tabuleiro.setBounds(50, 50, 484, 484);
		JLabel fundo = new JLabel(new ImageIcon("Arquivos/Hintergrund2.jpg"));
		tabuleiro.add(fundo);
		c.add(tabuleiro);
		
	}

	public static void main(String[] args)
	{
		Tabuleiro t = new Tabuleiro();
		t.addMouseListener(t);
		t.addMouseMotionListener(t);
	}


	/**
	 * M�todo utlizado para marcar as pe�as que ser� movidas.
	 */
	public void mousePressed(MouseEvent e)
	{	
   		    
		   press = false;
		   drag = false;
   		   if(etapa == 1)
   		   {
   				  if(jogadores[0].getVez())
   				  {
   					  for (Peca p : jogadores[0].pecas) 
   					  {
   						  	if ((e.getX() >= p.getX()) && (e.getX() <= p.getX() + p.getWidth()) &&
   								  (e.getY() >= p.getY()) && 
   								  (e.getY() <= p.getY() + ((p.getHeight()*2) + p.getHeight()/2)))
   						  	{
   						  		peca = p;
   						  		press = true;
   						  		orig = peca.getLocation();
   						  		break;
   						  	}
   					  }
   				  }
   				  if(jogadores[1].getVez())
   				  {
   					  
   					for (Peca p : jogadores[1].pecas) 
 					  {
 						  	if ((e.getX() >= p.getX()) && (e.getX() <= p.getX() + p.getWidth()) &&
 								  (e.getY() >= p.getY()) && 
 								  (e.getY() <= p.getY() + ((p.getHeight()*2) + p.getHeight()/2)))
 						  	{
 						  		peca = p;
 						  		press = true;
 						  		orig = peca.getLocation();
 						  		break;
 						  	}
 					  }  
   			  }
   		   }
   		   else
   		   if(etapa == 2)
   		   {
   			   	for (Posicao p : coord) 
				{
					  if ((e.getX() >= p.getX()) && (e.getX() <= p.getX() + p.getWidth()) &&
						  (e.getY() >= p.getY()) && 
						  (e.getY() <= p.getY() + ((p.getHeight()*2) + p.getHeight()/2)))
				  	{
						if(!p.getOcupada()) return;
						
					  	if(Validar.podeMover(p, coord))
					  	{
					 		peca = p.getPecaAtual();
					  		press = true;
					  		orig = peca.getLocation();
					  		break;
					 	}	
					  	else
					  	{
					  		if(p.getPecaAtual().getJogador().pecasNoTab == 3)
					  		{
					  			peca = p.getPecaAtual();
						  		press = true;
						  		orig = peca.getLocation();
						  		break;
					  		}
					  	}
				  	}
				 }
   			   	
   			   	if(peca == null)  return;
   			   	
   			   	if(!peca.getJogador().getVez())
				{
				   peca = null;
				   press = false;
				   return;
				}
   		   }
   	 }
			
	/**
	 * Indica a posi��o destino da pe�a.
	 */
	private Posicao dest = null;
	/**
	 * Indica a pe�a que est� sendo movimentada no tabuleiro.
	 */
	private Peca peca = null;
    /**
     * Inidica a pe�a que ser� removida do tabuleiro.
     */
    private Peca pecaRemovida = null;
    /**
     * Indica o ponto de origem da pe�a que est� sendo movimentada.
     */
    private Point orig = null;
	/**
	 * Indica se a pe�a foi pressionada com Sucesso.
	 */
	private boolean press = false;
	/**
	 * Indica se a pe�a foi movida com Sucesso.
	 */
	private boolean	drag = false;
	/**
	 * Indica em que etapa o jogo est� no momento (O jogo tem 3 etapas).
	 */
	private int etapa = 1;
		
	/**
	 * M�todo chamado ap�s ter movido e soltado uma pe�a. 
	 * Realiza testes para confirma��o do destino da pe�a
	 */
	public void mouseReleased(MouseEvent e)
	{		
		if(etapa == 1)
		{
			if(peca == null) return;
			
			if(drag && press)
			{
				drag = false;
				press = false;
				
				if(!dest.getOcupada())
				{
					peca.setLocation(dest.getLocation());
					peca.setPos(dest);
					dest.setPecaAtual(peca);
					dest.setOcupada(true);
					peca.getJogador().contPecas++;
					if(Moinho.checaMoinho(dest, coord, peca.getJogador()))
					{
						etapa = 3;
						if(peca.getJogador() == jogadores[0])
						{
							javax.swing.JOptionPane.showMessageDialog(null, 
									"Moinho Formado:\nEscolha uma pe�a AMARELA para ser retirada do tabuleiro");
						}
						else
						{
							javax.swing.JOptionPane.showMessageDialog(null, 
									"Moinho Formado:\nEscolha uma pe�a PRETA para ser retirada do tabuleiro");
						}
						peca = null;
						return;
					}
					if(peca.getOponente().contPecas == 9)
					{
						peca.getJogador().setVez(true);
						peca.getOponente().setVez(false);
					}
					else
					{
						peca.getJogador().setVez(false);
						peca.getOponente().setVez(true);
					}
					
					if(jogadores[0].contPecas == 9 && jogadores[1].contPecas == 9)
					{
						peca.getJogador().setVez(false);
						peca.getOponente().setVez(true);
						etapa = 2;
					}
					
					peca = null;
				}
				else
				{
					peca.setLocation(orig);
					peca = null;
				}	
			}
			else
			{
				peca.setLocation(orig);
			}
		}
		else
		if(etapa == 2)
		{
			if(peca == null) return;
			
			if(drag && press)
			{
				if(!dest.getOcupada())
				{
					if(peca.getJogador().pecasNoTab == 3)
					{
				
						if(Validar.movimentoLivre(dest))
						{
							peca.setLocation(dest.getLocation());
							Moinho.retiraMoinho(peca.getPos(), coord, peca.getJogador());
							peca.getPos().setOcupada(false);
							peca.setPos(dest);
							dest.setPecaAtual(peca);
							dest.setOcupada(true);
							if(Moinho.checaMoinho(dest, coord, peca.getJogador()))
							{
								etapa = 3;
								if(peca.getJogador() == jogadores[0])
								{
									javax.swing.JOptionPane.showMessageDialog(null, 
											"Moinho Formado:\nEscolha uma pe�a AMARELA para ser retirada do tabuleiro");
								}
								else
								{
									javax.swing.JOptionPane.showMessageDialog(null, 
											"Moinho Formado:\nEscolha uma pe�a PRETA para ser retirada do tabuleiro");
								}
								peca = null;
								return;
							}
							peca.getJogador().setVez(false);
							peca.getOponente().setVez(true);
						}
						else
						{
							peca.setLocation(orig);
							peca = null;
						}
					}
					else
					{
						if(Validar.movimento(peca.getPos(), dest) && (!dest.getOcupada()))
						{
							peca.setLocation(dest.getLocation());
							Moinho.retiraMoinho(peca.getPos(), coord, peca.getJogador());
							peca.getPos().setOcupada(false);
							peca.setPos(dest);
							dest.setPecaAtual(peca);
							dest.setOcupada(true);
							if(Moinho.checaMoinho(dest, coord, peca.getJogador()))
							{
								etapa = 3;
								if(peca.getJogador() == jogadores[0])
								{
									javax.swing.JOptionPane.showMessageDialog(null, 
											"Moinho Formado:\nEscolha uma pe�a AMARELA para ser retirada do tabuleiro");
								}
								else
								{
									javax.swing.JOptionPane.showMessageDialog(null, 
											"Moinho Formado:\nEscolha uma pe�a PRETA para ser retirada do tabuleiro");
								}
								peca = null;
								return;
							}
							peca.getJogador().setVez(false);
							peca.getOponente().setVez(true);
						}
						else
						{
							peca.setLocation(orig);
							peca = null;
						}
					}
				}
				else
				{
					peca.setLocation(orig);
					peca = null;
				}
			}
			else
			{
				peca.setLocation(orig);
				peca = null;
			}
		}
	}	

	/**
	 * M�todo chamado para arrastar as pe�as no tabuleiro.
	 */
	public void mouseDragged(MouseEvent e)
	{	
		if(press && (etapa != 3))
		{
			drag = false;
			peca.setLocation(e.getX() - (peca.getWidth()/2),
							 e.getY() - (peca.getHeight()*2));
			
			  for (Posicao p : coord) 
			  {
				  	if ((e.getX() >= p.getX()) && (e.getX() <= p.getX() + p.getWidth()) &&
						  (e.getY() >= p.getY()) && 
						  (e.getY() <= p.getY() + ((p.getHeight()*2) + p.getHeight()/2)))
				  	{
				  		dest = p;
				  		drag = true;
				  		break;
				  	}
			  }			
		}
	}
	
	/**
	 * M�todo chamado quando o mouse � clicado. Ser� executado apenas na remo��o de pe�as.
	 */
	public void mouseClicked(MouseEvent e)
	{
		if(etapa == 3)
		{
			
			for (Posicao p : coord) 
			{
			  	if ((e.getX() >= p.getX()) && (e.getX() <= p.getX() + p.getWidth()) &&
					  (e.getY() >= p.getY()) && 
					  (e.getY() <= p.getY() + ((p.getHeight()*2) + p.getHeight()/2)))
			  	{
			  		if(p.getOcupada())
			  		{
			  			pecaRemovida = p.getPecaAtual();
			  			press = true;
			  			break;
			  		}
			  	}
		  }
			
			
			if(pecaRemovida == null) return;
			
			boolean todasMoinho = true;
			
			for(int i=0; i<9; i++)
			{
				if(!pecaRemovida.getJogador().pecas[i].getMoinho())
				{
					todasMoinho = false;
				}
			}
			
			if(todasMoinho && (!pecaRemovida.getJogador().getVez()))
			{
				Moinho.retiraMoinho(pecaRemovida.getPos(), coord, pecaRemovida.getJogador());
				pecaRemovida.getPos().setOcupada(false);
				pecaRemovida.getPos().setPecaAtual(null);
				pecaRemovida.setMoinho(true);
				pecaRemovida.getJogador().pecasNoTab--;
				pecaRemovida.setVisible(false);	
				pecaRemovida.getJogador().setVez(true);
				pecaRemovida.getOponente().setVez(false);
				
				if(pecaRemovida.getJogador().pecasNoTab == 2)
				{
					if(pecaRemovida.getJogador() == jogadores[0])
					{
						javax.swing.JOptionPane.showMessageDialog(null, 
						"Jogador das pe�as AMARELAS � O VENCENDOR!!");
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, 
						"Jogador das pe�as PRETAS � O VENCENDOR!!");
					}
					etapa = 0;
				}
				if(pecaRemovida.getJogador().contPecas == 9 && pecaRemovida.getOponente().contPecas == 9)
				{
					etapa = 2;
				}
				else
				{
					etapa = 1;
				}				
			}
			else			
			if((!pecaRemovida.getMoinho()) && (!pecaRemovida.getJogador().getVez()))
			{
				pecaRemovida.getPos().setOcupada(false);
				pecaRemovida.getPos().setPecaAtual(null);
				pecaRemovida.setMoinho(true);
				pecaRemovida.getJogador().pecasNoTab--;
				pecaRemovida.setVisible(false);	
				pecaRemovida.getJogador().setVez(true);
				pecaRemovida.getOponente().setVez(false);
				if(pecaRemovida.getJogador().pecasNoTab == 2)
				{
					if(pecaRemovida.getJogador() == jogadores[0])
					{
						javax.swing.JOptionPane.showMessageDialog(null, 
						"Jogador das pe�as AMARELAS � O VENCENDOR!!");
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, 
						"Jogador das pe�as PRETAS � O VENCENDOR!!");
					}
					etapa = 0;
				}
				if(pecaRemovida.getJogador().contPecas == 9 && pecaRemovida.getOponente().contPecas == 9)
				{
					etapa = 2;
				}
				else
				{
					etapa = 1;
				}
			}
			else
			{
				pecaRemovida = null;
			}			
		}
	}
	
	
	/**
	 * M�todo n�o utilizado.
	 */
	public void mouseMoved(MouseEvent e){}
	/**
	 * M�todo n�o utilizado.
	 */
	public void mouseEntered(MouseEvent e){}
	/**
	 * M�todo n�o utilizado.
	 */
	public void mouseExited(MouseEvent e){}
	
}
