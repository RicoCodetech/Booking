package booking;
import javax.swing.JTextField;

public class CajaTexto {
	JTextField mediaActual = new JTextField();
	JTextField mediaObjetivo = new JTextField();
	JTextField NCalificaciones = new JTextField();
	JTextField puntuacionEsperada = new JTextField();
	
	public CajaTexto() {
		
		//JTextField cajaTexto = new JTextField();
		mediaActual.setBounds(215, 100, 50, 20);

		//JTextField cajaTexto2 = new JTextField();
		mediaObjetivo.setBounds(215, 130, 50, 20);
		 
		//JTextField cajaTexto3 = new JTextField();
		NCalificaciones.setBounds(215, 160, 50, 20);
		
		//JTextField cajaTexto4 = new JTextField();
		puntuacionEsperada.setBounds(215, 190, 50, 20);
	
	}
	
	public JTextField getMediaActual() {
		return mediaActual;
	}
	public JTextField getMediaObjetivo() {
		return mediaObjetivo;
	}
	public JTextField getNCalificaciones() {
		return NCalificaciones;
	}
	public JTextField getPuntuacionEsperada() {
		return puntuacionEsperada;
	}
}
