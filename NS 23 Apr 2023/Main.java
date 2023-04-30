import java.util.*;
public class Main
{
    public static void counting_sort(int arr[], int n)
    {
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
        // compare all elements with max
        // assign maximum value to max
        k = Math.max(k, arr[i]);
        }
        System.out.print("\n\nMax i.e. k= "+k);
        int count[] = new int[k+1];
        for(int i=0;i<=k;i++)
            count[i] = 0;
        System.out.println("\n\nInitial Count Array is:");
        for(int i=0;i<=k;i++)
            System.out.print(count[i]+" ");
        for(int i=0;i<n;i++)
            ++count[arr[i]];
        System.out.println("\n\nFinal Count Array is:");
        for(int i=0;i<=k;i++)
            System.out.print(count[i]+" ");

        for(int i=1;i<=k;i++)
            count[i] = count[i] + count[i-1];

        System.out.println("\n\nCumulative Count Array is:");
        for(int i=0;i<=k;i++)
            System.out.print(count[i]+" ");

        int b[] = new int[n];
        for(int i=0;i<n;i++)
            b[i] = 0;
        
        System.out.println("\n\nb Array is:");
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");

        for(int i=n-1; i>=0; i--)
            b[--count[arr[i]]] = arr[i];

        System.out.println("\n\nSorted b Array is:");
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");

        for(int i=0;i<n;i++)
            arr[i] = b[i];
    }

    public static void main(String[] args) 
    {
	    int arr[] = { 2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9 };
        int n = arr.length;
        System.out.println("Entered Array is:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");	
        counting_sort(arr, n);
        System.out.println();
        System.out.println("\n\nSorted Array is:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");	
    }
}


// Drawbacks:
// Values must be repeating, else dont go for this
// It doesnt work on Negative values
// // It doesnt work on floating values
// Not advisable to use if the values are placed very much away from each other {1, 9999, 5, 199}