import java.util.Scanner;
public class SortTheNamesInArray{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.print("\nEnter the size of array : ");
		 int size = sc.nextInt();

		 sc.nextLine();

		 String[] names = new String[size];

		 System.out.println("\nEnter the names : ");
		 takeInput(names,sc);

		 System.out.println("\nBefore Sorting : ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		 printNamesArray(names);

		 sortNamesArray(names);

		 System.out.println("\nAfter Sorting : ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		 printNamesArray(names);

		 sc.close();
	}
	public static void takeInput(String[]names , Scanner sc){

		for (int i = 0; i < names.length ; ++i) {
			names[i] = sc.nextLine();
		}
	}
	public static void printNamesArray(String[]names){
		for (String name : names) {
			System.out.println(name);
		}
	}
	public static void sortNamesArray(String[] names){

		for (int i = 0 ; i < names.length; ++i) {
			for (int j = 0 ; j < names.length - i - 1 ; ++j) {
				
				if(names[j].compareTo(names[j+1]) > 0){
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	}
}