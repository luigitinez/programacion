public class Numeros_Atomicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosAtomicos = new int[] { 8, 2, 10, 20, 12, 71, 15, 23 };
		int aux;
		int posmin;
		int l=numerosAtomicos.length;
		
		for (int i = 0; i < l; i++) {

			posmin = i;
			for (int j = i; j < l; j++) {
				if (numerosAtomicos[j] < numerosAtomicos[posmin]) {
					posmin = j;
				}
				aux = numerosAtomicos[posmin];
				numerosAtomicos[posmin] = numerosAtomicos[i];
				numerosAtomicos[i] = aux;
			}

		}
		for (int k = 0; k < l; k++) {
			System.out.print(numerosAtomicos[k] + ", ");
			
			
		}
		System.out.println("\n M’nimo: " + numerosAtomicos[0]);
		System.out.println(" M‡ximo: " + numerosAtomicos[l-1]);
	}

}
