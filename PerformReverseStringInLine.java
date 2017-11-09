import java.util.Scanner;
public class Answer implements ReverseStringInLineInterface {
                 @Override
	public  String PerformReverseStringInLine(String str) {
if (str == null)
return null;
	        StringBuilder sb = new StringBuilder(str.length() + 1);
        	String[] words = str.split(" ");
        	if (words.length == 0)
        	return str;
        	for (int i = words.length - 1; i >= 0; i--) {
        	sb.append(words[i]).append(' ');
       }
       return sb.toString().trim();
	}
@SuppressWarnings("unused")
	public static void main(String[] args){
		Answer obj = new Answer();
		System.out.println("Enter the words in a line:");
		Scanner input = new Scanner(System.in);
	
	String line = input.nextLine();
	String reversedString = obj.PerformReverseStringInLine(line);
	System.out.println("The Reversed String is : " + reversedString);
	input.close();
	
	}
}
