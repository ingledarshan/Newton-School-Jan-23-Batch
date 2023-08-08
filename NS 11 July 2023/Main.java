// https://my.newtonschool.co/playground/code/nsxezlr8xiu6
import java.util.Scanner;;
class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int []stream = new int[N];
        for(int i=0; i<N; i++) 
            stream[i] = scanner.nextInt();

        calculateWindowAverages(stream, N, W);
        scanner.close();
    }

    static void calculateWindowAverages(int []stream, int N, int W)
    {
        int sum = 0;


        //Calculate the sum of first window
        for(int i=0; i<W && i<N; i++)
        {
            sum += stream[i];
            System.out.print(sum/(i+1)+" ");
        } 

        // System.out.print(sum/Math.min(W, N)+" ");

        // Slide the window through the stream
        for(int i=W; i<N; i++)
        {
            sum += stream[i] - stream[i-W]; // Update the sum by adding the current element and removing the element from the previous window
            System.out.print(sum/W+" ");
        }
    }
}

// OR

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<w;i++){
            sum += arr[i];
            System.out.print(sum/Math.min(w, i+1)+" ");
        }
        
        for(int i=w;i<n;i++){
            sum += arr[i]-arr[i-w];
            System.out.print(sum/w+" ");
        }
    }
}