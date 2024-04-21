import java.util.Scanner;
public class ConvertingStringToUpperCaseWithoutBuiltInMethod{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the string : ");
		String str = sc.nextLine();

		str = convertToUpperCase(str);

		System.out.println("\nAfter Converting : "+str);

		sc.close();
	}
	public static String convertToUpperCase(String str){

		StringBuilder sb =  new StringBuilder("");

		for (int i = 0; i < str.length() ; ++i ) {

			 char currentChar = str.charAt(i);

			 if(currentChar >= 'a'  && currentChar <= 'z'){

			 	 sb.append((char) (currentChar - 32));
			 }else{

			 	sb.append(currentChar);
			 }
		}

		return sb.toString();
	}
}