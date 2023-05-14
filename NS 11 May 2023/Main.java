// https://my.newtonschool.co/playground/code/yrw1lpbdji18
// static int firstTwo(int N){
//     while(N>99){
//         N/=10;
//     }
//     int ans = (N%10)*10 + N/10;
//     return ans;
// }

// or
// static int firstTwo(int N){
// while(N>99){
//     N=N/10;
// }
// int rev=0;
// int rem=0;
// while(N>0){
//     rem=N%10;
//     rev=(rev*10)+rem;
//     N=N/10;
// }

// return(rev);
// }


// https://my.newtonschool.co/playground/code/cb714lmsb7dq
import java.util.Scanner;

// public class Main {
//     static final long MOD = 1000000007L;

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         long product = 1;
//         for (int i = 0; i < N; i++) {
//             int num = sc.nextInt();
//             product = (product * num) % MOD;
//         }
//         System.out.println(product);
//         sc.close();
//     }
// }

// or
public class Main {
    static final long MOD = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long output = 1;
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            output = (output*num) % (MOD+7);
        }
        System.out.println(output);
        sc.close();
    }
}