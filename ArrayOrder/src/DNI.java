import java.util.Scanner;
public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dni;
		int result;
		String[] A={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		System.out.println("Introduce tu dni:");
		dni= sc.nextInt();
		result=dni%23;
		System.out.println(A[result]);
	}

}
