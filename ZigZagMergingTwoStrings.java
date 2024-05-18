import java.util.Scanner;
public class ZigZagMergingTwoStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter 1st String : ");
		String s1 = sc.nextLine();

		System.out.print("\nEnter 2nd String : ");
		String s2 = sc.nextLine();

		String res = zigZagMerge(s1,s2);

		System.out.println("\nAfter ZigZag Merging S1 & S2 strings :: "+res);

		sc.close();
	}
	public static String zigZagMerge(String s1,String s2){
		StringBuilder sb = new StringBuilder();

		int maxLength = (s1.length() > s2.length()) ? s1.length() : s2.length();

		for (int i = 0; i < maxLength ; ++i) {
			
			if(i < s1.length()){
				sb.append(s1.charAt(i));
			}
			if(i < s2.length()){
				sb.append(s2.charAt(i));
			}
		}
		return sb.toString();
	}
}