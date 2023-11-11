package booking;

import java.awt.Dimension;


import javax.swing.JFrame;



public class Ventana extends JFrame {
	Panel panel= new Panel();

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public Ventana() {
		this.setSize(500,500); //Establece tamaño de ventana
		setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo de la ventana
	
		setLocationRelativeTo(null); //Establece la ventana en el centro
		setTitle("Por Oscar Rico - Calculo de la media aritmetica - Beta 1.0");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra correctamente el programa
		
		this.getContentPane().add(panel.getPanel());//Agrega el panel a la ventana

		
	}

}
