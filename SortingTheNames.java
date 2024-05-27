import java.util.Scanner;
public class SortingTheNames{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();
		sc.nextLine();
		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!!");
			sc.close();
			return;
		}

		String[] names = new String[size];

		System.out.println("\nEnter the names : ");
		takeInput(names,sc);

		System.out.println("\nBefore Sorting : ");
		printArray(names);

		bubbleSort(names);

		System.out.println("\nAfter Sorting : ");
		printArray(names);

		sc.close();

	}
	public static void takeInput(String names[],Scanner sc){
		for (int i = 0; i < names.length ; ++i) {
			names[i] = sc.nextLine();
		}
	}
	public static void printArray(String names[]){
		for (String name : names) {
			System.out.println(name);
		}
	}
	public static void bubbleSort(String names[]){
		for (int i = 0; i < names.length ; ++i) {
			for (int j = 0 ; j < names.length - 1 - i ; ++j) {
				
				if(names[j].compareTo(names[j+1]) > 0){
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
	}
}