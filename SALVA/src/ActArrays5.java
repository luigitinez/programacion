public class ActArrays5 {

	public static void main(String[] args) {

		// crear array pesos 10 pacientes
		// ordenarlso de mayor a menor

		String pesos[][] = { { "Juan", "56" }, { "Pepito", "67" },
				{ "Pedro", "76" }, { "Lopez", "67" }, { "Arturo", "89" },
				{ "Alex", "87" }, { "Dani", "78" }, { "ruben", "90" },
				{ "Risto", "80" }, { "Angel", "70" } };

		String aux = "";

		for (int i = 0; i < pesos.length; i++) {
		
				if (Integer.parseInt(pesos[i][1]) < Integer
						.parseInt(pesos[i+1][1]))
					aux = pesos[i][k + 1];
				pesos[i][k + 1] = pesos[i][k];
				pesos[i][k] = aux;

				// System.out.print(pesos[i][k]+"\t");
			
			// System.out.println();
		}
//		for (int h = 0; h < pesos.length; h++)
//			for (int i = 0; i < pesos.length; i++) {
//
//				System.out.println(pesos[i][h]);
//			}
	}
}
