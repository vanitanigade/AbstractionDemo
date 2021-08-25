package array.dynamicArray;

import java.util.Scanner;

public class Addition_Scanner {
	public static void main(String[] args) {

		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();

		int a[] = new int[size];	//a[]={10,20,30,40,50}

		System.out.println("enter the array elements");
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}

		System.out.print("array elements are: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			sum=sum+a[i];
		}
		System.out.println("\n sum of array elements: " + sum);
	}

}
