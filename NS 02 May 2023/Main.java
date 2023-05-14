// WAP to find if the input number is prime or not.
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner st = new Scanner(System.in);
//       int i;
// 		int n = st.nextInt();
		
// 		boolean isPrime = true;
		
// 		if(n<=1)
// 		isPrime = false;
// 		else{
// 		    for( i =2; i<=Math.sqrt(n); i++){
// 		        if(n%i==0){
// 		            isPrime = false;
// 		            break;
// 		        }
//               System.out.print(i+" ");
// 		    }
// 		}
//       System.out.println();

// 		if(isPrime==true){
// 		    System.out.println(n+" is Prime.");
// 		}else
// 		{
// 		System.out.println(n+" is not Prime.");
// 		}
// 	}
// }

// WAP to print prime numbers between m and n, where m and n are accepted from the user.
// import java.util.*;
// public class Main{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter a number: ");
// 		int m = sc.nextInt();
// 		System.out.println("Enter another number: ");
// 		int n = sc.nextInt();
// 		for(int p=m;p<=n;p++){
// 		    boolean flag = true;
// 		    for(int i=2;i*i<=p;i++){
// 		        if(p%i==0){
// 		            flag = false;
// 		            break;
// 		        }
// 		    }
// 		    if(flag){
// 		        System.out.print(p+" ");
// 		    }
// 		}
// 	}
// }


// Automorphic
// Akshay Kumar
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		String s1 = ""+n;
		long ans = n*n;
		String s2 = ""+ans;
		if(s2.endsWith(s1)){
		    System.out.println(n+" is an automorphic number.");
		}
		else{
		    System.out.println(n+" is not an automorphic number.");
		}
	}
}


