import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//crear array pesos 10 pacientes 
//ordenarlso de mayor a menor
		Scanner entrada = new Scanner (System.in);
		String aux1;
		String aux2;
		String pesos[][]=  new String[3][2];
		for (int i = 0; i < pesos.length; i++) {
			System.out.println("Introduzca el nombre:");
			pesos[i][0]=entrada.nextLine();
			System.out.println("Introduzca el peso:");
			pesos[i][1]=entrada.nextLine();
		}
		
		for (int i = 0; i < pesos.length-1; i++) {
			if(Integer.parseInt(pesos[i][1])<Integer.parseInt(pesos[i+1][1])){
				aux1=pesos[i][0];
				aux2=pesos[i][1];
				pesos[i][0]=pesos[i+1][0];
				pesos[i][1]=pesos[i+1][1];
				pesos[i+1][0]=aux1;
				pesos[i+1][1]=aux2;			}
			
		}
		for (int i = 0; i < pesos.length; i++) {
			System.out.println(pesos[i][0]+"\t"+pesos[i][1]);
			
		}
	}

}
