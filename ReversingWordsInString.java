import java.util.Scanner;
public class ReversingWordsInString{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the string : ");
		String str = sc.nextLine();

		System.out.println("\nBefore Reversing : "+str);

		String rev = reverseWords(str);

		System.out.println("\nAfter Reversing : "+rev);

		sc.close();
	}
	public static String reverseWords(String str){

		String words[] = str.split(" ");

		StringBuilder rev =new StringBuilder();

		for (int i = words.length-1; i >= 0 ; --i ) {

			rev.append(words[i]).append(" ");
		}
		return rev.toString().trim(); // trim() To Remove Trailing Space
	}
}