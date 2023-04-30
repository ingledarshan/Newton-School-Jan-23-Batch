// WAP to merge two sorted arrays into another sorted array.
public class Main
{
	
	public static int[] mergeSort(int arr1[], int arr2[]){
        int merged[] = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            merged[k++] = arr1[i++];
        }
        while(j < arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
	
	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7, 9, 13, 24 , 25, 27, 29}; // Sorted array
        int arr2[] = {2, 4, 6, 8, 12, 16, 17}; // Sorted array
        int merged[] = mergeSort(arr1, arr2);
        for(int i=0; i<merged.length; i++){
            System.out.print(merged[i]+" ");
        }
	}
}
