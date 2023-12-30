import java.lang.*;

public class printarrval{

	public static void main(String Args[]){

		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int outputCount = 3 , gap = 3;
		if(outputCount < a.length){
			if(gap < a.length){
				for(int i =0;i<outputCount; i++){
					int total = 0;
					for(int j=i; j<a.length;j = j+gap){
						total = total + a[j];
					}
					System.out.println(total);						
				}
			}else {
				System.out.println(gap +"is graeater than Array length of " + a.length);
			}
		}else{
			System.out.println(outputCount +"is graeater than Array length of " + a.length);			
		}
	}

}