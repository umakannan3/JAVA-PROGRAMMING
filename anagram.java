import java.lang.*;

public class anagram{
	public static void main(String Args[]){
		String s1 = "mat";
		String s2 = "act";
			for(int i =0;i<s1.length();i++){
				for(int j=0 ; j<s2.length();j++){
					if(s1.charAt(i) == s2.charAt(j)){
						s2 = s2.replaceFirst(""+ s1.charAt(i) , "");
						break;
					}
				}
			}
			if(s2.length() == 0){
					System.out.println("Given word is anagram");
			}else {
			System.out.println("Given word is not anagram");
			}
	}
}