package Array;

public class multi_array {
	
	public static void main(String[] args) {
		int a[] []= {{10,11,12},{20,21,22},{30,31,32}};
		int b=a.length;
		for (int i=0;i<=2;i++)
		{
		for (int j=0;j<=2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
		
		
	}

}
