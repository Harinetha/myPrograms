import java.util.*;
public class Lexi {

	 public static void main (String[] args)
	    {
	        Stack<Character> stack = new Stack<Character>();
	        Scanner s = new Scanner( System.in );
	        String str = s.next();
	        int l = str.length();
	        for(int i = l -1 ; i >= 0 ; i--){
	        	stack.push(str.charAt(i));
	        }
	        while(stack.peek() <= str.charAt(0)){
	        		stack.pop();
	        		l--;
	        }
	        for(int i = 0 ; i < l; i++){
	        	System.out.print(stack.pop());
	        }
	       
	    }

}
