import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String args[]) {
		// 10.- Escribe un programa que pregunte las temperaturas de las últimas
		// ocho horas y las muestre ordenadas de menor a mayor, usando el método
		// de selección. Al final también indicará la temperatura menor y la
		// mayor.
		
		//creacion de array para temperaturas
		int temperaturas[]=new int[8];
		int posmin;
		int aux;
		Scanner sc = new Scanner (System.in);
		//un bucle para introducir las temperaturas
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperaturas nº"+(i+1));
			temperaturas[i]=sc.nextInt();
		}
		//para ordenar el array
		for (int i = 0; i < temperaturas.length; i++) {
			posmin=i;
			for (int j = 0; j < temperaturas.length; j++) {
				if(temperaturas[j]<temperaturas[posmin]){
					posmin=j;
				}
				aux=temperaturas[posmin];
				temperaturas[posmin]=temperaturas[i];
				temperaturas[i]=aux;
				
			}
		}
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print(temperaturas[i]+" ");
		}
		System.out.println();
		System.out.println("Minima:"+temperaturas[0]);
		System.out.println("Máxima:"+temperaturas[temperaturas.length-1]);
	}
}
