import java.lang.*;
import java.util.Scanner;

public class findbig{
	public static void main(String[] args){
		int[] arr = {0,1,0,0,4,5,6,9,0,0};
		int sum = 0; int big = 0;
		for(int i=0; i<arr.length-1;i++){
			sum = arr[i]+arr[i+1];
			if(big < sum){
				big = sum;
			}	
		}
		System.out.println(big);
	}
}
