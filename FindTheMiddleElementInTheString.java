import java.util.Scanner;
class FindTheMiddleElementInTheString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the string -> ");
		String str=sc.nextLine();
		int middleElementIndex=str.length()/2;
		System.out.println("\nMiddle Element In The -> "+str+" is : "+str.charAt(middleElementIndex));
		sc.close();
	}
}
