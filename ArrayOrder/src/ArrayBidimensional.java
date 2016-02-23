public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temperaturas[][] = new String[7][2];
		temperaturas[0][0] = "Lunes";
		temperaturas[1][0] = "Martes";
		temperaturas[2][0] = "Miercoles";
		temperaturas[3][0] = "Jueves";
		temperaturas[4][0] = "Viernes";
		temperaturas[5][0] = "Sabado";
		temperaturas[6][0] = "Domingo";
		temperaturas[0][0] = "15";
		temperaturas[0][1] = "12";
		temperaturas[0][2] = "11";
		temperaturas[0][3] = "7";
		temperaturas[0][4] = "2";
		temperaturas[0][5] = "-6";
		temperaturas[0][6] = "2";

		for (int i = 0; i < temperaturas.length-1; i++) {
			System.out.print(temperaturas[i][0]);
		}
	}
}
