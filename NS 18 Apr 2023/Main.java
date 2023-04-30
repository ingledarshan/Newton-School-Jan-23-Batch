// WAP to merge two sorted arrays into another sorted array.
// public class Main
// {
	
// 	public static int[] mergeSort(int arr1[], int arr2[]){
//         int merged[] = new int[arr1.length + arr2.length];
//         int i=0, j=0, k=0;
//         while(i < arr1.length && j < arr2.length){
//             if(arr1[i] < arr2[j]){
//                 merged[k++] = arr1[i++];
//             }
//             else{
//                 merged[k++] = arr2[j++];
//             }
//         }
//         while(i < arr1.length){
//             merged[k++] = arr1[i++];
//         }
//         while(j < arr2.length){
//             merged[k++] = arr2[j++];
//         }
//         return merged;
//     }
	
// 	public static void main(String[] args) {
// 		int arr1[] = {1, 3, 5, 7, 9, 13, 24 , 25, 27, 29}; // Sorted array
//         int arr2[] = {2, 4, 6, 8, 12, 16, 17}; // Sorted array
//         int merged[] = mergeSort(arr1, arr2);
//         for(int i=0; i<merged.length; i++){
//             System.out.print(merged[i]+" ");
//         }
// 	}
// }


// Merge Sort
public class Main
{
	
	public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void merge(int arr[], int lb, int mid, int ub)
    {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
            L[i] = arr[lb+i];

        for(int j=0;j<n2;j++)
            R[j] = arr[mid+1+j];

        int i=0;
        int j=0;
        int k = lb;

        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2)
        {
                arr[k] = R[j];
                j++;
                k++;
        }
    }

    public static void mergeSort(int arr[], int lb, int ub)
    {
        if(lb<ub)
        {
            int mid = (lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr, lb, mid, ub);
        }
    }
	
	public static void main(String[] args)
    {
		int arr[] = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting:");
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting:");
        printArray(arr);
    }
}