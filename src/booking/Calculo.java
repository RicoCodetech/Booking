package booking;

public class Calculo {
	
	
	public double calcularMediaNoAcotada(double a, double b, double c, double d) {
		/**
		 * a numero de calificaciones
		 * b media actual
		 * c puntuacion esperada
		 * d la media objetivo
		 */
		if(c==d) {
			
			c=c+0.001;
		}
		
		double x;
		x=(((a*c)-(a*b))/(c-d))-a;	
	
		return x;
	}
	
	
}
