import java.util.Scanner;
public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer > ");
		n = in.nextInt();
		for(j=2;j<n;j++){
			if(n%j==0){
				System.out.println("Not a prime");
				break;
			}
		}
		if(j==n)
			System.out.println("A prime!");
	}
	
}
