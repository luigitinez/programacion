
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] cotizaciones = {47.5,47.8,48,48.1,47.7,47.3,46,47.9,48.05,48.7};
		int posmin;
		double aux;
		for (int i = 0; i < cotizaciones.length-1; i++) {
			posmin =i;
			for (int j = i; j < cotizaciones.length; j++) {
				if(cotizaciones[j]<cotizaciones[posmin]){
				posmin=j;
				}
			
			}
			aux = cotizaciones[posmin];
			cotizaciones[posmin]=cotizaciones[i];
			cotizaciones[i] =aux;
			
		}
		for (int i = 0; i < cotizaciones.length; i++) {
			System.out.print(cotizaciones[i]+"; ");
		}
	}

}
