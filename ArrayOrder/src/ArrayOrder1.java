
public class ArrayOrder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] order = new int[]{4,-9,30,1,5,8};
		int first =0;
		int min;
		int pos=0;
		int last;
		int bucle = order.length -1 ;
		
		for(int i=0;i<=bucle;i++){
		last = order[first];
		min = last;
		
			for(int j=first;j<=bucle;j++){
				if(order[j]<min){
					min=order[j];
					pos=j;
				}
			}
		order[pos]=order[i];
		order[i]=min;
		first++;
		}
		for (int z=0;z<order.length;z++){
			System.out.println(order[z]);
		}
	}

	
}
