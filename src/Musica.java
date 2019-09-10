import java.io.File;
import java.io.IOException;

import javax.sound.midi.*;

/**
 * Classe responsável pela thread do jogo. (Uma música).
 * @author Equipe Java.
 * @version Final 2008/6/7
 * @since Abril/2008.
 */

public class Musica extends Thread 
{
	/**
	 * Atributo que representará a música.
	 */
	Sequencer musicaa;
	
	/**
	 * Método Sobreposto da Classe Thread.
	 * Nesse méotodo é instanciada e executada a música.
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
     * Método para parar a música.
     */
	private void para()
	{	
		musicaa.stop();
	}


    /**
     * Método sobreposto para interromper a Thread.
     */
	public void interrupt()
	{
		para();
		super.interrupt();
	}
	
}
