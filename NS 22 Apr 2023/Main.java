// https://my.newtonschool.co/playground/code/qmggz2y9icjj/
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for(int i=n-1; i>=n-4; i--)
            sum += arr[i];
        System.out.println(sum);	
    }
}


