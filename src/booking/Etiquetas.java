package booking;

import javax.swing.JLabel;

public class Etiquetas {
	JLabel etiquetaTitulo =new JLabel();
	JLabel etiqueta1 =new JLabel();
	JLabel etiqueta2 =new JLabel();
	JLabel etiqueta3 =new JLabel();
	JLabel etiqueta4 =new JLabel();
	JLabel etiquetaResultado1 =new JLabel();
	JLabel etiquetaResultado2=new JLabel();
	
	public Etiquetas() {
		
		setEtiquetaTitulo();
		setEtiqueta1();
		setEtiqueta2();
		setEtiqueta3();
		setEtiqueta4();
		setEtiquetaResultado1();
		setEtiquetaResultado2();
	}
	

	/**
	 * Establece los atributos de las etiquetas
	 */
	private void setEtiquetaTitulo() {
		etiquetaTitulo.setText("Media Aritmetica");
		etiquetaTitulo.setBounds(30, 5, 110,50);//establece la posicion
	}
	
	private void setEtiqueta1() {
		etiqueta1.setText("Introduce media actual");
		etiqueta1.setBounds(60, 100, 150, 20);
	}
	
	private void setEtiqueta2() {
		etiqueta2.setText("Introduce media objetivo");
		etiqueta2.setBounds(60, 130, 150, 20);
	}
	
	private void setEtiqueta3() {
		etiqueta3.setText("Introduce nº calificaciones");
		etiqueta3.setBounds(60, 160, 150, 20);
	}
	
	private void setEtiqueta4() {
		etiqueta4.setText("Puntuación esperada/cliente");
		etiqueta4.setBounds(60, 190, 150, 20);
	}
	
	private void setEtiquetaResultado1() {
		etiquetaResultado1.setBounds(60,270,400,20);
	}
	
	private void setEtiquetaResultado2() {
		etiquetaResultado2.setBounds(60,290,450,20);
	}
	
	

	/**
	 * 
	 * @return etiquetas
	 */
	public JLabel getEtiquetaTitulo() {
		return etiquetaTitulo;
	}
	
	public JLabel getEtiqueta1() {
		return etiqueta1;
	}
	
	public JLabel getEtiqueta2() {
		return etiqueta2;
	}
	
	public JLabel getEtiqueta3() {
		return etiqueta3;
	}
	
	public JLabel getEtiqueta4() {
		return etiqueta4;
	}
	
	public JLabel getEtiquetaResultado1() {
		return etiquetaResultado1;
	}
	
	public JLabel getEtiquetaResultado2() {
		return etiquetaResultado2;
	}

}


