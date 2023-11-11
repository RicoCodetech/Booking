package booking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
//import javax.swing.JTextField;

public class Botones {
	JButton boton2 = new JButton();
	JButton boton1;
	JRadioButton radioBoton1;
	JRadioButton radioBoton2;
	
	public Botones() {
		colocarRadioBotones();
		setBotonAyuda(); //Establece los parametros del boton
		//oyenteAccionBotonAyuda();//Le da la accion al boton ayuda
		setBotonEjecutar(); //Establece propiedades boton ejecutar
			
	}
	
	
	
	public void colocarRadioBotones() {
		
		radioBoton1 = new JRadioButton("Opcion acotada", true);
		radioBoton1.setBounds(60, 40, 130, 20);
		radioBoton1.setBackground(Color.white);
		//panel.add(radioBoton1);
		
		radioBoton2 = new JRadioButton("Opcion no acotada", true);
		radioBoton2.setBounds(60, 70, 150, 20);
		radioBoton2.setBackground(Color.white);
		//panel.add(radioBoton2);
		
		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(radioBoton1);
		grupoRadioBotones.add(radioBoton2);
		
	}
	
	public JRadioButton getRadio1() {
		return radioBoton1;
	}
	
	public JRadioButton getRadio2() {
		return radioBoton2;
	}
	
	
	
	private void setBotonEjecutar() {
		boton1 = new JButton();
		boton1.setBounds(30, 400, 100, 40);
		
		boton1.setText("Ejecutar");
		boton1.setEnabled(true); //Establecemos el encendido del boton
		boton1.setMnemonic('a'); //establecemos alt + letra
		oyenteAccionBotonEjecutar();
		
	}
	
	
	
	private void oyenteAccionBotonEjecutar() {
		
		ActionListener oyecteAccion2=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Primer bloque:\nIntroduce la media actual\nSegundo bloque:\nIntroduce la media que quieres conseguir\nTercer bloque:\nIntroduce el numero de calificaciones que tiene actualmente\nCuarto bloque:\nIntroduce la nueva puntuacion que esperas recibir, como media, de tus clientes ej. 10 puntos.");
			
			}
			
		};
		boton2.addActionListener(oyecteAccion2);
		
	}

		
		
	
	
	private void setBotonAyuda() {
		
		boton2.setBounds(350, 400, 100, 40);
		
		boton2.setText("Ayuda");
		boton2.setEnabled(true); //Establecemos el encendido del boton
		boton2.setMnemonic('s'); //establecemos alt + letra
		
		//Agregar el boton en panel
		
	}
	
	public JButton getBotonAyuda() {
		return boton2; //Return boton ayuda a el panel
	}
	
	
	public JButton getBotonEjecutar() {
		return boton1;
	}
	
}
