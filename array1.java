import java.util.*;
public class array1
{
    // public static void main(String args[]){
    //     int[] marks = new int[3];
    //     marks[0] = 99;
    //     marks[1] = 88;
    //     marks[2] = 67;
    //     for(int i = 0; i < 3; i++)
    //     {
    //         System.out.println(marks[i]);
    //     }
    // }

    // type 2

    // public static void main(String args[]){
    //     Scanner sc= new Scanner (System.in);
    //     int size=sc.nextInt();
    //     int numbers[]= new int[size];
    //     for(int i = 0; i < size; i++)
    //     {
    //         System.out.println(numbers[i]);
    //     }
    // }

    //  Question : take an array as an input from the user. search for the given number x
    //and print the index which it occurs

    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]==x){
                System.out.println("x found at idex: "+ i); 
            }  

    }
    

}
}
