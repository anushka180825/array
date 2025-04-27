//Question 1 : Write a Java method to compute the average of three numbers..
import java.util.Scanner;

public class function_P1 {


    public static int averages(int x,int y,int z){
        int avrage=(x+y+z)/3;
        return avrage;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1= sc.nextInt();
        System.out.println("enter num2 : ");
        int num2= sc.nextInt();
        System.out.println("enter num3 : ");
        int num3= sc.nextInt();
        int answer=averages(num1,num2,num3);
        System.out.println(answer);

    }
}
