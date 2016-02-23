import java.util.Scanner;

public class ActArrays4 {

	public static void main(String[] args) {
		// crea un array donde se guardar‡ el nombre apellidos y edad de 5
		// personas
		// leer‡ los datos desde el teclado y los mostrar‡ por pantalla
		// calcular edad media de las 5 personas del array
		// encontrar edad minima y maxima

		String personas[][] = new String[5][3];
		Scanner teclado = new Scanner(System.in);
		int edad = 0;
		int posMin = 0;
		int posMax = 0;
		for (int i = 0; i < personas.length; i++) {

			System.out.println("Nombre?");
			personas[i][0] = teclado.nextLine();
			System.out.println("Apellido?");
			personas[i][1] = teclado.nextLine();
			System.out.println("Edad?");
			personas[i][2] = teclado.nextLine();
			edad = Integer.parseInt(personas[i][2]) + edad;
		}

		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i][0] + " " + personas[i][1] + " "
					+ personas[i][2]);

		}

		edad = edad / personas.length;
		System.out.println("La edad media es: " + edad);

		for (int j = 0; j < personas.length; j++) {
			if (Integer.parseInt(personas[posMin][2]) > Integer
					.parseInt(personas[j][2])) {
				posMin = j;

			}

		}
		System.out.println("La persona con la edad mas baja es: "
				+ personas[posMin][0] + "\t " + personas[posMin][1] + "\t "
				+ personas[posMin][2]);

		for (int h = 0; h < personas.length; h++) {
			if (Integer.parseInt(personas[posMax][2]) < Integer
					.parseInt(personas[h][2])) {
				posMax = h;

			}

		}

		System.out.println("La persona con la edad mas alta es: "
				+ personas[posMax][0] + "\t " + personas[posMax][1] + "\t "
				+ personas[posMax][2]);
	}

}
