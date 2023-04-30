// StringTokenizer
// It allows you to break a String into tokens based on space

// import java.util.StringTokenizer;

// public class Main{
    

//     public static void main(String []args)
//     {
//         StringTokenizer obj = new StringTokenizer("Welcome to my class"," ");

//         System.out.println(obj);
//         while(obj.hasMoreTokens())
// 		{
//             System.out.println(obj.nextToken());
//         }
//     }
// }

// StringTokenizer
// It allows you to break a String into tokens based on colon (;)

// import java.util.StringTokenizer;
// public class Main
// {
//         public static void main(String []args)
//     {
//         String a = " : ";
//         String b = "Welcome : to : Newton : School : How : are : you : ?";
//         StringTokenizer c = new StringTokenizer(b, a);
//         int count1 = c.countTokens();

//         for(int i=0; i<count1; i++)
//             System.out.println("token [" + i + "] : " + c.nextToken());

        
//     }
// }

// StringBuilder 

import java.util.StringTokenizer;
public class Main
{
        public static void main(String []args)
    {
        String s = new String("Darshan");
        System.out.println(s);
        

        StringBuilder sb = new StringBuilder("Newton");
        System.out.println(sb);
        System.out.println(sb.capacity()); // actual length + 16 additional characters
        System.out.println(sb.length()); // actual length
        System.out.println(sb.append(" School"));
        System.out.println(sb.capacity()); // actual length + 16 additional characters
        System.out.println(sb.length()); // actual length
        System.out.println(sb.append(" has a faculty named Dr. Darshan Ingle"));
        System.out.println(sb.capacity()); // actual length + 16 additional characters
        System.out.println(sb.length()); // actual length
        System.out.println(sb.append("."));
        System.out.println(sb.capacity()); // actual length + 16 additional characters
        System.out.println(sb.length()); // actual length
        sb.replace(0, 3, "Fan");
        System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        sb.insert(0, "The ");
        System.out.println(sb);
        sb.delete(4, 7);
        System.out.println(sb); 
    }
}

// https://my.newtonschool.co/playground/code/rv593clig4ml/
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        StringTokenizer st
            = new StringTokenizer(br.readLine());
        int n = 1;

        StringBuilder ans = new StringBuilder();

        while(st.hasMoreTokens()){
            StringBuilder s = new StringBuilder(st.nextToken());

            if(n % 2 == 0){
                ans.append(s.reverse() + " ");
            }
            else{
                ans.append(s + " ");
            }
            n++;
        }

        System.out.println(ans);
    }
}

// https://my.newtonschool.co/playground/code/skrxdjy2fljr/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c != 'a') {
                sb.append(c);
            }
        }
        boolean ok = true;
        if (sb.length() % 2 == 0) {
            int length = sb.length()/2;
            for (int i=0; i<length; i++) {
                if (sb.charAt(i) != sb.charAt(i+length)) {
                    ok = false;
                    break;
                }
            }
            if (S.lastIndexOf('a') >= S.length() - length) {
                ok = false;
            }
            if (ok) {
                System.out.println(S.subSequence(0, S.length() - length));
            }
        } else {
            ok = false;
        }
        if (!ok) {
            System.out.println(":(");
        }
    }

}
