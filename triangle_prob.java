
import java.util.Scanner;

public class triangle_prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle:");
		int n = sc.nextInt();
		print_n_size_triangle(n);
	}
	public static void print_n_size_triangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	

}
