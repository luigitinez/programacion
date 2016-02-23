public class Ejerciciochungo {

	public static void main(String[] args) {
		String temp [][]={{"Lunes","32"},{"Martes","12"},{"Miercoles","34"},{"Jueves","21"},{"Viernes","18"},{"Sabado","16"},{"Domingo","18"}};
		double media=0;
		String altas="Temperaturas:";
		for(int i=0;i<temp.length;i++){
			media=media+Integer.parseInt(temp[i][1]);
			if(Integer.parseInt(temp[i][1])>20){
				altas= altas + " " + temp[i][1];
			}
			
		}
		media=media/7;
		System.out.println(media);
		System.out.println(altas);
		
		
	}
}
