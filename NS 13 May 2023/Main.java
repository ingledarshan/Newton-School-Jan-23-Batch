// WAP that uses function to count the number of 1 bits in an integer
// import java.util.Scanner;
// public class Main {
    
//     public static int countOnes(int num)
//     {
//         int count = 0;
//         while(num!=0)
//         {
//             System.out.println("num&1: "+(num&1));
//             count += num&1;
//             num >>= 1;
//             System.out.println("num: "+num);
//         }
//         return count;
//     }

//     public static void main(String[] args) 
//     {
        
//         int num = 23;
//         // int num = 13243;
//         // int num = 3456;
//         int ones = countOnes(num);
//         System.out.println("The number of 1 bits in "+num+" is "+ones);
//     }
// }

// or
// import java.util.Scanner;
// public class Main {
    
//     public static int countOnes(int num)
//     {
//         return Integer.bitCount(num);
//     }

//     public static void main(String[] args) 
//     {
        
//         int num = 23;
//         // int num = 13243;
//         // int num = 3456;
//         int ones = countOnes(num);
//         System.out.println("The number of 1 bits in "+num+" is "+ones);
//     }
// }

// WAP that finds the pair of integers in an array with minimum XOR value.
import java.util.Scanner;
public class Main {
    
    public static int findMinimumXOR(int [] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                int xor = arr[i] ^ arr[j];
                if(xor<min)
                    min = xor;
                System.out.println(arr[i]+","+arr[j]);
            }
        }
        return min;
    }

    public static void main(String[] args) 
    {
        
        int [] arr = {3,6,9,2,7,1};
        int min = findMinimumXOR(arr);
        System.out.printf("The minimum XOR value in the array is %d", min);
        // System.out.print("The minimum XOR value in the array is " + min);
    }
}
