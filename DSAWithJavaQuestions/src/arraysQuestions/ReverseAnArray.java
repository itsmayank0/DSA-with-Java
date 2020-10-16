package arraysQuestions;
import java.util.Scanner;

public class ReverseAnArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String s = sc.nextLine();
		    char[] a = s.toCharArray();
		    int min = 0;
		    int max = s.length()-1;
		    while(max>min){
		        char temp = a[min];
		        a[min] = a[max];
		        a[max] = temp;
		        max--;
		        min++;
		    }
		    System.out.println(new String(a));
		}
	}
}
