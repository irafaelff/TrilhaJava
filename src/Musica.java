import java.io.File;
import java.io.IOException;

import javax.sound.midi.*;

/**
 * Classe respons�vel pela thread do jogo. (Uma m�sica).
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Musica extends Thread 
{
	/**
	 * Atributo que representar� a m�sica.
	 */
	Sequencer musicaa;
	
	/**
	 * M�todo Sobreposto da Classe Thread.
	 * Nesse m�otodo � instanciada e executada a m�sica.
	 */
     public void run()
     {		  
		try
		{
			Sequence musica = MidiSystem.getSequence(new File("Arquivos/RockRev03.sty"));
			musicaa = MidiSystem.getSequencer();
			musicaa.open();   
		    musicaa.setSequence(musica); 
		    musicaa.start();
		    musicaa.setLoopCount(1000);
		} 
		catch (MidiUnavailableException e) {}   
		catch (InvalidMidiDataException e) {} 
		catch (IOException e) {}	
	}
     
    /**
     * M�todo para parar a m�sica.
     */
	private void para()
	{	
		musicaa.stop();
	}


    /**
     * M�todo sobreposto para interromper a Thread.
     */
	public void interrupt()
	{
		para();
		super.interrupt();
	}
	
}
