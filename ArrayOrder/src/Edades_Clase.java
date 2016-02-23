import java.util.Scanner;
public class Edades_Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] edades = new int[10];
		int aux; 
		int posmin;
		for (int i=0;i<edades.length;i++){
			System.out.println(i+1+ " Introduce edad:");
			edades[i]=sc.nextInt();
		}
		for (int i=0;i<edades.length;i++){
			posmin=i;
		for(int j=i;j<edades.length;j++){
			if (edades[j]<edades[posmin]){
				posmin=j;
			}
			aux= edades[posmin];
			edades[posmin]=edades[i];
			edades[i]=aux;
		}	
			
			
			
		}
		for (int k=0;k<edades.length;k++){
			System.out.println(edades[k]);
		}

	}

}
