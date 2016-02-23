
public class Arraybidimensional2 {

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
		temperaturas[0][1] = "15";
		temperaturas[1][1] = "12";
		temperaturas[2][1] = "11";
		temperaturas[3][1] = "7";
		temperaturas[4][1] = "2";
		temperaturas[5][1] = "6";
		temperaturas[6][1] = "2";

		
		for (int i=0;i<6;i++){
			System.out.print(temperaturas[i][0]+" "+temperaturas[i][1] + "\n");
		}
		
		
	}

}
