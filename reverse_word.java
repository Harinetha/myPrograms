import java.io.*;
import java.util.*;;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String[] words=s.split("\\s");  
        for(int i=0;i<words.length;i++)  
        {
         String reverse = new StringBuffer(words[i]).reverse().toString();
         System.out.println(reverse);
        }
	}
}

