
public class array {

	public static void main(String[] args) {
	
		int prueba [] = {120,115,290,95};
		
		int aux;
		
		for(int i=1;i<prueba.length;i++){			
			
			for(int h = 0; h<prueba.length-i;h++){
			
				if(prueba[h]>prueba[h+1]){
					aux = prueba[h];
					prueba[h]=prueba[h+1];
					prueba[h+1] = aux;
				}
			}
	
		}
		for(int j=0;j<prueba.length;j++)
		System.out.println(prueba[j]);
	}

}
