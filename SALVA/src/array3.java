public class array3 {

	public static void main(String[] args) {

		int prueba[] = { 120, 115, 290, 95 };

		int suma=0;
		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < prueba.length; i++) {

			if (prueba[posMin] > prueba[i]) {
				posMin = i;

			}
			if (prueba[i] > prueba[posMax]) {
				posMax = i;
			}
			
			suma = suma + prueba[i];
		}
		suma = suma / prueba.length;
		System.out.println(prueba[posMin]);
		System.out.println(prueba[posMax]);
		System.out.println(suma);
		
	}
}