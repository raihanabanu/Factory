# Factory
import java.util.Scanner;


public class Fact {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		for(int i=1;i<s;i++){
			fact+=fact*i;
		}
			System.out.print(fact);
		}
		

	

}
