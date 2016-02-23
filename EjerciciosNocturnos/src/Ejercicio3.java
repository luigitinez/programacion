import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.- Escribe un programa que lea una lista de nombres (uno a uno,
//		hasta un m‡ximo de 10) por consola y los vaya guardando en un array llamado nombres.
//		La aplicaci—n terminar‡ de pedir palabras cuando el usuario escriba "nadie".
//
//		A continuaci—n revisar‡ el array y averiguar‡ si se ha introducido el nombre 
//		"Calder—n". Si es as’ escribir‡ "de la Barca". 
//		Si no, escribir‡ "Nombre no encontrado". 
//		Utiliza una variable sem‡foro llam‡ndola nombreEncontrado.
		Scanner entrada = new Scanner (System.in);
		String nombres[] = new String[10];
		boolean nombreEncontrado=false;
		boolean semaforo=false;
		int j=0;
		
		//Creaci—n del array(rellenamos los nombres) 
		while(j<10 && semaforo==false){
			System.out.println(j+1+"Introduce un nombre");
			//Aqui introducimos el nombre
			nombres[j]=entrada.nextLine();
			//Aqui comprobamos que el nombre introducido no sea nadie
			if(nombres[j].equals("nadie")){
				//si lo es, variable semaforo vale true y esto har‡ que la condicion
				//puesta en el while deje de cumplirse y salgamos del bucle
				semaforo=true;
				
			}
			//aumentamos el contador de j
			j++;
			
		}
		
		//bucle for para imprimir los nombres de array
		for (int i = 0; i < j; i++) {
			//Comprobamos si est‡ escrita la palabra Calder—n
			if(nombres[i].equals("Calderon")){
				//si se encuentra calderon lo guardamos aqui
			nombreEncontrado=true;
			}
			//imprimimos los nombres guardados en el array
			System.out.println(nombres[i]);
		}
		//comprobamos si antes hemos encontrado el nombre calderon
		if(nombreEncontrado==true){
			//imprimimos esto en caso de que se haya encontrado
			System.out.println("De la Barca");
		}
		else{
			//en caso de no haberse encontrado se imprime esto
			System.out.println("Nombre no encontado");
		}
		
		
		
		
		
		
	}
}
