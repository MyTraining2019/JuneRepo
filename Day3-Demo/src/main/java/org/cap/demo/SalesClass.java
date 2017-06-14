package org.cap.demo;

public class SalesClass {
	private int[] arr={1,2,3,4,65};
	
	public void printData(){
		int sum=0;
		System.out.println("Array Elements:");
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Sum of Array:" + sum);	
	}

}
