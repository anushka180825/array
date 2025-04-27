import java.util.Scanner;

public class array_number_input_from_user {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int [] arr=new int[size];
        System.out.println("enter"+size+"element");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
