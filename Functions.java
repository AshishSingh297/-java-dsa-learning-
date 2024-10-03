import java.util.*;
public class Functions
{
//     public static int calculatesum(int a,int b){
//     int sum = a + b;
//     return sum;
// }
// public static void main(String ags[])
// {
//     Scanner sc = new Scanner (System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     int sum=calculatesum(a,b);
//     System.out.println(sum);

// type 2 factorial of 2 numbers 
public static void printFactorial(int n){
    int factorial=1;

    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;

}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    printFactorial(n);

}
}
