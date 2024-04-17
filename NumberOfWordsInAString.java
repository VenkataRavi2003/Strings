import java.util.Scanner;
public class NumberOfWordsInAString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the string : ");
		String str =  sc.nextLine();

		int wordsCount = findWordsCount(str);

		System.out.println("\nno.of words : "+wordsCount);

		sc.close();
	}
	public static int findWordsCount(String str){

		String words[] = str.split(" ");

		return words.length;
	}
}