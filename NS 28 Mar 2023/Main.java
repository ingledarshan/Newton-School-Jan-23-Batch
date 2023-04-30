//Factorial of a number
// import java.util.*;

// public class Main{
    

//     public static void main(String []args)
//     {
        
//         int i, f, no;
//         Scanner sc = new Scanner(System.in);
//         no = sc.nextInt(); // 5
//         if (no<0)
//         {
//             System.out.println("Factorial of negative number doesnt exist.");
//         }
//         else
//         {
//             f = 1;
//             for(i=1;i<=no;i++)
//                 f = f*i;
//             System.out.println(f);
//         }
        
//     }
// }

// Factorial using UDF
import java.util.*;

class Fac
{
    int factorial_cal(int no)
    {
        int i, f=1;
        for(i=1;i<=no;i++)
            f = f*i;
        return f;
    }
}
public class Main{

    public static void main(String []args)
    {
        
        int no;
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt(); // 5
        if (no<0)
        {
            System.out.println("Factorial of negative number doesnt exist.");
        }
        else
            {
                Fac f = new Fac();
                int res = f.factorial_cal(no);
                System.out.println(res);
            }
        
    }
}