import java.util.Scanner;
public class DuplicateWords{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the string : ");
		String str=sc.nextLine();
		findDuplicates(str);
	}
	public static void findDuplicates(String str){
		String words[] = str.split(" ");
		
		for(int i=0;i<words.length;++i){
			int count = 1;
			for(int j=i+1; j<words.length; ++j){
				if(words[i].equals(words[j])){
					++count;
					words[j] = "0";
				}
			}
			if(count>1 && words[i]!="0"){
				System.out.println(words[i]);
			}
		}
	}
}