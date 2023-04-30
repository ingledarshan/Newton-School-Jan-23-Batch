// WAP to implement Tower of Hanoi using recursion
import java.util.*;
public class Main
{
	static void TOH(int n, int A, int B, int C)
	 {
	   if (n>0)
	   {
		TOH(n-1, A,C,B);
		System.out.println("Move a disc from " +A+" to " + C);
		TOH(n-1, B, A, C);
	   }
	 }
	
	public static void main(String[] args) 
	{
	   int n;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number of discs: ");
	   n = sc.nextInt();
	   TOH(n,1,2,3); 
	}
}


// https://my.newtonschool.co/playground/code/xvtepf2kyxaf/

static int  Multiply(int  n, int m) 
    { 
      if(n==0 || m==0)
          return 0;
      
      if (m == 1) 
          return n;

      return n + Multiply(n,m-1); 
    }