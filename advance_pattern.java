import java.util.*;
public class advance_pattern
{
    public static void main(String[] args) {
        //int n=4;

        //  pattern 10 -butterfly pattern

        // upper half
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
        // //lower half

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        //pattern 11 solid rhombus

        //int n=5;
        // for(int i=1;i<=n;i++){
        //     // for spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
                
        //     }
        //     // for stars *
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        // }
        // System.out.println();

//}

// patter 12 number pyramid

// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }

//pattern 13 number palindrome nuber triangle

int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
}
for(int j=i;j>=1;j--){
    System.out.print(j);
}
for(int j=2;j<=i;j++){
System.out.print(j);
}
System.out.println();
}
    }
}
