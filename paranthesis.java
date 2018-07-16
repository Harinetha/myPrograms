 
import java.util.*;
 
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();
        String str= scan.next();        
        int len = str.length();
        for (int i = 0; i < len; i++)
        {    
            char ch = str.charAt(i);
            if (ch == '(')
                stk.push(i);
            else if (ch == ')')
            {
                stk.pop();
            }            
        }
        if (!stk.isEmpty() )
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
