// class A {
//     int i;
// }

// class B extends A {
//     int i;

//     B(int a, int b) {
//         super.i = a;
//         i = b;
//     }

//     void Show() {
//         System.out.println("Super i : " + super.i);
//         System.out.println("B Class i : " + i);
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         B SupoB = new B(10, 20);
//         SupoB.Show();
//     }
// }

// class A{
//     A(){
//         System.out.println("Inside A's constructor .");
//     }
// }
// class B extends A{
//     B(){
//         System.out.println("Inside B's constructor .");
//     }
// }
// class C extends B{
//     C(){
//         System.out.println("Inside C's constructor .");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         C c=new C();
//     }
// }


class A{
    int i, j;
    A(int i,int j){
        this.i = i;
        this.j = j;
    }
    void show(){
        System.out.println("i = "+i+" and j = "+j);
    }
}
class B extends A{
    int k;
    B(int i,int j,int k){
        super(i,j);
        this.k = k;
    }
    void show(){
        System.out.println("k = "+k);
    }
}
public class Main{
	public static void main(String[] args) {
	    B objB = new B(1,2,3);
	    objB.show();
	}
}
