package Array;

import java.util.Arrays;

public class AscDsc {
	
	public static void main(String[] args) {
		int a[]= {40,20,60,30,70,10};
		int size=a.length-1;
		System.out.println(size);
		
		System.out.println("*********Original Array*********");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*********In Ascending order*********");
		Arrays.sort(a);
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*********In Decending order*********");
        for(int i=a.length-1;i>=0;i--)
        {
        	System.out.println(a[i]);
        }
		
		
		
	}

}
