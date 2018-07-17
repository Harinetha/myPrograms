import java.util.*;
 
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stk = new Stack<Character>();
        String str= scan.next();        
        int len = str.length();
        for (int i = 0; i <len/2; i++)
        {    
            char ch = str.charAt(i);
                stk.push(ch);
           
        }
        if(len%2!=0)
        stk.push(str.charAt(len/2));
        for (int i = len/2; i < len; i++)
        {    
            char ch = str.charAt(i);
                if(ch==stk.peek())
                stk.pop();
           
        }
        if (!stk.isEmpty() )
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
