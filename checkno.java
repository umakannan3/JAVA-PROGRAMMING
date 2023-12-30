import java.lang.*;

public class checkno{
	public static void main(String args[]){
	int arr[] = {1,8,3,6,5,19};
	int x=4 , y=10 ,i=0;
	if(x<y){
	while(i < arr.length){
		if(arr[i] > x && arr[i] < y){
			System.out.println(arr[i]);
		}
	i++;
	} 
	}else {
	System.out.println("Data Mismatch");
	}
}
}