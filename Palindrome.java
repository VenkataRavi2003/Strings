import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the string : ");
		String str=sc.nextLine();

		if(isPalindrome(str)){
			System.out.println("\n"+str+" -> Is Palindrome.");
		}else{
			System.out.println("\n"+str+" -> Not Palindrome !!");
		}
		sc.close();
	}
	public static boolean isPalindrome(String str){
		str=str.toLowerCase().replaceAll(" ","");
		int n=str.length();
		
		for (int i = 0; i < str.length(); ++i){
			if(str.charAt(i) != (str.charAt(--n))){
				return false;
			}
		}
		return true;
	}
}