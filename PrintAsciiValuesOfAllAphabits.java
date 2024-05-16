public class PrintAsciiValuesOfAllAphabits{
	public static void main(String[] args) {
		
		System.out.println("Upper Case [A - Z] Ascii Values : ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (char ch = 'A'; ch <= 'Z' ; ++ch) {
			System.out.print((int)ch+",");
		}

		System.out.println("\nLower Case [a - z] Ascii Values : ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (char ch = 'a'; ch <= 'z' ; ++ch) {
			System.out.print((int)ch+",");
		}
	}
}