package booking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel {
	Calculo calculo= new Calculo();
	JPanel panel =new JPanel(); //creacion del panel
	Etiquetas etiqueta= new Etiquetas(); //instancia de etiquetas
	Botones boton= new Botones(); //Instancia de botones
	CajaTexto cajaTexto= new CajaTexto();

	
	public Panel() {
		panel.setLayout(null);// desactiva diseño
		
		colocarEtiquetas(); //Inserta todas las etiquetas
		
		//panel.add(boton.getBotonAyuda()); //Inserta boton de ayuda
		
		colocarBotones(); //inserta los botones
				
		setCajasTexto(); // inserta todas las cajas de texto
		
		setImagenLogo(); //Establece la imagen del logo
		
		setImagenPanel(); //Establece la imagen de fondo
		
		
	}
	
	
	
	

	
	public void colocarBotones() {
		
		
		panel.add(boton.getRadio1());
		panel.add(boton.getRadio2());
		panel.add(boton.getBotonAyuda()); //Inserta boton de ayuda
		panel.add(boton.getBotonEjecutar());
		
		
		ActionListener oyecteAccion=new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double mediaActu=Double.parseDouble(cajaTexto.getMediaActual().getText());			
					double mediaObj= Double.parseDouble(cajaTexto. getMediaObjetivo().getText());
					double NCalifica= Double.parseDouble(cajaTexto.getNCalificaciones().getText());
					double Pesperada= Double.parseDouble(cajaTexto.getPuntuacionEsperada().getText());
				
					
					if((mediaActu>mediaObj || mediaActu==mediaObj || Pesperada==mediaActu || Pesperada<mediaObj) || (mediaActu>10 || mediaObj>10 || Pesperada>10)) {
						//JOptionPane inTexto=new JOptionPane();
						JOptionPane.showMessageDialog(null, "Los datos introducidos no tienen coherencia. Gracias :) ");
					}else {
					
					
					if(boton.getRadio1().isSelected()==false) {
						double x5=calculo.calcularMediaNoAcotada(NCalifica, mediaActu, Pesperada, mediaObj);
						DecimalFormat df = new DecimalFormat("#.0");
						
						etiqueta.getEtiquetaResultado1().setText("Se necesitan "  +df.format(x5) + " nuevas calificaciones de " + Pesperada + " puntos para " );
						etiqueta.getEtiquetaResultado2().setText("alcanzar la media objetivo y situarnos en " +df.format(x5+NCalifica) + " calificaciones totales.");
						
					}else {
						
						//cajaTexto.mediaObjetivo.setEditable(false);
						
						etiqueta.getEtiquetaResultado1().setText("Opcion acotada no disponible en esta version, gracias." );
						etiqueta.getEtiquetaResultado2().setText("Version beta 1.0");
					}
				}
					
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error al introducir los datos.");
				}
				
				
		
				
			}
			};
			

			
			boton.getBotonEjecutar().addActionListener(oyecteAccion);
		
		
	}
	
	
			
	
	public void setCajasTexto() {
		panel.add(cajaTexto.getMediaActual());
		panel.add(cajaTexto. getMediaObjetivo());
		panel.add(cajaTexto.getNCalificaciones());
		panel.add(cajaTexto.getPuntuacionEsperada());
	}
	
	
	public JPanel getPanel() { //@return JPanel panel
		return panel; //return panel a ventana
	}
	
	
	
	private void colocarEtiquetas() { //Coloca las etiquetas en el panel
		
		panel.add(etiqueta.getEtiquetaTitulo());
		panel.add(etiqueta.getEtiqueta1());
		panel.add(etiqueta.getEtiqueta2());
		panel.add(etiqueta.getEtiqueta3());
		panel.add(etiqueta.getEtiqueta4());
		panel.add(etiqueta.getEtiquetaResultado1());
		panel.add(etiqueta.getEtiquetaResultado2());
		
	}
	
	private void setImagenLogo() {
		
		ImageIcon img=new ImageIcon("unnamed.png");
		JLabel bg=new JLabel(img);
		//getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));
		bg.setBounds(160, 320, img.getIconWidth(), img.getIconHeight());
		panel.add(bg);
		
	}
	
	public void setImagenPanel() {
		
		ImageIcon imgFondo=new ImageIcon("sumusFondo.jpg");
		JLabel bg2=new JLabel(imgFondo);
		//getLayeredPane().add(bg2, new Integer(Integer.MIN_VALUE));
		bg2.setBounds(0, 0, imgFondo.getIconWidth(), imgFondo.getIconHeight());
		panel.add(bg2);
		
	}
	
	
}
