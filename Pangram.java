import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Pangram{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the string : ");
			String str = sc.nextLine();

			if(isPangram(str)){
				System.out.println("\n"+str+" -> Is Pangram.");
			}else {
				System.out.println("\n"+str+" -> Not Pangram!!");
			}
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static boolean isPangram(String str){

		if(str.isEmpty()) return false;

		str = str.toLowerCase();
		Set<Character> set = new HashSet<>();

		for(char ch : str.toCharArray()){
			if(Character.isLetter(ch)){
				set.add(ch);
			}
		}

		return set.size() == 26;
	}
}