
public class Ejercicio2 {
	public static void main(String[] args) {
	
		double [] cotizaciones = {47.5,47.8,48,48.1,47.7,47.3,46,47.9,48.05,48.7};
		double min= cotizaciones[0];
		double max= cotizaciones[0];
		for (int i = 0; i < cotizaciones.length; i++) {
			if(cotizaciones[i]<min){
				min=cotizaciones[i];
			}
			if(cotizaciones[i]>max){
				max=cotizaciones[i];
			}
			
		}
		System.out.println("El m�nimo es: " + min + "\nEl m�ximo es: " +max);
	}
}
