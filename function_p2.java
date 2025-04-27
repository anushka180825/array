//Question 2 : Write a method named isEven that accepts an int argument. The method
//should return true if the argument is even, or false otherwise. Also write a program to test your
//method.
import java.util.Scanner;

public class function_p2 {
    public static boolean iseven(int n){
        if(n%2==0){
            return true;

        }
        else {
            return false;
        }

    }
    public static void main(String args[]){
        System.out.println("enter the value of n : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(iseven(num)){
            System.out.println("is even");
        }
        else {
            System.out.println("is odd");
        }
    }
}

