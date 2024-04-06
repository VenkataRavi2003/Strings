import java.util.Scanner;
import java.util.Arrays;
class AnagramChecking{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the 1st string : ");
		String s1=sc.next();
		System.out.print("\nEnter the 2nd string : ");
		String s2=sc.next();
		if(isAnagrams(s1,s2)){
			System.out.println("\n"+s1+" && "+s2+" are anagrams.");
		}else{
			System.out.println("\n"+s1+" && "+s2+" are not anagrams..!");
		}
		sc.close();
	}
	public static boolean isAnagrams(String s1,String s2){
		char ch1[]=s1.toLowerCase().toCharArray();
		char ch2[]=s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1,ch2);
	}
}
