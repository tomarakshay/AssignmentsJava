package array;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Calculate a=new Calculate();
		Scanner scanner=new Scanner(System.in);
		double[] arr;
		
		System.out.println("Enter total no of elements ");
		int total=scanner.nextInt();
		
		arr=new double[total];
		for (int i=0;i<total;i++) {
			System.out.println("Enter the next element");
			
			arr[i]=scanner.nextInt();
		}
		a.sum(arr);
		a.average(arr);
	}
}