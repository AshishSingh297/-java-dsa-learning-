import java.util.*;
public class pratice_test {
    // Question 1 : Enter 3 numbers from the user & make a function to print their average.

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     int average=(a+b+c)/3;
    //     System.out.println("The average of three numbers is: "+average);
    // }
    
    // Question 2: Write a function to print the sum of all odd numbers from 1 to n.

//     public static void printsum(int n){
//         int sum=0;
//         for (int i=1;i<=n;i++){
//             if (i%2!=0){
//                 sum=sum+i;
//         }
//     }
//     System.out.println(sum);
// }
// public static void main(String args[]){
//     Scanner sc=new Scanner (System.in);
//     int n=sc.nextInt();
//     printsum(n);
// }

// Question 3 : Write a function which takes in 2 numbers and returns the greater of those two.

// public static int getGreater(int a, int b) {
//     if(a > b) {
//         return a;
//     } else {
//         return b;
//     }
//  }
//  public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println(getGreater(a, b));
//  }   

//Question 4: Write a function that takes in the radius as input and returns the circumference of a circle.

// public static Double getCircumference(Double radius) {
//     return 2 * 3.14 * radius;
// }

// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the radius: ");
//     Double r = sc.nextDouble();
//     System.out.println("The circumference is: " + getCircumference(r));
// }

// Qquestion 5: Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public static boolean isElligible(int age) {
    if(age > 18) {
        return true;
    }
    return false;
}
public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int age = sc.nextInt();
   System.out.println(isElligible(age));
}   
}


