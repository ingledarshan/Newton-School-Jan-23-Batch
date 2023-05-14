
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
                System.out.println(arr[i]+","+arr[j]+" >XOR value: "+xor);
            }
        }
        return min;
    }

    public static void main(String[] args) 
    {
        
        int [] arr = {3,6,9,2,7,1};
        int min = findMinimumXOR(arr);
        System.out.printf("\nThe minimum XOR value in the array is %d", min);
        // System.out.print("The minimum XOR value in the array is " + min);
    }
}
