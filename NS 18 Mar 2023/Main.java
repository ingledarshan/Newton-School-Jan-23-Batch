// Pending in class assignments
// https://my.newtonschool.co/playground/code/mjvhfd42nojh/

// BufferedReader Class for taking input from the user
// import java.io.*;
// class Main
// {
//     public static void main(String[] args) throws IOException
//     {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // this class always accepts the input in the String format only
//         System.out.print("Enter your name:");
//         String s;
//         s = br.readLine(); // accept the input given by user and save it in string format
//         System.out.print("Entered name is: "+s);
//     }
// }

// Add two numbers
// import java.io.*;
// class Main
// {
//     public static void main(String[] args) throws IOException
//     {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // this class always accepts the input in the String format only
//         String s;

//         System.out.print("Enter no1:");
//         s = br.readLine();
//         int no1 = Integer.parseInt(s);

//         System.out.print("Enter no2:");
//         s = br.readLine();
//         int no2 = Integer.parseInt(s);

//         int res = no1+no2;
//         System.out.print("Addition= "+res);
//     }
// }

// Array Transpose
// import java.io.*;
// public class Main
// {  
//     public static void main(String args[]) throws IOException
//     {  
//     //creating a matrix  
//     int original[][]={
//                         {1,3,4},        
//                         {2,4,3},    
//                         {3,4,5}
//                     };    
      
//     System.out.println("Printing Matrix without transpose:");  
//     for(int i=0;i<3;i++){    
//     for(int j=0;j<3;j++){    
//     System.out.print(original[i][j]+" ");    
//     }    
//     System.out.println();//new line    
//     }    
//     System.out.println("Printing Matrix After Transpose:");  
//     for(int i=0;i<3;i++){    
//     for(int j=0;j<3;j++){    
//     System.out.print(original[j][i]+" ");    
//     }    
//     System.out.println();//new line    
//     }    
//     }}  

// import java.io.*;
// import java.util.*;


// class Main
// {
// 	public static void main (String[] args) throws IOException
// 	{

// 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// 		int n=Integer.parseInt(br.readLine());
// 		String arr[][]=new String[n][n];
// 		String transpose[][]=new String[n][n];
// 		int row;
// 		int cols;
// 		for(row=0;row<n;row++)
// 		{
// 			String rowNum=br.readLine();
// 			String rowVals[]=rowNum.split(" ");
// 			for(cols=0; cols<n;cols++)
// 			{
// 				arr[row][cols]=rowVals[cols];
// 			}
// 		}
// 		for(row=0;row<n;row++)
// 		{
// 		for(cols=0; cols<n;cols++)
// 			{
// 				transpose[row][cols]=arr[cols][row];
// 			    System.out.print(transpose[row][cols]+" ");
// 			}
// 		    System.out.println();
// 	    }

// }
// }


// https://my.newtonschool.co/playground/code/mjvhfd42nojh/
// import java.io.*;
// import java.lang.*;
// import java.util.*;

// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while(t-- > 0)
//         {
//             int n1 = sc.nextInt();
//             int m1 = sc.nextInt();
            
//             int arr1[][] = new int[n1][m1];
            
//             for(int i = 0; i < n1; i++)
//             {
//                 for(int j = 0; j < m1; j++)
//                  arr1[i][j] = sc.nextInt();
//             }
//             boundaryTraversal(n1, m1,arr1);
//             System.out.println();
            
//         }
//     }

// static void boundaryTraversal( int n1, int m1, int arr1[][])
//     {
//         // base cases
//         if(n1 == 1)
//         {
//             int i = 0;
//             while(i < m1)
//             System.out.print(arr1[0][i++] + " ");
//         }
//         else if(m1 == 1)
//         {
//             int i = 0;
//             while(i < n1)
//             System.out.print(arr1[i++][0]+" ");
//         }
//         else
//         {
            
//             // traversing the first row
//             for(int j=0;j<m1;j++)
//             {
//                 System.out.print(arr1[0][j]+" ");
//             }
            
//             // traversing the last column
//             for(int j=1;j<n1;j++)
//             {
//                 System.out.print(arr1[j][m1-1]+ " ");
//             }
            
//             // traversing the last row
//             for(int j=m1-2;j>=0;j--)
//             {
//                 System.out.print(arr1[n1-1][j]+" ");
//             }
            
//             // traversing the first column
//             for(int j=n1-2;j>=1;j--)
//             {
//                System.out.print(arr1[j][0]+" ");
//             }
            
//         } 
            
//     }
// }

// String
// https://my.newtonschool.co/playground/code/kqo6d5ef9fuz/
// https://my.newtonschool.co/playground/code/zffuaabg48ho/

// https://my.newtonschool.co/playground/code/p04sxxa2yddb/
// class Solution {
//     public static void SumAndMean(int arr[],int N){
//       //Enter your code here
//       int sum=0;
//       int mean=0;
//       for (int i=0;i<N;i++)
//       {
//         sum=sum+arr[i];
//       }   
//       mean=sum/N;
//       System.out.println(sum+" "+mean);
      
//         }
//     }

// String are Immutable i.e. Fixed or Rigid or something which cannot be changed

class Main
{
    public static void main(String[] args)
    {
        String s1="NS";
        System.out.println(s1);
        s1 = s1.concat(" students");
        System.out.println(s1);
    }
}