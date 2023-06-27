// https://my.newtonschool.co/playground/code/5zfezaoj3b0i

// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
// 	public static void main (String[] args) {
//                       // Your code here
//         Scanner sc = new Scanner(System.in);
//         int testCases = sc.nextInt();

//         for(int i = 1; i <= testCases; i++)
//         {
//             int arrSize = sc.nextInt();
//             int sum = sc.nextInt();
//             int arr[] = new int[arrSize];

//             for(int j = 0; j < arrSize; j++)
//                 arr[j] = sc.nextInt();
//             System.out.println(pairFound(arr, arrSize, sum));   
//         }
// 	}

//     static int pairFound(int arr[], int arrSize, int sum)
//     {
//         HashSet<Integer> hSet = new HashSet<>();
//         for(int i = 0; i < arrSize; i++)
//         {
//             int complement = sum-arr[i];
//             if(hSet.contains(complement) == true)
//                return 1;
//             hSet.add(arr[i]);
//         }

//         return 0;
//     }
// }

// // Stack
// import java.util.Stack;
// import java.util.Iterator;
// class Main{
//     public static void main(String args[])
//     {
//         Stack<Integer> s= new Stack<>();
//         System.out.println(s);
//         System.out.println(s.isEmpty());
//         s.push(10);
//         System.out.println(s);
//         System.out.println(s.isEmpty());
//         System.out.println(s.peek());
//         s.push(20); s.push(30); s.push(40); s.push(50);
//         System.out.println(s);
//         int val = s.pop();
//         System.out.println(val);
//         System.out.println(s);
//         System.out.println(s.search(20));
//         System.out.println(s.search(230)); // if element not found, returns -1, else returns the index from the top
//         System.out.println(s);
//         System.out.println(s.size());

//         Iterator iterator = s.iterator();
//         while(iterator.hasNext())
//             System.out.println(iterator.next());
//     }
// }

// Stack implementation using Array

class StackImpl
{
    int maxSize, top;
    int [] stackArray;

    StackImpl(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
}
class Main{
    public static void main(String args[])
    {
        
        System.out.println();
    }
}