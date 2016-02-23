import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
 String [][]Libros =new String[5][4];
 for(int i=0;i<Libros.length;i++){
	 System.out.println("Introduce el ISBN");
	 Libros[i][0]= sc.nextLine();
	 System.out.println("Introduce el Titulo");
	 Libros[i][1]= sc.nextLine();
	 System.out.println("Introduce el Autor");
	 Libros[i][2]= sc.nextLine();
	 System.out.println("Introduce el Editorial");
	 Libros[i][3]= sc.nextLine();
	 System.out.println(i);
	 
 }
 for (int i = 0; i < Libros.length; i++) {
	 for (int j = 0; j < 4; j++) {
	
	System.out.print(Libros[i][j]+"\t");
	 }
	 System.out.println();
}
	}

}
