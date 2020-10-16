package arraysQuestions;

import java.util.Scanner;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			int min = arr[0];
			for(int i=0; i<n; i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			
				if(min>arr[i]) {
					min = arr[i];
				}
			}
		System.out.println("min  "+min+" max   "+max);
		}
	}

}
