// // // Stack Implementation using ArrayList
// import java.util.ArrayList;
// class Stack
// {
//     ArrayList<Integer> stack;

//     Stack()
//     {
//         stack = new ArrayList<>();
//     }

//     boolean isEmpty()
//     {
//         return stack.isEmpty();
//     }

//     int size()
//     {
//         return stack.size();
//     }

//     void push(int element)
//     {
//         stack.add(element);
//     }

//     int pop()
//     {
//         if(isEmpty())
//         {
//             System.out.println("Underflow");
//             return -1;
//         }
//         return stack.remove(stack.size()-1);
//     }

//     int peek()
//     {
//         if(isEmpty())
//         {
//             System.out.println("Underflow");
//             return -1;
//         }
//         return stack.get(stack.size()-1);
//     }
// }
// class Main{
//     public static void main(String args[])
//     {
//         Stack stack = new Stack();
//         stack.push(1);  stack.push(2);  stack.push(3);

//         System.out.println("Size of stack: "+stack.size());
//         System.out.println("Top element: " +stack.peek());
        
//         System.out.println("Popping elements: ");
//         while(!stack.isEmpty()) // while the stack is not empty
//         {
//             System.out.println(stack.pop()); // pop
//         }
//     }
// }


// Given a string S, reverse the string using stack.
import java.util.Stack;

class StringReversal
{
    String reverseString(String input) // input="abc"
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< input.length(); i++)
        {
            stack.push(input.charAt(i)); // a, b, c
        }

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty())
        {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}

 class Main
{
    public static void main(String args[])
    {
        String input = "abc";
        StringReversal sr = new StringReversal();
        String reversed = sr.reverseString(input);
        System.out.println("Reversed String: "+reversed);
    }
}

// // https://my.newtonschool.co/playground/code/tmv8xak4u2xk
// public static void push(Stack<Integer> st, int x)
//     {
//         // your code here
//         st.push(x);
//     }

//     // Function to pop element from Stack
//     public static void pop(Stack<Integer> st)
//     {
//         //your code here
//         if (!st.isEmpty()) {
//             st.pop();
//         }
//     }

//     public static void top(Stack<Integer> st)
//     {
//         // your code here
//         if (!st.isEmpty()) {
//             System.out.println(st.peek());
//         } else {
//             System.out.println(0);
//         }
//     }

// https://my.newtonschool.co/playground/code/b0c7lp8j80x1
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0 || st.peek()!=s.charAt(i))st.push(s.charAt(i));
        }
        String ans="";
        while(st.size()>0){
            ans=st.peek()+ans;
            st.pop();
        }
        System.out.print(ans);
    }
}