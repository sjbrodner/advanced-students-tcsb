import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class PalindromeFinder {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
        	Palindrome p = new Palindrome();
		try{ 
			BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
			String line;
			while((line = reader.readLine()) != null){
				if(p.isPalindrome(line)){
					s.add(line);
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.println();
			System.out.println("Please Enter a Word: ");
			String test = reader.nextLine(); 
			System.out.println("is palindrome: " + p.isPalindrome(test));
			System.out.println("is in set: " + s.contains(test));
		
		}
    }

}
