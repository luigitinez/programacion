public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temperaturas = 
	{ 3.2, 3.5, 7.2, 0.1, 1, - 2.3, -5, 3.4, 4, 4,4, 1.4, 2.5, -0, 4, -3, 6 };
		int posmin=-1;
		for (int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i]<0){
				posmin=i;
				break;
			}
		}
		
		System.out.println("La temperatura m‡s baja est‡ en la posici—n: " + posmin);
	}

}
