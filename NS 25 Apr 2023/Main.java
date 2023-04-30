import java.util.*;
public class Main
{
    
    public static void  counting_sort(int array[], int size, int place) {
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
          if (array[i] > max)
            max = array[i];
        }
        int[] count = new int[max + 1];
    
        for (int i = 0; i < max; ++i)
          count[i] = 0;
    
        // Calculate count of elements
        for (int i = 0; i < size; i++)
          count[(array[i] / place) % 10]++;
    
        // Calculate cumulative count
        for (int i = 1; i < 10; i++)
          count[i] += count[i - 1];
    
        // Place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
          output[count[(array[i] / place) % 10] - 1] = array[i];
          count[(array[i] / place) % 10]--;
        }
    
        for (int i = 0; i < size; i++)
          array[i] = output[i];
      }
    
      // Function to get the largest element from an array
      int getMax(int array[], int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
          if (array[i] > max)
            max = array[i];
        return max;
      }

    public static void radix_sort(int arr[], int n)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            // compare all elements with max
            // assign maximum value to max
            max = Math.max(max, arr[i]);
        }
        System.out.print("\n\nMax i.e. max= "+max);

        // Apply counting sort to sort elements based on place value
        for(int place=1; max/place > 0 ; place*=10)
            counting_sort(arr, n, place);
    }


    public static void main(String[] args) 
    {
	    int arr[] = { 5,17,8,785,890,889,431,052,443,99,692 };
        int n = arr.length;
        System.out.println("Entered Array is:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");	
        radix_sort(arr, n);
        System.out.println();
        System.out.println("\n\nSorted Array is:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");	
    }
}


// https://my.newtonschool.co/playground/code/3bc40g451fn0/

public static int[] implementMergeSort(int arr[], int start, int end){
    if(start<end){
        int mid = start+(end-start)/2;
        implementMergeSort(arr,start,mid);
        implementMergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    return arr;
}
private static void merge(int[] arr, int start, int mid, int end){
    int[] merged = new int[end-start+1];
    int idx1 = start;
    int idx2 = mid+1;
    int x = 0;
    while(idx1<=mid && idx2<=end){
        if(arr[idx1]<=arr[idx2]){
            merged[x++] = arr[idx1++];
        }
        else{
            merged[x++] = arr[idx2++];
        }
    }
    while(idx1<=mid){
        merged[x++] = arr[idx1++];
    }
    while(idx2<=end){
        merged[x++] = arr[idx2++];
    }
    for(int i=0, j=start; i<merged.length; i++, j++){
        arr[j] = merged[i];
    }
}