import java.util.Scanner;
public class Ejercicio4 {
public static void main(String[] args){
//crea un array donde se guardar‡ el nombre apellidos y edad de 5 personas
//leer‡ los datos desde el teclado y los mostrar‡ por pantalla
	//calcular edad media de las 5 personas dle array
	//encontrar edad minima y maxima
	//
	Scanner entrada = new Scanner (System.in);
	int posmin=0;
	int posmax=0;
	int media=0;
	String [][]DAW= new String [5][3];
	System.out.println("Rellena los datos:");
	for (int i = 0; i < DAW.length; i++) {
	
			 System.out.println("Introduce el nombre");
			 DAW[i][0]=entrada.nextLine();
			 System.out.println("Introduce el apellido");
			 DAW[i][1]=entrada.nextLine();
			 System.out.println("edad");
			 DAW[i][2]=entrada.nextLine();		
		if(Integer.parseInt(DAW[i][2])<Integer.parseInt(DAW[posmin][2])){
			posmin=i;	
		}	
		if(Integer.parseInt(DAW[i][2])>Integer.parseInt(DAW[posmax][2])){
			posmax=i;	
		}	
		media=media+Integer.parseInt(DAW[i][2]);
		}
	
	
	for (int i = 0; i < DAW.length; i++) {
	
			System.out.println(DAW[i][0]+"\t "+DAW[i][1]+"\t\t "+DAW[i][2]);
		
	}
	media=media/DAW.length;
	System.out.println("\n ========================== \n");
	System.out.println("Edad m‡s baja:\t"+DAW[posmin][2]);
	System.out.println("Edad m‡s baja:\t"+DAW[posmax][2]);
	System.out.println("Edad Media:\t" + media);
	
	}
	
}
